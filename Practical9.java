public class Practical9{
    
    public static void Performance() {
        long sum = 0;
        int i;
        long[] a = new long[50];
        long[] time = new long[50];
        long stringBuilderTiming = 0;
        long stringBufferTiming = 0;
        long stringTiming = 0;
        
        // Timing for iterative factorial 
        for (i = 0; i < 50; i++) {
            a[i] = System.nanoTime() % 30 + 1;
            long start_time = System.nanoTime();
            fact(a[i]);
            long end_time = System.nanoTime();
            time[i] = end_time - start_time;
            sum += time[i];
        }
        
        float avg_time = (float) sum / 50;
        
        // Timing for recursive factorial
        for (i = 0; i < 50; i++) {
            a[i] = System.nanoTime() % 30 + 1;
            long start_time = System.nanoTime();
            factr(a[i]);
            long end_time = System.nanoTime();
            time[i] = end_time - start_time;
            sum += time[i];
        }
        
        float avg_time_factr = (float) sum / 50;

        System.out.println("Average time for iterative factorial: " + avg_time);
        System.out.println("Average time for recursive factorial: " + avg_time_factr);
        
        // Timing for String operations
        for (i = 0; i < 50; i++) {
            long start_time = System.nanoTime();
            stringBuilder();
            long end_time = System.nanoTime();
            stringBuilderTiming += (end_time - start_time);

            start_time = System.nanoTime();
            stringBuffer();
            end_time = System.nanoTime();
            stringBufferTiming += (end_time - start_time);
            
            start_time = System.nanoTime();
            stringConcat();
            end_time = System.nanoTime();
            stringTiming += (end_time - start_time);
        }

        System.out.println("StringBuilder: " + (stringBuilderTiming / 50));
        System.out.println("StringBuffer: " + (stringBufferTiming / 50));  
        System.out.println("String Concatenation: " + (stringTiming / 50));
    }

    public static long fact(long n) {
        if (n == 0 || n == 1) 
        return 1;

        else if (n > 0) {
            long a = 1;
            for (int i = 2; i <= n; i++) {
                a *= i;
            }
            return a;
        } else {
            System.out.println("Factorial does not exist for negative numbers");
            return -1;
        }
    }

    public static long factr(long n) {
        if (n < 2 && n >= 0) 
        return 1;
        else if (n < 0)
        return -1;
        else 
        return n * factr(n - 1);
    }

    public static void stringBuilder() {
        StringBuilder sb = new StringBuilder();
        long[] a = new long[50];

        for (int i = 0; i < 50; i++) {
            a[i] = System.nanoTime();
            sb.append(a[i]).append(", ");
        }
    }

    public static void stringBuffer() {
        StringBuffer sb = new StringBuffer();
        long[] a = new long[50];

        for (int i = 0; i < 50; i++) {
            a[i] = System.nanoTime();
            sb.append(a[i]).append(", ");
        }
    }

    public static void stringConcat() {
        String str = "";
       long[] a = new long[50];

        for (int i = 0; i < 50; i++) {
            a[i] = System.nanoTime();
            str += a[i] + ", "; // Less efficient
        }
    }

    public static void main(String[] args) {
        Performance();
    }
}
