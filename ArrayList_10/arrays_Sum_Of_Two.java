package ArrayList_10;
import java.util.*;
public class arrays_Sum_Of_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0; i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
int m=sc.nextInt();
int []arr1=new int [m];
for(int i=0;i<m;i++) {
	arr1[i]=sc.nextInt();
}
ArrayList<Integer>a=sum(arr,arr1);

	}
	public static ArrayList<Integer> sum (int []arr,int[]arr1 ){
		ArrayList<Integer>ans=new ArrayList<>();
		int i=arr.length-1;
		int j=arr1.length-1;
		int carry=0;
		while(i>=0 || j>=0) {
			int sum=0;
			if(i>=0) {
				sum+=arr[i];
				i--;
			}
			if (j>=0) {
				sum+=arr1[j];
				j--;
			}
			sum+=carry;
			ans.add(0,sum%10);
			carry=sum/10;
		}
	}

}
