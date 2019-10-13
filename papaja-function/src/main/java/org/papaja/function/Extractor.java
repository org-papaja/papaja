package org.papaja.function;

@FunctionalInterface
public interface Extractor<S, K, R> {
    R get(S source, K key);
}
