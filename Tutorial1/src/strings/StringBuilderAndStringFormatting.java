package strings;

public class StringBuilderAndStringFormatting {
    public static void main(String[] args) {

        //Inefficient
        String info = "";
        info += "My name is bob";
        info += " ";
        info += "im a builder";

        System.out.println(info);

        //More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.")
                .append(" ")
                .append("I am a skydiver.");
        System.out.println(s.toString());

        // Formatting////////////////////////////////////////////////////////////

        System.out.print("Here is some text. \tThat was a tab.\nThat was a new line");
        System.out.println("More text");
//        Formatting integers
//                      %d = number
        System.out.printf("Total cost: %-10d; quantity is %d\n", 5, 120);

        for (int i = 0; i < 20; i++) {
//                      %s = string
            System.out.printf("%2d: %s\n", i, "some text here");

        }
//        Formatting Floating point values
//                      %f = floating point
        System.out.printf("Total Value: %.2f\n", 5.687);
        System.out.printf("Total Value: %6.1f\n", 345.32324687);

    }
}
