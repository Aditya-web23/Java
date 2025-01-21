public class sumarray {
    static int i=0;
    static int getSum(int[] numbers){
    if(i==numbers.length){
    return 0;
    }
        int sum=numbers[i];
        i++;
        return sum+getSum(numbers);
    
}
    public static void main(String[] args){
        int[] numbers={1,2,3};
        int sum =getSum(numbers);
        System.out.println("Sum of array is: "+sum);
    }
}
