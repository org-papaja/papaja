package org.papaja.tuple.value;

import org.papaja.tuple.getter.ValueF;

public interface Value6<A, B, C, D, E, F> extends Value5<A, B, C, D, E>, ValueF<F> {
    default int size() { return 6; }
}
