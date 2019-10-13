package org.papaja.tuple.value;

import org.papaja.tuple.getter.ValueA;

public interface Value1<A> extends Tuple, ValueA<A> {
    default int size() { return 1; }
}
