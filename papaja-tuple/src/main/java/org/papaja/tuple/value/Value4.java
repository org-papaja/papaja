package org.papaja.tuple.value;

import org.papaja.tuple.getter.ValueD;

public interface Value4<A, B, C, D> extends Value3<A, B, C>, ValueD<D> {
    default int size() { return 4; }
}
