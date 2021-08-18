package strings;

class Frrog {

    private int id;
    private String name;

    public Frrog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
//        return String.format("%2d: %s", id,name);
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }

}

public class TheToStringMethod {
    public static void main(String[] args) {
        Frrog frog1 = new Frrog(1,"Mobob");
        Frrog frog2 = new Frrog(6,"Charlie");

        System.out.println(frog1);
        System.out.println(frog2);
    }
}
