package it.lbprog.matlbajsontests;

import it.lbprog.matlabjson.MatLabJsonException;
import it.lbprog.matlabjson.MatlabJsonConverter;
import org.junit.Test;

public class Tests {

    @Test
    public void testMain()
    {
        System.out.println("Main test");

        MatlabJsonConverter<Object> c=new  MatlabJsonConverter<>();
        try {
            System.out.println(c.jsonencode(null,true));
        } catch (MatLabJsonException e) {
            e.printStackTrace();
        }
    }

}
