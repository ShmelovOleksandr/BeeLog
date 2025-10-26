package ua.shmelov.beelog.configuration.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.shmelov.beelog.register.BeeLogRegister;
import ua.shmelov.beelog.configuration.user.BeeLogProperties;
import ua.shmelov.beelog.configuration.user.BeeLogUserConfig;
import ua.shmelov.beelog.register.RestControllerLoggerRegister;

@Configuration
@ConditionalOnClass(BeeLogRegister.class)
@EnableConfigurationProperties(BeeLogProperties.class)
public class BeeLogAutoConfiguration {
    private final BeeLogProperties beeLogProperties;
    private BeeLogUserConfig userConfig;

    @Autowired
    public BeeLogAutoConfiguration(BeeLogProperties beeLogProperties) {
        this.beeLogProperties = beeLogProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public BeeLogUserConfig beeLogUserConfig() {
        if (userConfig == null)
            this.userConfig = new BeeLogUserConfig(
                    beeLogProperties.getCustomText(),
                    Boolean.parseBoolean(beeLogProperties.getDisableRestLogging())
            );

        return userConfig;
    }

    @Bean
    public BeeLogRegister beeLogAspect() {
        return new BeeLogRegister(
                beeLogUserConfig().isRestLoggingDisabled() ? new RestControllerLoggerRegister() : null
        );
    }
}
