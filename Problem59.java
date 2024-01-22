import acm.program.*;

public class Problem59 extends ConsoleProgram {
	public void run() {
		
		
		
		int[][] matrix = new int[][] { 
			{ 0, 1, 1, 0, 0, 1, 0, 0 },
			{ 0, 1, 1, 1, 1, 1, 0, 0 },
			{ 0, 0, 1, 1, 1, 1, 0, 0 }, 
			{ 0, 0, 1, 1, 1, 1, 0, 0 }, };
		int max=0;
		for(int a = 0; a<matrix.length; a++) {
			for(int b =0; b<matrix[0].length; b++) {
				for(int c = a; c< matrix.length; c++) {
					for( int d = b; d<matrix[0].length; d++) {
						gvawyobs(matrix,a, b, c,d);
						int current = (c-a+1)*(d-b+1);
						max = Math.max(current, max);
					}
				}
			}
		}
		
		println("length of ones rectanngle in matrix " + matrix.toString() + " is" + max);
				
				
	}
	
	private boolean  gvawyobs(int[][] matrix, int a, int b, int c, int d) {
		for( int i = a; i<=c; i++) {
			for(int j = b; j <=d; j++) {
				if( matrix[i][j] !=1) {
					return false;
				}
				
			}
		}
		return true;
		
	}

}
