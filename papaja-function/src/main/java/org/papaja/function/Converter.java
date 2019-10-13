package org.papaja.function;

@FunctionalInterface
public interface Converter<I, O> {
    O convert(I input);
}
