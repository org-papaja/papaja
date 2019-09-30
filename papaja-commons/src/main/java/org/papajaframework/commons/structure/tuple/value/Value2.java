package org.papajaframework.commons.structure.tuple.value;

import org.papajaframework.commons.structure.tuple.getter.ValueB;

public interface Value2<A, B> extends Value1<A>, ValueB<B> {
    default int size() { return 2; }
}
