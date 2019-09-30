package org.papajaframework.commons.converter;

import org.papajaframework.commons.converter.coder.*;

public enum Format {

    RAW(new NullCoder()),
    BASE64(new Base64Reverse()),
    LIST(new ListCoder()),
    MAP(new MapCoder()),
    JAVA_DATE(new JavaDateCoder()),
    STRING(new StringCoder());

    private Coder coder;

    Format(Coder coder) {
        this.coder = coder;
    }

    public Coder getCoder() {
        return coder;
    }

    public Format get(String name) {
        return valueOf(name);
    }

}
