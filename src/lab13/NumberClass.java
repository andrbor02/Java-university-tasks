package lab13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NumberClass<T extends Number> {

    public List<T> arrToList(T[] array) {
        List<T> list = new ArrayList<>(array.length);

        for (T elem : array) {
            list.add(elem);
        }
        return list;
    }
}
