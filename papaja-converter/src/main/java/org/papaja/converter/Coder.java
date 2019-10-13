package org.papaja.converter;

public interface Coder<A, B> extends Encoder<A, B>, Decoder<B, A> { }
