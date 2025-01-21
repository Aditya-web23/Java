class factorial {
    static int factorial(int a) {
        if (a < 0) {
            System.out.println("The factorial of negative numbers is not defined.");
            return -1;
        }

        if (a < 2) {
            return 1;
        }

        int fact = 1;
        while (a > 1) {
            fact *= a--;
        }
        return fact;
    }

    public static void main(String[] args) {
        int a = 1;  
        int result = factorial(a);
        if (result != -1) {
            System.out.println(result);
        }
    }
}
