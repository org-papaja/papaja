package org.papajaframework.commons.function;

@FunctionalInterface
public interface Provider<K, R> {
    R get(K key);
}
