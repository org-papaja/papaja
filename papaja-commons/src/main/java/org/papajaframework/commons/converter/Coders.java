package org.papajaframework.commons.converter;

import org.papajaframework.commons.function.Provider;
import org.papajaframework.commons.converter.coder.PipeCoder;

import java.util.EnumMap;
import java.util.Map;

public enum Coders implements Provider<Format, Coder> {

    INSTANCE;

    private static final Map<Format, Coder> CODERS = new EnumMap<>(Format.class);

    static {
        CODERS.put(Format.BASE64, Format.BASE64.getCoder());
        CODERS.put(Format.JAVA_DATE, PipeCoder.of(Format.JAVA_DATE.getCoder(), Format.STRING.getCoder()));
        CODERS.put(Format.RAW, Format.RAW.getCoder());
        CODERS.put(Format.STRING, Format.STRING.getCoder());
        CODERS.put(Format.MAP, Format.MAP.getCoder());
        CODERS.put(Format.LIST, Format.LIST.getCoder());
    }

    @Override
    public Coder get(Format format) {
        return CODERS.containsKey(format) ? CODERS.get(format) : Format.RAW.getCoder();
    }

}
