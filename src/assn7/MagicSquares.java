package assn7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));
        ArrayList<int[]> gridList = new ArrayList<>();
        boolean isMagic = true;
        int lastSum = -1;
        
        // For each line in the file ...
        String line;
        // 1. Load file into a 2D-like structure
        while ((line = reader.readLine()) != null) {
        	// 1. Skip completely empty lines at the end of the file
            if (line.trim().isEmpty()) continue;
            // 2. Split by any whitespace (tabs OR spaces) using Regex
            String[] parts = line.split("\\s+");
            int[] row = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                row[i] = Integer.parseInt(parts[i]);
            }
            gridList.add(row);
        }
        reader.close();
        
        // Convert to 2D array for easier indexing
        int[][] grid = gridList.toArray(new int[gridList.size()][]);
        int n = grid.length;
        int magicSum = 0;
        
        // 2. Calculate initial Magic Sum from the first row
        for (int j = 0; j < n; j++) magicSum += grid[0][j];

        // 3. Check Columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += grid[i][j];
            }
            if (colSum != magicSum) return false;
        }

        // 4. Check Diagonals
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += grid[i][i];           // Top-left to bottom-right
            diag2 += grid[i][n - 1 - i];   // Top-right to bottom-left
        }
        
        return (diag1 == magicSum && diag2 == magicSum);
    }
        
    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}