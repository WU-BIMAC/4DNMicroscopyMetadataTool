package edu.umassmed.microscopyMetadataTool.generator;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class GeneratorFromJson extends GenericGenerator {
	
	@Override
	public void generateModel(final String inputPath, final String outputPath) {
		// TODO Auto-generated method stub
		final File dir = new File(inputPath);

		for (final File f : dir.listFiles()) {
			final String className = f.getName().substring(0,
					f.getName().lastIndexOf("."));
			
			final URI uri = f.toURI();
			try {
				final URL source = uri.toURL();
				GeneratorFromJson.buildJavaClass(outputPath, source, className,
						"testPackage");
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	// private static String getJsonSchema(
	// final Class<? extends MicroscopeComponent> clazz)
	// throws IOException {
	// final ObjectMapper mapper = new ObjectMapper();
	// // There are other configuration options you can set. This is the one I
	// // needed.
	// mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
	//
	// final JsonSchema schema = mapper.generateJsonSchema(clazz);
	//
	// return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(
	// schema);
	// }

	private static void buildJavaClass(final String outputPath,
			final URL source, final String className, final String classPackage)
			throws IOException {
		final JCodeModel codeModel = new JCodeModel();
		final GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() {
				return true;
			}
		};

		final SchemaMapper mapper = new SchemaMapper(new RuleFactory(config,
				new Jackson2Annotator(), new SchemaStore()),
				new SchemaGenerator());
		mapper.generate(codeModel, className, classPackage, source);

		final File dir = new File(outputPath);
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		// final String strippedClassName = className.substring(0,
		// className.lastIndexOf("."));
		// final String fileName = path + File.separator + strippedClassName
		// + ".java";
		// final FileWriter fw = new FileWriter(fileName);
		// jtype.generate(new JFormatter(fw));
		// fw.close();

		codeModel.build(dir);
	}
}
