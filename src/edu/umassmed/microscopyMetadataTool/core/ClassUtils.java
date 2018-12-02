package edu.umassmed.microscopyMetadataTool.core;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;
import edu.umassmed.microscopyMetadataTool.data.subElements.ComponentSubElement;

public class ClassUtils {
	
	public static List<Class<? extends ComponentSubElement>> getAllSubElementsClasses() {
		final String packageName = "edu.umassmed.microscopyMetadataTool.data.subElements";
		final Class<ComponentSubElement> superClass = ComponentSubElement.class;
		final List<String> subDirExclusions = new ArrayList<String>();
		// subDirExclusions.add("nonComponents");
		try {
			return ClassUtils.getClasses(packageName, superClass,
					subDirExclusions);
		} catch (final ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (final IOException ex) {
			ex.printStackTrace();
		}
		return new ArrayList<Class<? extends ComponentSubElement>>();
	}
	
	public static List<Class<? extends MicroscopeComponent>> getAllComponentsClasses() {
		final String packageName = "edu.umassmed.microscopyMetadataTool.data";
		final Class<MicroscopeComponent> superClass = MicroscopeComponent.class;
		final List<String> subDirExclusions = new ArrayList<String>();
		// subDirExclusions.add("nonComponents");
		try {
			return ClassUtils.getClasses(packageName, superClass,
					subDirExclusions);
		} catch (final ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (final IOException ex) {
			ex.printStackTrace();
		}
		return new ArrayList<Class<? extends MicroscopeComponent>>();
	}
	
	private static <T> List<Class<? extends T>> getClasses(
			final String packageName, final Class<T> superClass,
			final List<String> subDirExclusions) throws ClassNotFoundException,
			IOException {
		final ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		assert classLoader != null;
		final String path = packageName.replace('.', '/');
		final Enumeration<URL> resources = classLoader.getResources(path);
		final List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			final URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		final List<Class<? extends T>> classes = new ArrayList<Class<? extends T>>();
		for (final File directory : dirs) {
			classes.addAll(ClassUtils.findClasses(directory, packageName,
					superClass, subDirExclusions));
		}
		return classes;
	}

	/**
	 * Recursive method used to find all classes in a given directory and
	 * subdirs.
	 *
	 * @param <T>
	 *
	 * @param directory
	 *            The base directory
	 * @param packageName
	 *            The package name for classes found inside the base directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */
	private static <T> List<Class<? extends T>> findClasses(
			final File directory, final String packageName,
			final Class<T> superClass, final List<String> subDirExclusions)
			throws ClassNotFoundException {
		final List<Class<? extends T>> classes = new ArrayList<Class<? extends T>>();
		if (!directory.exists())
			return classes;
		final File[] files = directory.listFiles();
		for (final File file : files) {
			if (file.isDirectory()
					&& !subDirExclusions.contains(file.getName())) {
				assert !file.getName().contains(".");
				classes.addAll(ClassUtils.findClasses(file, packageName + "."
						+ file.getName(), superClass, subDirExclusions));
			} else if (file.getName().endsWith(".class")) {
				final Class<?> clazz = Class.forName(packageName
						+ '.'
						+ file.getName().substring(0,
								file.getName().length() - 6));
				try {
					final Class<? extends T> subClass = clazz
							.asSubclass(superClass);
					final int modifiers = clazz.getModifiers();
					if (Modifier.isAbstract(modifiers)) {
						continue;
					}
					classes.add(subClass);
				} catch (final ClassCastException ex) {
					
				}
			}
		}
		return classes;
	}
}
