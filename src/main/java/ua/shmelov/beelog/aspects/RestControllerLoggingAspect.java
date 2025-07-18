package ua.shmelov.beelog.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class RestControllerLoggingAspect {
    private static final Logger log = LoggerFactory.getLogger(RestControllerLoggingAspect.class);

    @Around("@within(org.springframework.web.bind.annotation.RestController)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("hello");
        Object response = joinPoint.proceed();
        log.info("bye");

        return response;
    }
}
