import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(java.lang.String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");

        List<String> solarSystemV1 = new ArrayList<>(Arrays.asList(mercury, venus));
        List<String> solarSystemV2 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(earth, mars, jupiter)));
        System.out.println("Contains common elements: " + Collections.disjoint(solarSystemV1, solarSystemV2));

        MyFunctions func = new MyFunctions();

        func.add(solarSystemV1, jupiter);//добавления
        System.out.println(solarSystemV1);
        func.add(solarSystemV2, jupiter);
        System.out.println(solarSystemV2);
        System.out.println();

        func.remove(solarSystemV1, 2);//удаления
        System.out.println(solarSystemV1);
        func.remove(solarSystemV2, 1);
        System.out.println(solarSystemV2);
        System.out.println();

        func.replace(solarSystemV1, venus, earth);//изменения элемента
        System.out.println(solarSystemV1);
        func.replace(solarSystemV2, jupiter, earth);
        System.out.println(solarSystemV2);
        System.out.println();

        func.shuffle(solarSystemV1);//перемешивания
        System.out.println(solarSystemV1);
        func.shuffle(solarSystemV2);
        System.out.println(solarSystemV2);
        System.out.println();

        System.out.println(func.chooseRandom(solarSystemV1));//выбора случайной планеты
        System.out.println(func.chooseRandom(solarSystemV2));
        System.out.println();

        System.out.println(func.indexOf(solarSystemV1, mercury));//показ индекса элемента
        System.out.println(func.indexOf(solarSystemV2, jupiter));
        System.out.println();

        System.out.println(func.contains(solarSystemV1, jupiter));//проверка наличия элемента в списке
        System.out.println(func.contains(solarSystemV2, earth));
        System.out.println();

        func.swap(solarSystemV1, 0, 1);//поменять два элемента местами
        System.out.println(solarSystemV1);
        func.swap(solarSystemV2, 0, 1);
        System.out.println(solarSystemV2);
        System.out.println();

        func.rotate(solarSystemV1, 1);//сдвиг
        System.out.println(solarSystemV1);
        func.rotate(solarSystemV2, 2);
        System.out.println(solarSystemV2);
        System.out.println();
    }
}