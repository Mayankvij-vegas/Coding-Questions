package Array_Lec7;

import java.util.*;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	}
	public static void Find(int []arr) {
		for(int i=arr.length;i>0;i++) {
			System.out.print((arr[i]+ " "));
		}
		
	}
}
