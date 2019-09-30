package org.papajaframework.commons.converter;

public interface Decoder<S, R> {
    R decode(S source);
}
