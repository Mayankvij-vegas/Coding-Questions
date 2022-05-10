package Arrays_Lec6;

import java.util.Scanner;

public class Array_With_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		display(arr);
	}
public static void display(int [] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	System.out.println();
}
}
