public class DogTest {
    public static void testMyDogs() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("ABOBA");
        Dog dog3= new Dog(233);

        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
    }
}
