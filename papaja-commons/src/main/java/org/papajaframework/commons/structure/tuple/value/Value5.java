package org.papajaframework.commons.structure.tuple.value;

import org.papajaframework.commons.structure.tuple.getter.ValueE;

public interface Value5<A, B, C, D, E> extends Value4<A, B, C, D>, ValueE<E> {
    default int size() { return 5; }
}
