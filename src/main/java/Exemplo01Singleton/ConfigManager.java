package Exemplo01Singleton;

import java.io.InputStream;
import java.io.ObjectInputFilter;
import java.util.Properties;

public class ConfigManager {
    private static final ConfigManager instance = new ConfigManager();
    private Properties properties;


    private ConfigManager() {
        this.properties = new Properties();
        try (InputStream input = getClass().getResourceAsStream("./config.Properties")) {
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar as configurações", e);
        }
    }

    public static ConfigManager getInstance(){
        return instance;
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

}
