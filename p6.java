class p6 {

   static void pattern1(int size)
    {   
        for(int row=1; row<=size; row++)
    {
        for(int spaces=size-row; spaces>0; spaces--)
        {
            System.out.print(" ");
        }
        for(int stars=2*row-1; stars>0; stars--)
        {
            System.out.print("*");
        }
            System.out.print("\n");
    }   

    for(int row = size+1; row <= 2*size-1; row++)
    {
        for(int spaces = row-size; spaces > 0; spaces--)
        {
            System.out.print(" ");
        }
        for(int stars = 2*(2*size-row)-1; stars>0; stars--)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    }

    static void pattern2(int size)
    {
		for(int row = 1; row <= size; row++){
			for(int spaces = size-row; spaces > 0; spaces--){
				System.out.print(" ");
			}
			for(int plus = 2*row-1; plus>0; plus--){
				if(plus % 2 == 1){
					System.out.print("+");
				}else{
					System.out.print(" ");	
				}
			}
			System.out.print("\n");
		}
		for(int row = size+1; row <= 2*size-1; row++){
			for(int spaces = row-size; spaces > 0; spaces--){
				System.out.print(" ");
			}
			for(int stars = 2*(2*size-row)-1; stars > 0; stars--){
				if(stars % 2 == 1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
    }

    static void pattern3(int size)
    {       int spaces,symbols;
		 for(int row = 1; row<= 2*size; row++){
		 	if(row > size){
		 		spaces = row-size-1;
		 		symbols = 2*(2*size-row)+1;
		 	}
		 	else{
		 		spaces = size-row;
		 		symbols = 2*row-1;
		 	}
		 	for(spaces = spaces; spaces > 0; spaces--){
		 		System.out.print(" ");
		 	}
		 	for(symbols = symbols; symbols > 0; symbols--){
		 		if((size*symbols-row)%2 == 0){
		 			System.out.print("*");
		 		}
		 		else{
		 			System.out.print("+");
		 		}
		 	}
		 	System.out.print("\n");
		 }

    }
    
    public static void main(String[] args)
    {
    
        p6.pattern1(3);
        System.out.println("\n");

        p6.pattern2(3);
        System.out.println("\n");

        p6.pattern3(3);
    
    }
}
