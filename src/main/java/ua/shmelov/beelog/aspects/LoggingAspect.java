package ua.shmelov.beelog.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public interface LoggingAspect {
    Object log(ProceedingJoinPoint joinPoint) throws Throwable;
}
