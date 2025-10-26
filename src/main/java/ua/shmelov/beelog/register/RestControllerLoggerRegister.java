package ua.shmelov.beelog.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import ua.shmelov.beelog.aspects.LoggingAspect;
import ua.shmelov.beelog.aspects.RestControllerLoggingAspect;

public class RestControllerLoggerRegister implements ImportBeanDefinitionRegistrar, LoggerRegister {
    private static final Logger log = LoggerFactory.getLogger(RestControllerLoggerRegister.class);
    private static final String BEAN_NAME = "restControllerLoggingAspect";


    //TODO
    // Remove? Used to handling @EnableRestControllerLogging
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if (!registry.containsBeanDefinition(BEAN_NAME)) {
            log.debug("Registering Bean('restControllerLoggingAspect')...");
            RootBeanDefinition beanDefinition = new RootBeanDefinition();
            beanDefinition.setBeanClass(RestControllerLoggingAspect.class);
            beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
            beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
            registry.registerBeanDefinition(BEAN_NAME, beanDefinition);
            log.debug("Successfully registered Bean('restControllerLoggingAspect')");
        }
    }

    @Override
    public void registerLogger(LoggingAspect loggingAspect) {
        //TODO
    }
}
