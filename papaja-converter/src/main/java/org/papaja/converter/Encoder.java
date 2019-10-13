package org.papaja.converter;

public interface Encoder<S, R> {
    R encode(S source);
}
