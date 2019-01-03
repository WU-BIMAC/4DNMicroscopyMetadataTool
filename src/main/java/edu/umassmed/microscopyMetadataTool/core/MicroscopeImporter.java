package edu.umassmed.microscopyMetadataTool.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import edu.umassmed.microscopyMetadataTool.data.GenericElement;
import edu.umassmed.microscopyMetadataTool.data.Microscope;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public class MicroscopeImporter {

	public MicroscopeImporter() {
		
	}
	
	public Microscope importMicroscope(final String path,
			final List<MicroscopeComponent> elements) {
		Microscope microscope = null;
		final File dir = new File(path);
		for (final File f : dir.listFiles()) {
			try {
				final GenericElement element = this.importGenericElement(f);
				if (element instanceof Microscope) {
					microscope = (Microscope) element;
				} else {
					elements.add((MicroscopeComponent) element);
				}
			} catch (final FileNotFoundException ex) {
				ex.printStackTrace();
			} catch (final IOException ex) {
				ex.printStackTrace();
			} catch (final ClassNotFoundException ex) {
				ex.printStackTrace();
			} catch (final InstantiationException ex) {
				ex.printStackTrace();
			} catch (final IllegalAccessException ex) {
				ex.printStackTrace();
			} catch (final IllegalArgumentException ex) {
				ex.printStackTrace();
			} catch (final InvocationTargetException ex) {
				ex.printStackTrace();
			} catch (final NoSuchMethodException ex) {
				ex.printStackTrace();
			} catch (final SecurityException ex) {
				ex.printStackTrace();
			}
		}
		return microscope;
	}

	public GenericElement importGenericElement(final File f)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		GenericElement element = null;
		final FileReader fr = new FileReader(f);
		final BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		final Map<String, Map<String, String>> categorizedFields = new LinkedHashMap<String, Map<String, String>>();
		Map<String, String> fields = null;
		Class<?> clazz = null;
		String posX = null, posY = null;
		while (line != null) {
			if (line.isEmpty()) {
				line = br.readLine();
				continue;
			}
			final String[] tokens = line.split("=");
			final String key = tokens[0];
			final String value = tokens[1];
			if (key.equals("component")) {
				// final String className =
				// "edu.umassmed.microscopyMetadataTool.data."
				// + value;
				final String className = value;
				clazz = Class.forName(className);
			} else if (key.equals("category")) {
				final String category = value;
				fields = new LinkedHashMap<String, String>();
				categorizedFields.put(category, fields);
			} else if (key.equals("positionX")) {
				posX = value;
			} else if (key.equals("positionY")) {
				posY = value;
			} else {
				if (fields != null) {
					fields.put(key, value);
				}
			}
			line = br.readLine();
		}
		if (clazz.equals(Microscope.class)) {
			element = (GenericElement) clazz.getConstructor(new Class[] {})
					.newInstance();
		} else {
			// final Integer positionX = Integer.valueOf(posX);
			// final Integer positionY = Integer.valueOf(posY);
			// element = (GraphicElement) clazz.getConstructor(
			// new Class[] { Integer.class, Integer.class }).newInstance(
			// positionX, positionY);
			final Double positionX = Double.valueOf(posX);
			final Double positionY = Double.valueOf(posY);
			element = (MicroscopeComponent) clazz.getConstructor(
					new Class[] { Double.class, Double.class }).newInstance(
					positionX, positionY);
		}
		if (element != null) {
			element.setFields(categorizedFields);
		}
		br.close();
		fr.close();
		return element;
	}
}
