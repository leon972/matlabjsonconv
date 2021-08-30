package it.lbprog.matlabjson;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.mathworks.com/help/mps/restfuljson/json-representation-of-matlab-data-types.html
 *
 * @param <T>
 */
public class MatlabJsonConverter<T> {

    public static enum MatLabType {
        uint8("uint8"),
        int32("int32"),
        uint64("uint64"),
        struct("struct"),
        datetime("datetime"),
        single("single"),
        int16("int16"),
        uint32("uint32"),
        logical("logical"),
        cell("cell"),
        int8("int8"),
        uint16("uint16"),
        int64("int64"),
        t_char("char"),
        t_string("string"),
        t_double("double");

        private final String value;

        MatLabType(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return this.value;
        }
    }

    public String jsonencode(T object, boolean prettyPrint) throws MatLabJsonException {

        List<Double> temp = new ArrayList<>();
        temp.add(9.88);
        temp.add(1.0);
        temp.add(-122.0);
        NumberField f = new NumberField(MatLabType.t_double, temp);
        final ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(f);
        } catch (JsonProcessingException e) {
            throw new MatLabJsonException(e.getMessage(), e);
        }


    }

}
