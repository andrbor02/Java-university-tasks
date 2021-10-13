public class Pet {
    String name;

    public static Pet whatPet(String pet) {
        return switch (pet) {
            case "Cat" -> new Cat();
            case "Dog" -> new Dog();
            case "Owl" -> new Owl();
            default -> null;
        };
    }
}
