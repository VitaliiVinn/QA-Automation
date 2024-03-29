package com.hillel.util.core;

import java.io.IOException;
import java.util.Properties;

public final class ConfigProvider {
    private static final String CONFIG_PATH = "config.properties";
    private static final Properties prop = InitProperties();
    public static final String BROWSER = prop.getProperty("browser");
    public static final String BASE_URL = prop.getProperty("base.url");
    public static final String BASE_API_URL = prop.getProperty("base.api.url");
    public static final String PORT = prop.getProperty("port");
    public static final String PATH = prop.getProperty("path");

    private ConfigProvider(){}

    private static Properties InitProperties(){
        Properties properties = new Properties();

        try {
            properties.load(ClassLoader.getSystemResourceAsStream(CONFIG_PATH));
        } catch (IOException e) {
            throw new RuntimeException("Could not load property file");
        }
        return properties;
    }
}

