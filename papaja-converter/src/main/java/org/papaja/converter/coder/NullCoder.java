package org.papaja.converter.coder;

import org.papaja.converter.Coder;

public class NullCoder implements Coder<Object, Object> {

    @Override
    public Object decode(Object source) {
        return source;
    }

    @Override
    public Object encode(Object source) {
        return source;
    }

}
