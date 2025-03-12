class Practical10 {
    public static void main(String[] args){
        int size = 9; 
        Sudokugrid(size); 
    }
    public static void Sudokugrid(int size){
        if (size <= 0){
            System.out.println("Invalid input");
            return;
        }

        // Calculate the width of each cell based on the size
        int width = String.valueOf(size).length();
        String border = "-".repeat(width + 2);

        // Create the Sudoku grid
        int[][] grid = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                grid[i][j] = (i + j) % size + 1;
            }
        }

        // Remove one-third of the numbers to make it Sudoku-like
        int removeCount = (size * size) / 3;
        long seed = System.nanoTime(); // Use nanoTime for randomness
        while (removeCount > 0) {
            seed ^= (seed << 21); // Mix bits for randomness
            seed ^= (seed >>> 35);
            seed ^= (seed << 4);
            int index = (int) (Math.abs(seed) % (size * size));

            int row = index / size;
            int col = index % size;

            if (grid[row][col] != 0){
                grid[row][col] = 0;
                removeCount--;
            }
        }
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("+" + border);
            }
            System.out.println("+");
            for (int j = 0; j < size; j++){
                if (grid[i][j] == 0)
                    System.out.printf("| %" + width + "s ", " ");
                 else
                    System.out.printf("| %" + width + "d ", grid[i][j]);
            }
            System.out.println("|");
        }
        for (int j = 0; j < size; j++){
            System.out.print("+" + border);
        }
        System.out.println("+");
    }
}