package inheritance;

public class Car extends Machine{

    @Override
    public void start() {
        System.out.println("Car skkkrrrrrrrtttt");
    }

    public void wipeWindSheild() {
        System.out.println("Wiping windshield");

    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }
}
