package interfaces;

public class Person implements Info{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello");
    }

    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
}
