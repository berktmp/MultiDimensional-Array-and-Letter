public class Main {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 6;
        
        char[][] letterB = new char[rows][cols];
        
        // Fill the array with spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                letterB[i][j] = ' ';
            }
        }
        
        // Draw the letter B
        for (int i = 0; i < rows; i++) {
            letterB[i][0] = '*';
        }
        
        for (int i = 1; i <= 2; i++) {
            letterB[i][cols - 1] = '*';
        }
        
        for (int i = 3; i <= 4; i++) {
            letterB[i][cols - 2] = '*';
        }
        
        for (int i = 0; i <= 2; i += 2) {
            for (int j = 1; j <= 3; j++) {
                letterB[i][j] = '*';
            }
        }
        
        for (int i = 3; i <= 5; i += 2) {
            for (int j = 1; j <= 3; j++) {
                letterB[i][j] = '*';
            }
        }
        
        // Print the letter B
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(letterB[i][j]);
            }
            System.out.println();
        }
    }
}
