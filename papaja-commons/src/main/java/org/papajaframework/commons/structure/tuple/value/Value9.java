package org.papajaframework.commons.structure.tuple.value;

import org.papajaframework.commons.structure.tuple.getter.ValueI;

public interface Value9<A, B, C, D, E, F, G, H, I> extends Value8<A, B, C, D, E, F, G, H>, ValueI<I> {
    default int size() { return 9; }
}
