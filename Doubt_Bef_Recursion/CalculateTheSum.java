package Doubt_Bef_Recursion;
import java.util.*;
public class CalculateTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int [n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int op=sc.nextInt();
		while(op-->0){
		    int x=sc.nextInt();//1 0
		    sum(arr,x);//////
		}
		calculate_sum(arr);
		    }
		    public static int[] sum(int []arr,int x){
		        int n=arr.length;
		    	int []brr=new int[n] ;//5
		        for(int i=0;i<brr.length;i++){ //0 // 
		            if((i-x)<0){//-1
		                brr[i]=arr [i]+arr[n-(i+x)];//6  //
		                }else{
		                    brr[i]=arr[i]+arr[i-x];//3 5 7 9  //12 6 10 14 18
		                }
		        }
		        for(int i=0;i<brr.length;i++) {
		        arr[i]=brr[i];	
		        	}
		       
		         
		        return arr;
		       }
		    
		    public static void calculate_sum(int []arr){
		        int sum=0;
		        for(int i=0;i<arr.length;i++){
		            sum+=arr[i]; //12 18 28 42 60
		        }
		       //(10^9+7) 
		       
		        sum %=1000000007;
		        System.out.println(sum);
		    }
}
