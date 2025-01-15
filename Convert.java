import java.util.Scanner;

class Convert{
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

System.out.println("Choose an option:");
System.out.println("1: Decimal to Binary, Octal, Hexadecimal");
System.out.println("2: Binary to Decimal, Octal, Hexadecimal");
System.out.println("3: Octal to Decimal, Binary, Hexadecimal");
System.out.println("4: Hexadecimal to Decimal, Binary, Octal");
int choice = scanner.nextInt();
System.out.println("Enter the number:");
 String input = scanner.next();

  switch (choice) {
    case 1 -> decimalConversions(Integer.parseInt(input));
    case 2 -> binaryConversions(input);
    case 3 -> octalConversions(input);
    case 4 -> hexadecimalConversions(input);
    default -> System.out.println("Invalid choice!");
        }
 scanner.close();
    }
    public static void decimalConversions(int decimal) {
    System.out.println("Binary: " + decimalToBinary(decimal));
    System.out.println("Octal: " + decimalToOctal(decimal));
    System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));
    }

    public static void binaryConversions(String binary) {
    int decimal = binaryToDecimal(binary);
    System.out.println("Decimal: " + decimal);
    System.out.println("Octal: " + decimalToOctal(decimal));
   System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));
    }
    public static void octalConversions(String octal) {
    int decimal = octalToDecimal(octal);
      System.out.println("Decimal: " + decimal);
      System.out.println("Binary: " + decimalToBinary(decimal));
      System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));
    }
    public static void hexadecimalConversions(String hex) {
    int decimal = hexadecimalToDecimal(hex);
      System.out.println("Decimal: " + decimal);
      System.out.println("Binary: " + decimalToBinary(decimal));
      System.out.println("Octal: " + decimalToOctal(decimal));
    }
  public static String decimalToBinary(int decimal) {
    StringBuilder binary = new StringBuilder();
      while (decimal > 0) {
          binary.insert(0, decimal % 2);
          decimal /= 2;
        }
        return binary.toString();
    }
    public static String decimalToOctal(int decimal) {
      StringBuilder octal = new StringBuilder();
      while (decimal > 0) {
        octal.insert(0, decimal % 8);
        decimal /= 8;
        }
        return octal.toString();
    }
    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (decimal > 0) {
            hex.insert(0, hexChars[decimal % 16]);
            decimal /= 16;
        }
        return hex.toString();
    }
    public static int binaryToDecimal(String binary) {
    int decimal = 0;
    int base = 1; // 2^0
     for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') * base;
            base *= 2;
        }
        return decimal;
    }
    public static int octalToDecimal(String octal) {
    int decimal = 0;
    int base = 1; // 8^0
      for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * base;
            base *= 8;
        }
        return decimal;
    }
    public static int hexadecimalToDecimal(String hex) {
      int decimal = 0;
        int base = 1; // 16^0
        for (int i = hex.length() - 1; i >= 0; i--) {
          char c = hex.charAt(i);
          int value = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;
          decimal += value * base;
          base *= 16;
        }
        return decimal;
    }
}
