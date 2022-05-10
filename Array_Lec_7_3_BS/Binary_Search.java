package Array_Lec_7_3_BS;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int [n];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
int item=sc.nextInt();
System.out.println(binary(arr,item));
	}
public static int binary(int []arr,int item ) {
int n=arr.length;
int lo=0;
int hi=n-1;
while(lo<=hi) {
	int mid=(lo+hi)/2;
	if(arr[mid]==item) {
		return mid;
	}
	else if(item<arr[mid]) {
		hi=mid-1;
	}else {
		lo=mid+1;
	}
}
return -1;
}

}
