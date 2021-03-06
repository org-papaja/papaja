package org.papaja.tuple;

import org.papaja.tuple.value.Value3;

public class Triplet<A, B, C> extends
        Pair<A, B> implements Value3<A, B, C> {

    protected C c;

    public Triplet(A a, B b, C c) {
        super(a, b); this.c = c;
    }

    @Override
    public C getC() {
        return c;
    }

}
