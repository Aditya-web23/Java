class fact{
   static int factorial(int a){
    if( a<0)
    {
        System.out.println("The factorial of negative numbers does not defined");
        return -1;
    }
        if(a<2)
        {
            return 1;
        }
       

        else{
            int fact=2;
            for( ; 2<a; ){
                fact*=a--;
            }
            return fact;
        }

    }

    public static void main(String[] args) {
        int a=14;
        int result= factorial(a);
        if (result!=-1)
        System.out.println(result);
    }
}
