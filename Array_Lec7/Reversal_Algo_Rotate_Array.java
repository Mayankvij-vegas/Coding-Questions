package Array_Lec7;
import java.util.*;
public class Reversal_Algo_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int k=sc.nextInt();
Rotate(arr,k);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}
	public static void Rotate(int []arr,int k) {
		k=k%arr.length;
		swap(arr,0,arr.length-k-1);
		swap(arr,arr.length-k,arr.length-1);
		swap(arr,0,arr.length-1);
		}
public static void swap(int []arr,int i ,int j) {
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}
}
