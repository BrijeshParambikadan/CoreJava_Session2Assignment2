// program to print the “X” pattern

public class J_S2A2 {

	public static void main(String[] args) {

		for (int row = 0; row < 5; row++) {
	        for (int col = 0; col < 5; col++) {
	            if (row == col || row + col == 5 - 1) {
	                System.out.print("*");
	            } else {
	                System.out.print("_");
	            }
	        }
	        System.out.println();
	    }
	}
}

// Thank You