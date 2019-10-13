package org.papaja.function;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}
