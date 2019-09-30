package org.papajaframework.commons.validation.constrain;

import org.papajaframework.commons.validation.Validator;

public class MinValidator implements Validator<Long> {

    private Long min;

    public MinValidator(Long min) {
        this.min = min;
    }

    @Override
    public boolean isValid(Long value) {
        return value > min;
    }

}
