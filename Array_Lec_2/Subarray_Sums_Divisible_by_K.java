package Array_Lec_2;// THIS IS LEC 7_2
import java .util.*;
public class Subarray_Sums_Divisible_by_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for (int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
int k=sc.nextInt();
Divisible(arr, k);
System.out.println();
	}

	public static void Divisible(int []arr,int k) {
	int	count=0;
		for (int i=0;i<arr.length;i++) {
			int sum=0;
			for (int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum%k==0) {
					count++;
				}
			}
		
		}
	}
}
