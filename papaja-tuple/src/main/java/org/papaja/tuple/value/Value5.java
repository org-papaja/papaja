package org.papaja.tuple.value;

import org.papaja.tuple.getter.ValueE;

public interface Value5<A, B, C, D, E> extends Value4<A, B, C, D>, ValueE<E> {
    default int size() { return 5; }
}
