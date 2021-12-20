package lab13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberClass<Integer> ints = new NumberClass<>();// 1
        Integer[] intArr = {0, 5, 6};
        System.out.println(ints.arrToList(intArr));
        //NumberClass<String> a = new NumberClass<String>(); - not work
        System.out.println();

        AllTypesClass allTypes = new AllTypesClass();// 2
        String[] arrS = {"0 2 5", "hello"};
        allTypes.setElements(arrS);
        System.out.println(Arrays.toString(allTypes.getElements()));
        Integer[] arrI = {5, 9, 3};
        allTypes.setElements(arrI);
        System.out.println(Arrays.toString(allTypes.getElements()));
        System.out.println();

        try { // 3
            //System.out.println(allTypes.get(2));
            System.out.println(allTypes.get(7));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // 4?

        System.out.println(Solution.newArrayList(0, 1, 2)); // 5
        System.out.println(Solution.newHashSet(3, 4, 5));
        Solution.Pair<Integer, String> pair1 = new Solution.Pair<>(9, "lala");
        Solution.Pair<Integer, String> pair2 = new Solution.Pair<>(5, "hello");
        System.out.println(Solution.newHashMap(pair1, pair2));
    }
}
