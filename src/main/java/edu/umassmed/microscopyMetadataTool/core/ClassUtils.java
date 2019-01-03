package edu.umassmed.microscopyMetadataTool.core;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

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
		} catch (final URISyntaxException ex) {
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
		} catch (final URISyntaxException ex) {
			ex.printStackTrace();
		}
		return new ArrayList<Class<? extends MicroscopeComponent>>();
	}

	private static <T> List<Class<? extends T>> getClasses(
			final String packageName, final Class<T> superClass,
			final List<String> subDirExclusions) throws ClassNotFoundException,
			IOException, URISyntaxException {
		
		final String path = packageName.replace('.', '/');
		final List<File> files = ClassUtils.getResourcesInPath(path);
		final List<Class<? extends T>> classes = new ArrayList<Class<? extends T>>();
		for (final File file : files) {
			classes.addAll(ClassUtils.findClasses(file, packageName,
					superClass, subDirExclusions));
		}
		return classes;
	}

	private static List<File> getResourcesInPath(final String path)
			throws URISyntaxException, IOException {
		final List<File> files = new ArrayList<File>();
		final ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		if (classLoader == null)
			return files;
		final URI uri = classLoader.getResource(path).toURI();
		Path filePath;
		FileSystem fileSystem = null;
		if (uri.getScheme().equals("jar")) {
			fileSystem = FileSystems.newFileSystem(uri,
					Collections.<String, Object> emptyMap());
			filePath = fileSystem.getPath(path);
		} else {
			filePath = Paths.get(uri);
		}
		final Stream<Path> walk = Files.walk(filePath);
		for (final Iterator<Path> it = walk.iterator(); it.hasNext();) {
			final Path thisPath = it.next();
			files.add(new File(thisPath.toString()));
		}
		walk.close();
		if (fileSystem != null) {
			fileSystem.close();
		}
		return files;
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
	private static <T> List<Class<? extends T>> findClasses(final File file,
			final String packageName, final Class<T> superClass,
			final List<String> subDirExclusions) throws ClassNotFoundException {
		final List<Class<? extends T>> classes = new ArrayList<Class<? extends T>>();
		// if (!directory.exists())
		// return classes;
		// final File[] files = directory.listFiles();
		// for (final File file : files) {
		// if (file.isDirectory() && !subDirExclusions.contains(file.getName()))
		// {
		// assert !file.getName().contains(".");
		// final File[] files = file.listFiles();
		// for (final File f : files) {
		// classes.addAll(ClassUtils.findClasses(f, packageName + "."
		// + file.getName(), superClass, subDirExclusions));
		// }
		// } else
		if (file.getName().endsWith(".class")) {
			final String fileNameReplaced = file.getAbsolutePath().replace(
					File.separatorChar, '.');
			final int beginIndex = fileNameReplaced.indexOf(packageName);
			String className = fileNameReplaced.substring(beginIndex);
			className = className.substring(0, className.length() - 6);
			final Class<?> clazz = Class.forName(className);
			try {
				final Class<? extends T> subClass = clazz
						.asSubclass(superClass);
				final int modifiers = clazz.getModifiers();
				if (!Modifier.isAbstract(modifiers)) {
					classes.add(subClass);
				}
			} catch (final ClassCastException ex) {
				// DO NOTHING
			}
		}
		// }
		return classes;
	}
}
