package org.papajaframework.commons.converter;

public interface Coder<A, B> extends Encoder<A, B>, Decoder<B, A> { }
