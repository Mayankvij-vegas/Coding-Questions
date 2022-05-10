package Doubt_Bef_Recursion;
import java.util.*;
public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=sc.nextInt();
		       }
		    System.out.println(max_circular_sum(arr)) ;
		    }
		}
		  public static int max_circular_sum(int[]arr){
		int linear_kadane=kadane(arr);
		   int sum=0;
		for(int i=0;i<arr.length;i++){
		    sum+=arr[i];
		    arr[i]=arr[i]*-1;
		}
		int inverted_kadane=kadane(arr);
		int cir_kadane=inverted_kadane+sum;
		return Math.max(linear_kadane,cir_kadane);
		  }
		  public static int kadane(int[]arr){
		      int ans=Integer.MIN_VALUE;
		      int prev_sum=0;
		      for(int i=0;i<arr.length;i++){
		          prev_sum+=arr[i];
		          ans=Math.max(prev_sum,ans);
		          if(prev_sum<0){
		              prev_sum=0;
		              
		          }
		      }
		return ans;
		      
	}

}
