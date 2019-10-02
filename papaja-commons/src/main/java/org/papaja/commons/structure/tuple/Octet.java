package org.papaja.commons.structure.tuple;

import org.papaja.commons.structure.tuple.value.Value8;

public class Octet<A, B, C, D, E, F, G, H>
        extends Septet<A, B, C, D, E, F, G> implements Value8<A, B, C, D, E, F, G, H> {

    protected H h;

    public Octet(A a, B b, C c, D d, E e, F f, G g, H h) {
        super(a, b, c, d, e, f, g); this.h = h;
    }

    @Override
    public H getH() {
        return h;
    }

}
