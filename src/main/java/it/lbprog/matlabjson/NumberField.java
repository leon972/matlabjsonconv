package it.lbprog.matlabjson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class NumberField extends BaseField<Double> implements Serializable {

    public NumberField(MatlabJsonConverter.MatLabType type, List<Double> values,List<Integer> dimensions)
    {
        this.init(type,values,dimensions);
    }

    public NumberField(MatlabJsonConverter.MatLabType type, List<Double> values)
    {
        this(type,values,null);
    }

    public NumberField(MatlabJsonConverter.MatLabType type,double value)
    {
        final List<Double> lst=new ArrayList<>();
        lst.add(value);
        init(type,lst,null);
    }

}
