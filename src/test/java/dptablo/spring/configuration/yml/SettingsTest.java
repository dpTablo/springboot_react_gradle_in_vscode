package dptablo.spring.configuration.yml;

import static org.junit.Assert.assertNotNull;

import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SettingsTest {
    @Test
    public void test() { 
        Yaml yaml = new Yaml(new Constructor(SettingsConfig.class));
        InputStream inputStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream("settings.yml");

        SettingsConfig settingsConfig = yaml.load(inputStream);
        assertNotNull(settingsConfig);
    }
}