package mtg.statistics.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class MatchSettings {
    private String saveDataDirectory;
    private String defaultMatchName;

    public String getSaveDataDirectory() {
        return saveDataDirectory;
    }

    public void setSaveDataDirectory(String saveDataDirectory) {
        this.saveDataDirectory = saveDataDirectory;
    }

    public String getDefaultMatchName() {
        return defaultMatchName;
    }

    public void setDefaultMatchName(String defaultMatchName) {
        this.defaultMatchName = defaultMatchName;
    }
}