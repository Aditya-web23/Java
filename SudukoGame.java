import java.util.*;

class SudukoGame{
    private int size;
    private int[][] board;
    private int[][] puzzle;

    // Constructor to initialize the SudukoGame
    public SudukoGame(int size) {
        this.size = size;
        this.board = new int[size][size];
        this.puzzle = new int[size][size];
    }

    // Pattern generation (diagonal shift)
    public void generateBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = (i + j) % size + 1;
            }
        }
    }

    // Remove numbers to create a puzzle based on difficulty
    public void createPuzzle(int level) {
        int removeCount = 0;
        switch (level) {
            case 1: removeCount = size * size / 3; break; // Easy
            case 2: removeCount = size * size / 2; break; // Medium
            case 3: removeCount = size * size * 3 / 4; break; // Hard
            default: removeCount = size * size / 2; break; // Default: Medium
        }

        // Deep copy board to puzzle
        for (int i = 0; i < size; i++) {
            System.arraycopy(board[i], 0, puzzle[i], 0, size);
        }

        // Use the better randomization
        long seed = System.nanoTime();
        while (removeCount > 0) {
            seed ^= (seed << 21);
            seed ^= (seed >>> 35);
            seed ^= (seed << 4);
            int index = (int) (Math.abs(seed) % (size * size));
            int row = index / size;
            int col = index % size;

            if (puzzle[row][col] != 0) {
                puzzle[row][col] = 0;
                removeCount--;
            }
        }
    }

    // Print the grid with improved formatting
    public void printBoard() {
        int width = String.valueOf(size).length();
        String border = "-".repeat(width + 2);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("+" + border);
            }
            System.out.println("+");
            
            for (int j = 0; j < size; j++) {
                if (puzzle[i][j] == 0) {
                    System.out.printf("| %" + width + "s ", " ");
                } else {
                    System.out.printf("| %" + width + "d ", puzzle[i][j]);
                }
            }
            System.out.println("|");
        }
        
        for (int j = 0; j < size; j++) {
            System.out.print("+" + border);
        }
        System.out.println("+");
    }

    // Check if the solution is valid
    public boolean checkSolution() {
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            for (int j = 0; j < size; j++) {
                if (puzzle[i][j] == 0 || puzzle[j][i] == 0) {
                    return false; // Puzzle not complete
                }
                if (rowSet.contains(puzzle[i][j]) || colSet.contains(puzzle[j][i])) {
                    return false; // Duplicate found
                }
                rowSet.add(puzzle[i][j]);
                colSet.add(puzzle[j][i]);
            }
        }
        return true;
    }

    // Start the SudukoGame
    public void playSudukoGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the grid: ");
        size = scanner.nextInt();
        board = new int[size][size];
        puzzle = new int[size][size];

        // Generate the board using pattern method
        generateBoard();

        System.out.println("Enter difficulty (1 = Easy, 2 = Medium, 3 = Hard): ");
        int level = scanner.nextInt();
        createPuzzle(level);

        // SudukoGame loop
        boolean solved = false;
        while (!solved) {
            printBoard();

            System.out.println("Enter row (1-" + size + "), column (1-" + size + "), and number (1-" + size + ") to fill (0 0 0 to quit): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            int num = scanner.nextInt();

            if (row == -1 && col == -1 && num == 0) {
                System.out.println("SudukoGame quit!");
                return;
            }

            if (row >= 0 && row < size && col >= 0 && col < size && num >= 0 && num <= size) {
                puzzle[row][col] = num;
                solved = checkSolution();
            } else {
                System.out.println("Invalid input");
            }
        }

        System.out.println("Congratulation!! You have solved the puzzle.");
    }

    public static void main(String[] args) {
        SudukoGame SudukoGame = new SudukoGame(9);
        SudukoGame.playSudukoGame();
    }
}