package ua.shmelov.beelog.configuration.user;

public class BeeLogUserConfig {
    private final String customText;
    private final boolean restLoggingDisabled;

    public BeeLogUserConfig(String customText, boolean restLoggingDisabled) {
        this.customText = customText;
        this.restLoggingDisabled = restLoggingDisabled;
    }

    public String getCustomText() {
        return customText;
    }

    public boolean isRestLoggingDisabled() {
        return restLoggingDisabled;
    }
}
