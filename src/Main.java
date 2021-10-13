import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Pet> pets = new HashMap<>();

        String name, pet;
        for (int i = 0; i < 2; i++) {
            name = in.next();
            pet = in.next();
            pets.put(name, Pet.whatPet(pet));
        }

        pets.put("Svinya", new Owl());
        pets.put("sabaka", new Dog());

        for (Map.Entry<String, Pet> entry : pets.entrySet()) {
            System.out.println("Name: " + entry.getKey() + "   Pet: "
                    + entry.getValue());
        }

        System.out.println();

        HashMap<Integer, Integer> numbers = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10);
            if (numbers.containsKey(number)) {
                numbers.put(number, numbers.get(number) + 1);
            } else {
                numbers.put(number, 1);
            }
        }
        for (Map.Entry<Integer, Integer> number: numbers.entrySet()) {
            System.out.println(number.getKey() + " " + number.getValue() + " times");
        }
    }
}
/*
1 3 5 7 9
2 4 6 8 0
 */