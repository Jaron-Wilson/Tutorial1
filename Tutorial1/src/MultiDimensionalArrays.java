public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] values = {3, 4, 4523};

//        System.out.println(values[2]);

        int[][] grid = {
                {3, 4, 5},
                {2, 4},
                {1, 2, 3, 4}
        };

        System.out.println(grid[1][0]);

        String[][] text = new String[2][3];

        text[0][1] = "Hello";

        System.out.println(text[0][1]);

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        String[][] words = new String[2][];
        System.out.println(words[0]);

        words[0] = new String[3];

        words[0][1] = "Hi there";

        System.out.println(words[0][1]);
    }

}
