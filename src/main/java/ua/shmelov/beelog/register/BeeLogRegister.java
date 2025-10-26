package ua.shmelov.beelog.register;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class BeeLogRegister {
    private final Set<LoggerRegister> aspects;

    public BeeLogRegister(LoggerRegister... aspects) {
        this.aspects = Arrays.stream(aspects).collect(Collectors.toSet());
    }
}
