package Doubt_Bef_Recursion;

import java.util.*;

public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated meth
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
		    int []arr=new int[n];
		int m=sc.nextInt();
		int [] arr1=new int [m];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
		    arr1[i]=sc.nextInt();
		}
		maximum_sum(arr, arr1);
		}
		    }
		    public static void maximum_sum(int []arr,int [] arr1){
		        int i=0;
		        int j=0;
		        int k=0;
		        int l=0;
		        int ans=0;
		        while(i<arr.length && j<arr1.length){
		            if(arr[i]<arr1[j]){
		                i++;
		            }
		            else if(arr[i]>arr1[j]){
		                j++;
		            }else{
		                int sum=0;
		                int sum1=0;
		                for(int m=k;m<=i;m++){
		                    sum+=arr[m];
		                }
		                for(int n=l;n<=j;n++){
		                    sum1+=arr1[n];
		                }
		                ans+=Math.max(sum,sum1);
		                i++;
		                j++;
		                k=i;
		                l=j;
		            }
		        }
		        if(i==arr.length){
		            for(int m=l;m<arr1.length;m++){
		                ans+=arr1[m];
		               }
		            }else{
		                for(int n=k;n<arr.length;n++){
		                ans+=arr[n];
		            }
		            
		            }
		            System.out.println(ans); 
		     
	}

}
