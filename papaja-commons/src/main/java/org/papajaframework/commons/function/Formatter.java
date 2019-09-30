package org.papajaframework.commons.function;

@FunctionalInterface
public interface Formatter<I, O>{
    O format(I input);
}
