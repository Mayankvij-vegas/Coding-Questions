package Doubt_Bef_Recursion;
import java.util.*;
public class Sorting_In_linear_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		 sorting(arr);
		 for(int i=0;i<arr.length;i++){
		     System.out.print(arr[i]+" ");
		 }
		}
		   
		    public static int[] sorting(int []arr){
		        int l=0;//left index
		        int r=arr.length-1;//right index
		        int mid=0;//Third pointer
		       while(mid<=r){
		           if(arr[mid]==2){
		               int temp=arr[mid];
		               arr[mid]=arr[r];
		               arr[r]=temp;
		               r--;
		           }
		           else if(arr[mid]==0){
		               l++;
		               mid++;
		           }
		           else{
		               int t=arr[r];
		               arr[r]=arr[mid];
		               arr[mid]=t;
		           }

		       }
		       return arr;
		    }

	}


