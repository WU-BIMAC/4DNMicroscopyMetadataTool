package edu.umassmed.microscopyMetadataTool.generator;

import java.io.File;
import java.io.IOException;

import org.xml.sax.InputSource;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.SchemaCompiler;
import com.sun.tools.xjc.api.XJC;

public class GeneratorFromXsd extends GenericGenerator {
	
	@Override
	public void generateModel(final String inputPath, final String outputPath) {
		final File dir = new File(inputPath);

		// Setup schema compiler
		final SchemaCompiler sc = XJC.createSchemaCompiler();
		sc.forcePackageName("testPackage");

		for (final File f : dir.listFiles()) {
			// final String className = f.getName().substring(0,
			// f.getName().lastIndexOf("."));
			// Setup SAX InputSource
			final InputSource is = new InputSource(f.toURI().toString());

			// Parse & build
			sc.parseSchema(is);
			final S2JJAXBModel model = sc.bind();
			final JCodeModel jCodeModel = model.generateCode(null, null);

			try {
				jCodeModel.build(new File(outputPath));
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
