package ua.shmelov.beelog.annotations;

import org.springframework.context.annotation.Import;
import ua.shmelov.beelog.registrar.RestControllerLoggingRegistrar;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(RestControllerLoggingRegistrar.class)
public @interface EnableRestControllerLogging {
}
