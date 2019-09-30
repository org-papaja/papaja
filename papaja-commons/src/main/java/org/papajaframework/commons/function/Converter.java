package org.papajaframework.commons.function;

@FunctionalInterface
public interface Converter<I, O> {
    O convert(I input);
}
