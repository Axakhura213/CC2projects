
package arraymulti;


import java.util.*;

public class ArrayMulti {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String pres[][]= {{"Donald","Trump"},
                       {"Digo","D30"},
                       {"Vladmir","Putin","Russia"}};
        
        
        int[][] d = new int [rows] [columns];
        
        for(int r = 0; r < rows; r++) {
            
            for (int c = 0; c < columns; c++) {
                
                System.out.println("Enter the name for row " + r + " and column " + c + " : ");
                
                d[r][c] = sc.nextInt();
                
                
            }
        } 
        
        for (int r = 0; r < d.length; r++) {
            System.out.println("\nRow:"+r+"\tColumn:");
            for (int c = 0; c < d.length; c++) {
                
                System.out.print(d[r][c]+"\t");
        
        
        
                }
        
         }
    }
}

/*
        int rows;

        int columns;

        System.out.println("Enter number of rows: ");

        rows = sc.nextInt();

        System.out.println("Now enter the number of columns: ");

        columns = sc.nextInt();
        
        
        
        int[][] b = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.println("Enter the number for row " + i + " and column " + j + " : ");

                b[i][j] = sc.nextInt();

            }

        }
        
        for (int i = 0; i < b.length; i++) {
            System.out.println("\nRow:"+i+"\tColumn:");
            for (int j = 0; j < b.length; j++) {
                
                System.out.print(b[i][j]+"\t");
               
            }
            
        }

    }

}
