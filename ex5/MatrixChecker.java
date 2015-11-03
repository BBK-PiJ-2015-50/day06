public class MatrixChecker {
	
	public boolean isSymmetrical(int[] matrix) {
		for (int i=0;i<matrix.length/2;i++) {
			if (matrix[i]!=matrix[matrix.length-i-1]) {
				return false;
			}
		}
		return true;
	}
}