package org.papajaframework.commons.converter.coder;

import org.papajaframework.commons.converter.Coder;

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
