class Frog {
    private String name;
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class SettersAndThis {

    public static void main(String[] args) {

                Frog frog1 = new Frog();

//        frog1.name = "Bertie";
//        frog1.age = 1;

        frog1.setName("Bertie");
        frog1.setAge(2);

        System.out.println(frog1.getName());
    }
}
