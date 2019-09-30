package org.papajaframework.commons.structure.tuple.value;

import org.papajaframework.commons.structure.tuple.getter.ValueC;

public interface Value3<A, B, C> extends Value2<A, B>, ValueC<C> {
    default int size() { return 3; }
}
