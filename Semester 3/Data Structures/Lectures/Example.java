package DS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int[][] chess = new int[n][n];
	   if( printNQueens(chess, 0) == false){
	       System.out.println("No Solution");

	   }
	   printSolution(chess,n);

	}
	public static void printSolution(int[][] chess,int n){
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++)
	            System.out.print(" " + chess[i][j] + " ");
	        System.out.println();
	    }
	}

	  public static boolean printNQueens(int[][] chess,  int row) {
	    if (row == chess.length) 
	         return true;
	 
	    for (int col = 0; col < chess.length; col++) {
	      if (isQueenSafe(chess, row, col) == true) {
	        chess[row][col] = 1;
	        if(printNQueens(chess, row + 1))
	            return true;
	        chess[row][col] = 0;
	    
	      }
	    }
	    return false;
	  }

	  public static boolean isQueenSafe(int[][] chess,  int row, int col) {
	    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
	      if (chess[i][j] == 1) {
	        return false;
	      }
	    }

	    for (int i = row - 1, j = col; i >= 0; i--) {
	      if (chess[i][j] == 1) {
	        return false;
	      }
	    }

	    for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
	      if (chess[i][j] == 1) {
	        return false;
	      }
	    }

	   

	    return true;
	    }

}
