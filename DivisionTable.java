/**
 * @author Xiao G. Wu
 * CS111A - Inclass assignment 
 * @version 1.0 12/22/2011
 */ 

/**
 * This class displays a division table of floats
 */

public class DivisionTable {

    /**
     * Main Method
     */
    
    public static void main(String[] args) {
        final int ROWS = 13;
        final int COLS = 13;

        double[][] divTable = new double[ROWS][COLS];

        // Set first row
        for (int r = 0; r < 1; r++) {
            for (int c = 0; c < divTable[r].length; c++) {
               divTable[r][c] = r + c;
            }
        }

        // Set first column
        for (int r = 0; r < divTable.length; r++) {
            for (int c = 0; c < 1; c++) {
                divTable[r][c] = r + c;
            }
        }

        // Populate the divTable
        for (int i = 1; i < divTable.length; i++) {
            for (int j = 1; j < divTable[i].length; j++) {
                divTable[i][j] = (double) i / j;
            }
        }

        // Print the divTable
        for (int i = 0; i < divTable.length; i++) {
            for (int j = 0; j < divTable[i].length; j++) {
                if (i == 0 || j == 0) {
                    System.out.printf("%d\t", (int)divTable[i][j]);
                }
                else {
                    System.out.printf("%.3f\t", divTable[i][j]); 
                }
            }
            System.out.println();
        } 
        System.out.println();
    }
}
