package org.papajaframework.commons.structure.tuple.value;

import org.papajaframework.commons.structure.tuple.getter.ValueD;

public interface Value4<A, B, C, D> extends Value3<A, B, C>, ValueD<D> {
    default int size() { return 4; }
}
