package interfaces;

public class Machine implements Info {

    private int id = 7;

    public void start() {
        System.out.println("Started");
    }

    public void showInfo() {
        System.out.println("Machine Id is: " + id);
    }
}
