package org.papaja.tuple;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

import static java.lang.invoke.MethodHandles.publicLookup;
import static java.lang.invoke.MethodType.methodType;
import static java.util.Arrays.fill;

abstract public class Tuple {

    public static <T> T of(Class<T> type, Object... values) throws ClassCastException {
        T object;

        MethodHandles.Lookup lookup = publicLookup();
        Class[]              types  = new Class[values.length];

        fill(types, new Object().getClass());

        try {
            MethodHandle constructor = lookup.findConstructor(type, methodType(void.class, types));
            object = (T) constructor.invokeWithArguments(values);
        } catch (Throwable exception) {
            throw new RuntimeException(exception);
        }

        return object;
    }

}
