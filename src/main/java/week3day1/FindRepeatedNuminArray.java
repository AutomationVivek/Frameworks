package week3day1;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatedNuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5};
		Set<Integer> myset = new HashSet<Integer>();
		System.out.print("the duplicate numbers are :");
		for (Integer x : array) {
			if (myset.add(x) == false)
				System.out.print(x + " ");
		}
	}

}
