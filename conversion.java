class conversion{
public static void main(String[] args){
Integer i=129;
String convert="byTe";
if (convert.equalsIgnoreCase("byte")){
getByteValue(i);
}
if(convert.equalsIgnoreCase("short")){
getShortValue(i);
}
}
public static void getByteValue(int i){
int value =i%256;
if (value>127){
value-=256;
}
System.out.println("byte value is: " + value);
}

public static void getShortValue(int i){
int value=i% 65536;
if(value>32767)
{
value-=32767;
}
System.out.println("short value is: " + value);
}
}
