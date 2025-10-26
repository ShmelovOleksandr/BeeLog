package ua.shmelov.beelog.register;

import ua.shmelov.beelog.aspects.LoggingAspect;

public interface LoggerRegister {
    void registerLogger(LoggingAspect loggingAspect);
}
