package dptablo.spring.configuration;

import java.io.InputStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import dptablo.spring.configuration.yml.SettingsConfig;

@Configuration
@ComponentScan(basePackages = "dptablo.springboot_react")
public class MainConfiguration {
    @Bean
    public SettingsConfig settingsConfig() { 
        Yaml yaml = new Yaml(new Constructor(SettingsConfig.class));
        InputStream inputStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream("settings.yml");

        SettingsConfig settingsConfig = yaml.load(inputStream);
        return settingsConfig;
    }
}