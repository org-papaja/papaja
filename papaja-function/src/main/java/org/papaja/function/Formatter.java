package org.papaja.function;

@FunctionalInterface
public interface Formatter<I, O>{
    O format(I input);
}
