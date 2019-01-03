package edu.umassmed.microscopyMetadataTool.data;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import edu.umassmed.microscopyMetadataTool.core.ClassUtils;
import edu.umassmed.microscopyMetadataTool.data.subElements.ComponentSubElement;

public abstract class GenericElement {
	
	private final String id;
	private final String name;

	private Integer tier;
	
	private final String manufacturer;
	private final String model;
	private final String serialNumber;
	private final String lotNumber;
	private final String specsFile;

	public GenericElement(final String name, final Integer tier) {
		this.id = UUID.randomUUID().toString();
		this.name = name;

		this.tier = tier;

		this.manufacturer = "manufacturer";
		this.model = "model";
		this.serialNumber = "serialNumber";
		this.lotNumber = "lotNumber";
		this.specsFile = "specsFile";
	}

	public String getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getTier() {
		return this.tier;
	}

	public void setTier(final Integer tier) {
		this.tier = tier;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getModel() {
		return this.model;
	}
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	
	public String getLotNumber() {
		return this.lotNumber;
	}
	
	public String getSpecsFile() {
		return this.specsFile;
	}
	
	public Map<String, Map<String, String>> getFields() {
		final List<Class<? extends ComponentSubElement>> subElementsClasses = ClassUtils
				.getAllSubElementsClasses();
		final List<Class<? extends MicroscopeComponent>> componentClasses = ClassUtils
				.getAllComponentsClasses();
		final Map<String, Map<String, String>> fieldsMap = new LinkedHashMap<String, Map<String, String>>();
		Class<?> currentClass = this.getClass();
		while (currentClass.getSuperclass() != null) {
			final Field[] fields = currentClass.getDeclaredFields();
			final Map<String, Map<String, String>> classFieldsMap = this
					.collectFilteredFields(currentClass.getSimpleName(),
							fields, this, subElementsClasses, componentClasses);
			fieldsMap.putAll(classFieldsMap);
			currentClass = currentClass.getSuperclass();
		}
		final List<String> reversedKeys = new ArrayList<String>(
				fieldsMap.keySet());
		Collections.reverse(reversedKeys);
		final Map<String, Map<String, String>> reversedFieldsMap = new LinkedHashMap<String, Map<String, String>>();
		for (final String key : reversedKeys) {
			reversedFieldsMap.put(key, fieldsMap.get(key));
		}
		return reversedFieldsMap;
	}

	private Map<String, Map<String, String>> collectFilteredFields(
			final Object obj,
			final List<Class<? extends ComponentSubElement>> subElementsClasses,
			final List<Class<? extends MicroscopeComponent>> componentClasses) {
		Map<String, Map<String, String>> classFieldsMap = new LinkedHashMap<String, Map<String, String>>();
		Class<?> currentClass = obj.getClass();
		while (currentClass.getSuperclass() != null) {
			if (currentClass != MicroscopeComponent.class) {
				final Field[] fields = currentClass.getDeclaredFields();
				final Map<String, Map<String, String>> localClassFieldsMap = this
						.collectFilteredFields(obj.getClass().getSimpleName(),
								fields, obj, subElementsClasses,
								componentClasses);
				for (final String key : localClassFieldsMap.keySet()) {
					if (classFieldsMap.containsKey(key)) {
						final Map<String, String> previousMap = classFieldsMap
								.get(key);
						localClassFieldsMap.get(key).putAll(previousMap);
					}
				}
				classFieldsMap = localClassFieldsMap;
			}
			currentClass = currentClass.getSuperclass();
		}
		return classFieldsMap;
	}
	
	private Map<String, Map<String, String>> collectFilteredFields(
			final String className,
			final Field[] fields,
			final Object obj,
			final List<Class<? extends ComponentSubElement>> subElementsClasses,
			final List<Class<? extends MicroscopeComponent>> componentClasses) {
		final Map<String, Map<String, String>> classFieldsMap = new LinkedHashMap<String, Map<String, String>>();
		final Map<String, String> localClassFieldsMap = new LinkedHashMap<String, String>();
		for (final Field field : fields) {
			final int modifiers = field.getModifiers();
			if (Modifier.isStatic(modifiers)) {
				continue;
			}
			if (subElementsClasses.contains(field.getType())
					|| componentClasses.contains(field.getType())) {
				final Field[] subFields = field.getType().getDeclaredFields();
				field.setAccessible(true);
				Object value = null;
				try {
					value = field.get(obj);
				} catch (final IllegalArgumentException ex) {
					ex.printStackTrace();
				} catch (final IllegalAccessException ex) {
					ex.printStackTrace();
				}
				field.setAccessible(false);
				if (subElementsClasses.contains(field.getType())) {
					final Map<String, Map<String, String>> subClassFieldsMap = this
							.collectFilteredFields(className, subFields, value,
									subElementsClasses, componentClasses);
					localClassFieldsMap
							.putAll(subClassFieldsMap.get(className));
				} else {
					final Map<String, Map<String, String>> subClassFieldsMap = this
							.collectFilteredFields(value, subElementsClasses,
									componentClasses);
					for (final String key : subClassFieldsMap.keySet()) {
						if (key.equals(className)) {
							localClassFieldsMap.putAll(subClassFieldsMap
									.get(key));
						} else {
							classFieldsMap.put(key, subClassFieldsMap.get(key));
						}
					}
				}
				continue;
			}
			field.setAccessible(true);
			final String fieldName = field.getName();
			Object value = null;
			try {
				value = field.get(obj);
			} catch (final IllegalArgumentException ex) {
				ex.printStackTrace();
			} catch (final IllegalAccessException ex) {
				ex.printStackTrace();
			}
			if (value != null) {
				final String val = String.valueOf(value);
				localClassFieldsMap.put(fieldName, val);
			}
			field.setAccessible(false);
		}
		
		classFieldsMap.put(className, localClassFieldsMap);
		return classFieldsMap;
	}
	
	public void setFields(final Map<String, Map<String, String>> fieldValues) {
		final List<Class<? extends ComponentSubElement>> subElementsClasses = ClassUtils
				.getAllSubElementsClasses();
		final List<Class<? extends MicroscopeComponent>> componentClasses = ClassUtils
				.getAllComponentsClasses();
		Class<?> currentClass = this.getClass();
		while (currentClass.getSuperclass() != null) {
			try {
				this.setFields(currentClass, this,
						currentClass.getSimpleName(), fieldValues,
						subElementsClasses, componentClasses);
			} catch (final IllegalArgumentException ex) {
				ex.printStackTrace();
			} catch (final IllegalAccessException ex) {
				ex.printStackTrace();
			} catch (final NoSuchFieldException ex) {
				ex.printStackTrace();
			} catch (final SecurityException ex) {
				ex.printStackTrace();
			}
			currentClass = currentClass.getSuperclass();
		}
	}

	private void setFields(
			final Object obj,
			final Map<String, Map<String, String>> fieldValues,
			final List<Class<? extends ComponentSubElement>> subElementsClasses,
			final List<Class<? extends MicroscopeComponent>> componentClasses)
			throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException {
		final String category = obj.getClass().getSimpleName();
		Class<?> currentClass = obj.getClass();
		while (currentClass.getSuperclass() != null) {
			this.setFields(currentClass, obj, category, fieldValues,
					subElementsClasses, componentClasses);
			currentClass = currentClass.getSuperclass();
		}
	}
	
	private void setFields(
			final Class<?> clazz,
			final Object obj,
			final String category,
			final Map<String, Map<String, String>> fieldValues,
			final List<Class<? extends ComponentSubElement>> subElementsClasses,
			final List<Class<? extends MicroscopeComponent>> componentClasses)
			throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException {
		final Field[] fields = clazz.getDeclaredFields();
		final Map<String, String> innerFields = fieldValues.get(category);
		for (final Field field : fields) {
			final int modifiers = field.getModifiers();
			if (Modifier.isStatic(modifiers)) {
				continue;
			}
			if (subElementsClasses.contains(field.getType())
					|| componentClasses.contains(field.getType())) {
				field.setAccessible(true);
				final Object subObj = field.get(obj);
				field.setAccessible(false);
				if (subElementsClasses.contains(field.getType())) {
					this.setFields(field.getType(), subObj, category,
							fieldValues, subElementsClasses, componentClasses);
				} else {
					this.setFields(subObj, fieldValues, subElementsClasses,
							componentClasses);
				}
				continue;
			}
			final String key = field.getName();
			final String value = innerFields.get(key);
			if (value != null) {
				this.setField(clazz, obj, key, value);
			}
		}
	}
	
	private void setField(final Class<?> clazz, final Object obj,
			final String key, final String value)
			throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException {
		final Field field = clazz.getDeclaredField(key);
		field.setAccessible(true);
		if (field.getType().equals(Integer.class)) {
			field.set(obj, Integer.valueOf(value));
		} else if (field.getType().equals(Double.class)) {
			field.set(obj, Double.valueOf(value));
		} else {
			field.set(obj, value);
		}
		field.setAccessible(false);
	}

	public List<String> getNotEditableFields() {
		final List<String> notEditableField = new ArrayList<String>();
		notEditableField.add("id");
		notEditableField.add("tier");
		return notEditableField;
	}
	
	public Map<String, Integer> getTiers() {
		final Map<String, Integer> tiers = new LinkedHashMap<String, Integer>();
		tiers.put("name", this.getTier());
		tiers.put("id", this.getTier());
		tiers.put("tier", this.getTier());
		tiers.put("manufacturer", this.getTier());
		tiers.put("model", this.getTier());
		tiers.put("serialNumber", 5);
		tiers.put("lotNumber", 5);
		tiers.put("specsFile", 5);
		return tiers;
	}
}
