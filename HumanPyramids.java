import edu.princeton.cs.algs4.StdOut;

public class HumanPyramids {

    private static double[][] table;

    public static void main(String[] args) {
        StdOut.print(weightOnBackOf(5, 2));
    }

    public static double weightOnBackOf(int row, int col) {
        if (row == 0) {
            return 0;
        } else if (col == 0 || col == row + 1) {
            return (200 + weightOnBackOf(row - 1, col)) / 2;
        } else {
            return 200 + weightOnBackOf(row - 1, col);
        }
    }
}
