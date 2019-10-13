package org.papaja.tuple.value;

import org.papaja.tuple.getter.ValueJ;

public interface Value10<A, B, C, D, E, F, G, H, I, J> extends Value9<A, B, C, D, E, F, G, H, I>, ValueJ<J> {
    default int size() { return 10; }
}
