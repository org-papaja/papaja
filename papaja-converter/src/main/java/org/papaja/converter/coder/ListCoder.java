package org.papaja.converter.coder;

import java.util.List;

public class ListCoder extends ArrayJsonCoder<List> {

    @Override
    public Class<List> getArrayClass() {
        return List.class;
    }

}
