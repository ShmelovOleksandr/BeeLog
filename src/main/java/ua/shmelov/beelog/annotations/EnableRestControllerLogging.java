package ua.shmelov.beelog.annotations;

import org.springframework.context.annotation.Import;
import ua.shmelov.beelog.register.RestControllerLoggerRegister;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(RestControllerLoggerRegister.class)
public @interface EnableRestControllerLogging {
}
