package ua.shmelov.beelog.configuration.user;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "beelog.config")
public class BeeLogProperties {
    private String customText;
    private String disableRestLogging;

    public String getCustomText() {
        return customText;
    }

    public void setCustomText(String customText) {
        this.customText = customText;
    }

    public String getDisableRestLogging() {
        return disableRestLogging;
    }

    public void setDisableRestLogging(String disableRestLogging) {
        this.disableRestLogging = disableRestLogging;
    }
}
