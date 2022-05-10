package Array_Lec7_1_Sorting;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
Bubble(arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}
public static void Bubble(int []arr) {
	int n=arr.length;
	for(int pass=0;pass<=n-2;pass++) {
		int j=0;
		int m=n;
		while(j<m-1) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;	
				j++;
			}else {
				j++;
			}}
			m--;
		
	}
}
}
