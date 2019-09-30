package org.papajaframework.commons.structure.tuple;

import org.papajaframework.commons.structure.tuple.value.Value1;

public class Unit<A> implements Value1<A> {

    protected A a;

    public Unit(A a) {
        this.a = a;
    }

    @Override
    public A getA() {
        return a;
    }

}
