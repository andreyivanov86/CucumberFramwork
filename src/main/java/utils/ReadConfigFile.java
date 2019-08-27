package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
	protected InputStream input = null;
	protected Properties props = null;

	public ReadConfigFile() {
		try {
			input = ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.CONFIG_PROPERTIES_DIRECTORY);
			props = new Properties();
			props.load(input);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		if (props.getProperty("browser") == null) {
			return "";
		}
		return props.getProperty("browser");
	}
}
