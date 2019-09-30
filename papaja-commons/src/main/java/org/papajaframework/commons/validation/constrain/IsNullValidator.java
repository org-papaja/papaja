package org.papajaframework.commons.validation.constrain;

import org.papajaframework.commons.validation.Validator;

import java.util.Objects;

public class IsNullValidator implements Validator {

    public boolean isValid(Object value) {
        return Objects.isNull(value);
    }

}
