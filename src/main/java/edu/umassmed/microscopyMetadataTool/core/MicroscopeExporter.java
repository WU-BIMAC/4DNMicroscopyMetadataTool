package edu.umassmed.microscopyMetadataTool.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import edu.umassmed.microscopyMetadataTool.data.GenericElement;
import edu.umassmed.microscopyMetadataTool.data.Microscope;
import edu.umassmed.microscopyMetadataTool.data.MicroscopeComponent;

public class MicroscopeExporter {
	
	private String path;
	
	public MicroscopeExporter() {
		this.path = System.getProperty("user.dir");
		this.path += File.separator + "savedMicroscopes";
	}

	public void exportMicroscope(final Microscope microscope,
			final List<MicroscopeComponent> elements) {
		final String micName = microscope.getName() + "_" + microscope.getID();
		final Integer tier = microscope.getTier();
		final String dirPath = this.path + File.separator + micName;
		final File dir = new File(dirPath);
		if (!dir.exists()) {
			dir.mkdir();
		}
		try {
			this.exportGenericElement(dir, microscope, tier);
		} catch (final IOException ex) {
			ex.printStackTrace();
		}
		for (final MicroscopeComponent element : elements) {
			if (element.getTier() > tier) {
				continue;
			}
			try {
				this.exportGenericElement(dir, element, tier);
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	private void exportGenericElement(final File dir,
			final GenericElement element, final Integer tier)
			throws IOException {
		final String fileName = dir + File.separator + element.getName() + "_"
				+ element.getID() + ".txt";
		final File f = new File(fileName);
		final FileWriter fw = new FileWriter(f);
		final BufferedWriter bw = new BufferedWriter(fw);
		final Map<String, Map<String, String>> fields = element.getFields();
		final Map<String, Integer> fieldTier = element.getTiers();
		bw.write("component=" + element.getClass().getName() + "\n\n");
		for (final String key : fields.keySet()) {
			final Map<String, String> localFields = fields.get(key);
			if (localFields.isEmpty()) {
				continue;
			}
			bw.write("category=" + key + "\n");
			int countFields = 0;
			for (final String varName : localFields.keySet()) {
				if (fieldTier.containsKey(varName)
						&& (fieldTier.get(varName) > tier)) {
					continue;
				}
				final String varValue = localFields.get(varName);
				bw.write(varName);
				bw.write("=");
				bw.write(varValue);
				bw.write("\n");
				countFields++;
			}
			if (countFields != 0) {
				bw.write("\n");
			}
		}
		bw.close();
		fw.close();
	}
}
