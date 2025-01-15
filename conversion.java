public class conversion{
public static void main(String[] args){
Integer i=150;
String convert="sHOrt";
if (convert.equalsIgnoreCase("byte")){
getByteValue(i);
}
if(convert.equalsIgnoreCase("short")){
getShortValue(i);
}
}
public static void getByteValue(int value){
byte byteValue=(byte) value;
System.out.println("byte value is: " + byteValue);
}

public static void getShortValue(int value){
short shortValue=(short) value;
System.out.println("short value is: " + shortValue);
}
}
