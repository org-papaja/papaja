package org.papaja.tuple;

import org.papaja.tuple.value.Value9;

public class Ennead<A, B, C, D, E, F, G, H, I>
        extends Octet<A, B, C, D, E, F, G, H> implements Value9<A, B, C, D, E, F, G, H, I> {

    protected I i;

    public Ennead(A a, B b, C c, D d, E e, F f, G g, H h, I i) {
        super(a, b, c, d, e, f, g, h); this.i = i;
    }

    @Override
    public I getI() {
        return i;
    }

}
