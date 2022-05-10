package Array_Lec7;
import java.util.*;
public class Minimyum_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int [n];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
Minimum(arr);
System.out.println(Minimum(arr));

}
	public static int Minimum(int []arr) {
		int i=0;
		int j=1;
		while(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
		
return(arr[i]); }
}
