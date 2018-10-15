package week4day1;

public class Matrix_4X4 {

	public static void main(String[] args) {
		int[][] array=new int[4][4];
		int l=1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				array[i][j]=l;
				l++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
			System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
