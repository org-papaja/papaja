package org.papaja.tuple.value;

import org.papaja.tuple.getter.ValueG;

public interface Value7<A, B, C, D, E, F, G> extends Value6<A, B, C, D, E, F>, ValueG<G> {
    default int size() { return 7; }
}
