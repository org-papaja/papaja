package org.papaja.tuple.value;

import org.papaja.tuple.getter.ValueI;

public interface Value9<A, B, C, D, E, F, G, H, I> extends Value8<A, B, C, D, E, F, G, H>, ValueI<I> {
    default int size() { return 9; }
}
