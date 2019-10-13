package org.papaja.converter;

public interface Decoder<S, R> {
    R decode(S source);
}
