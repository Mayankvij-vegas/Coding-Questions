package Array_Lec7;
import java.util.*;
public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int rot=sc.nextInt();
Rotate(arr,rot);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}
public static  void Rotate(int[]arr, int rot){
	int k=rot%arr.length;
	for(int j=0;j<k;j++) {
	int temp=arr[arr.length-1];
	for(int i=arr.length-2;i>=0;i--) {
		arr[i+1]=arr[i];
	}
	arr[0]=temp;
	}
	}
}

