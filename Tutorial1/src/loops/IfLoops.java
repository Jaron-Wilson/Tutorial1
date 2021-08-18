package loops;

public class IfLoops {

    public static void main(String[] args) {

        int loop = 0;

        while (loop < 5) {
            System.out.println("Looping: " + loop);

            if (loop == 50) {
                break;
            }

            loop++;

            System.out.println("Running");

            int myInt = 5;

            if (myInt > 10 ) {
                System.out.println("Yes, it's true!");
            }
            else if (myInt > 20){
                System.out.println("No, its false!");
            }
            else {
                System.out.println("None of the above.");
            }

        }

    }
}
