package org.papaja.tuple.value;

import org.papaja.tuple.getter.ValueB;

public interface Value2<A, B> extends Value1<A>, ValueB<B> {
    default int size() { return 2; }
}
