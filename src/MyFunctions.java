import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyFunctions {

    void add(List<String> list, String element) {
        try {
            list.add(element);
        } catch (UnsupportedOperationException e) {
            System.out.println("Can't modify unmodifiable list");
        }
    }

    void remove(List<String> list, int key) {
        try {
            list.remove(key);
        } catch (UnsupportedOperationException e1) {
            System.out.println("Can't modify unmodifiable list");
        } catch (IndexOutOfBoundsException e2) {
            System.out.println("No such index in massive");
        }
    }

    void replace(List<String> list, String oldVal, String newVal) {
        try {
            int index = list.indexOf(oldVal);
            if (index == -1) {
                System.out.println("No such element in massive");
                return;
            }
            list.remove(index);
            list.add(index, newVal);
        } catch (UnsupportedOperationException e1) {
            System.out.println("Can't modify unmodifiable list");
        }
    }

    void shuffle(List<String> list) {
        try {
            Collections.shuffle(list);
        } catch (UnsupportedOperationException e1) {
            System.out.println("Can't modify unmodifiable list");
        }
    }

    String chooseRandom(List<String> list) {
        return "Random: " + list.get((int)(Math.random() * list.size()));
    }

    String indexOf(List<String> list, String element) {
        if (list.contains(element)) {
            return "Index: " + list.indexOf(element);
        } else {
            return "No such element in massive";
        }
    }

    String contains(List<String> list, String element) {
        if (list.contains(element)) {
            return "List contains " + element;
        } else {
            return "List not contains " + element;
        }
    }

    void swap(List<String> list, int firstInd, int secondInd) {
        try {
            if (firstInd < 0 || firstInd > list.size()
                    || secondInd < 0 || secondInd > list.size()) {
                System.out.println("Massive not contain such indexes");
                return;
            }

            String firstVal = list.get(firstInd);
            String secondVal = list.get(secondInd);

            list.add(firstInd, firstVal);
            list.add(secondInd, secondVal);
            list.remove(firstInd);
            list.remove(secondInd + 1);
        } catch (UnsupportedOperationException e1) {
            System.out.println("Can't modify unmodifiable list");
        }
    }

    void rotate(List<String> list, int distance) {
        try {
            List<String> firstHalf = new ArrayList<>();
            List<String> secondHalf = new ArrayList<>();
            for (int i = distance; i < list.size(); i++) {
                firstHalf.add(list.get(i));
            }
            for (int i = 0; i < distance; i++) {
                secondHalf.add(list.get(i));
            }

            list.clear();

            list.addAll(firstHalf);
            list.addAll(secondHalf);
        } catch (UnsupportedOperationException e1) {
            System.out.println("Can't modify unmodifiable list");
        }
    }
}