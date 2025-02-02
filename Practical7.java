public class Practical7 {
    public static void main(String []args){
        ADITYA(7);
        System.out.println("\n");
        aditya (7);
    }
    public static void  ADITYA(int size){
        int size1 = size ;
        if(size%2 ==0) size1 +=1 ;
        for(int ln = 1 ; ln <=size ; ln++){
            for(int i = 1 ; i <=size ;i++){
                if((ln == 1 && i == 1)|| (ln==1 && i ==size))
                System.out.print(" ");
                else if ( i ==1 ||i==size || ln ==size/2+1 || ln ==1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.print("   ");
            for(int i = 1 ; i<=size ; i++){
                if((ln==1 && i == size) || (ln == size && size == i))
                System.out.print(" ");
                else if (ln == 1 || ln ==size || i ==1 || i ==size)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.print(" ");
            for(int i = 1 ; i<=size1 ; i++){
                if(ln ==1 || i == size/2+1 || ln ==size)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.print(" ");
            for(int i = 1 ;i<=size1 ; i++){
                if(ln ==1 || i == size/2+1 )
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.print(" ");
    
            for(int i = 1 ; i <= size1 ; i++){
                if(ln <= size/2+1){
                    if(i == ln || i+ln == size1+1)
                     System.out.print("*");
                    else  
                    System.out.print(" ");
                }
                else{
                    if(i==size/2+1) 
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int i = 1 ; i <=size ;i++){
                if((ln == 1 && i == 1)|| (ln==1 && i ==size))
                System.out.print(" ");
                else if ( i ==1 ||i==size || ln ==size/2+1 || ln ==1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }
            System.out.println("");





        }
    }
    public static void A(int size ){
        int size1 = size ;
        if(size%2 ==0) size1 +=1 ;
        for(int ln = 1 ; ln <=size ; ln++){
            for(int i = 1 ; i <=size ;i++){
                if((ln == 1 && i == 1)|| (ln==1 && i ==size))
                System.out.print(" ");
                else if ( i ==1 ||i==size || ln ==size/2+1 || ln ==1)
                System.out.print("*");
                else 
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
    public static void D(int size ){
        int size1 = size ;
        if(size%2 ==0) size1 +=1 ;
        for(int ln = 1 ; ln <=size ; ln++){
            for(int i = 1 ; i<=size ; i++){
                if((ln==1 && i == size) || (ln == size && size == i))
                System.out.print(" ");
                else if (ln == 1 || ln ==size || i ==1 || i ==size)
                System.out.print("*");
                else 
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
    public static void I(int size ){
        int size1 = size ;
        if(size%2 ==0) size1 +=1 ;
        for(int ln = 1 ; ln <=size ; ln++){
            for(int i = 1 ; i<=size1 ; i++){
                if(ln ==1 || i == size/2+1 || ln ==size)
                System.out.print("*");
                else 
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
    public static void T(int size ){
        int size1 = size ;
        if(size%2 ==0) size1 +=1 ;
        for(int ln = 1 ; ln <=size ; ln++){
            for(int i = 1 ;i<=size1 ; i++){
                if(ln ==1 || i == size/2+1 )
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print(" ");

            System.out.println("");
        }
    }
    public static void Y(int size ){
        int size1 = size ;
        if(size%2 ==0) size1 +=1 ;
        for(int ln = 1 ; ln <=size ; ln++){
            for(int i = 1 ; i <= size1 ; i++){
                if(ln <= size/2+1){
                    if(i == ln || i+ln == size1+1) 
                    System.out.print("*");
                    else  
                    System.out.print(" ");
                }
                else{
                    if(i==size/2+1) 
                    System.out.print("*");
                    else  
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
    public static void aditya(int size ){
        A(size);
        System.out.println(" ");
        D(size);
        System.out.println(" ");  
        I(size);
        System.out.println(" ");
        T(size);
        System.out.println(" ");
        Y(size);
        System.out.println(" ");
        A(size);

    }
}





