import org.w3c.dom.ls.LSOutput;

public class Dog {
    private String name;
    private int age;

    public Dog(){
        name = "default";
        age = 0;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog(int age) {
        this.name = "default";
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void intoHumanAge() {
        System.out.println(name + " is " + age * 7 + " human years");
    }
}
