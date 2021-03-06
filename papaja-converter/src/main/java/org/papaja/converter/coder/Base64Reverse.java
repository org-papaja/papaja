package org.papaja.converter.coder;

import org.papaja.converter.Coder;

public class Base64Reverse implements Coder<String, String> {

    @Override
    public String encode(String source) {
        return new String(new Base64Coder().decode(source));
    }

    @Override
    public String decode(String source) {
        return new Base64Coder().encode(source);
    }

}
