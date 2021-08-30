package it.lbprog.matlabjson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumberField extends BaseField<Double> implements Serializable {

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

    private final void init(MatlabJsonConverter.MatLabType type, List<Double> values,List<Integer> dimensions)
    {
        super.setMwtype(type);
        super.setMwdata(values);
        if (dimensions!=null)
        {
            super.setSize(dimensions);
        }
    }

}
