package com.royE.ShapeUp.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	public static final String CONFIG_FILE = "config.properties";

	public static String storageType = "memory";
	public static Integer algoCycle = 2;
	public static Integer loggerInterval = 3;

	public static void loadProperties() throws IOException {

		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties prop = new Properties();
		try (InputStream resourceStream = loader.getResourceAsStream(CONFIG_FILE)) {
			prop.load(resourceStream);
		}

		storageType = prop.getProperty("storageType");
		algoCycle = Integer.parseInt(prop.getProperty("algoCycle"));
		loggerInterval = Integer.parseInt(prop.getProperty("loggerInterval"));
	}
}