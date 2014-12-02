package epicOA;

import java.util.*;


public class Solution {

	public double averageWithout3Max (int[] input) {
		Arrays.sort(input);
		double sum = 0;
		for (int i = 0; i < input.length - 3; i++) {
			sum += input[i];
		}
		double res = sum / (input.length - 3);
		return res;
	}
	
	public static void main(String[] args) {
//		Solution s = new Solution();
//		int[] input = {3, 5, 5, 4, 9};
//		double res = s.averageWithout3Max(input);
//		System.out.println(res);
		
		String str = "nkdsnkfnks";
		String res = str.toUpperCase();
		System.out.println(res);
	}
}
