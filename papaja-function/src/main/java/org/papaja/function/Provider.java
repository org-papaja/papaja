package org.papaja.function;

@FunctionalInterface
public interface Provider<K, R> {
    R get(K key);
}
