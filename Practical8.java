public class Practical8 {
    public static void main(String[] args) {
        int n = 3; 
        Pattern1(1, n);
    }

    public static void Pattern1(int row, int n) {
        if (row == 0) {
            return;
        }
        stars(row);
        if (row < n + 1) {
            Pattern1(row + 1, n);
        }
        if (row != n + 1) {
            stars(row);
        }
    }
    public static void stars(int count) {
        if (count == 0) {
            System.out.println();
            return;
        }
        System.out.print("*");
        stars(count - 1);
    }
}

