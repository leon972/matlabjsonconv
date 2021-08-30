package it.lbprog.matlabjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BaseField<T> {

    public List<T> getMwdata() {
        return mwdata;
    }

    public void setMwdata(List<T> mwdata) {
        if (mwdata==null)
        {
            mwdata=new ArrayList<T>();
        }
        this.mwdata = mwdata;
        List<Integer> dims=new ArrayList<>();
        dims.add(1);
        dims.add(mwdata.size());
        this.setSize(dims);
    }

    public List<Integer> getMwsize() {
        return mwsize;
    }

    public void setMwsize(List<Integer> mwsize) {
        this.mwsize = mwsize;
    }

    public MatlabJsonConverter.MatLabType getMwtype() {
        return mwtype;
    }

    public void setMwtype(MatlabJsonConverter.MatLabType mwtype) {
        this.mwtype = mwtype;
    }

    private List<T> mwdata;
    private List<Integer> mwsize;
    private MatlabJsonConverter.MatLabType mwtype;

    protected void setSize(List<Integer> dimensions)
    {
        this.mwsize=new ArrayList<Integer>(dimensions.size());
        for (Integer l:dimensions)
        {
            this.mwsize.add(l);
        }
    }

    public BaseField()
    {

    }
}
