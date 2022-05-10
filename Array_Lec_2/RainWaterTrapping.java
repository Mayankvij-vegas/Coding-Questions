package Array_Lec_2;// THIS IS LEC 7_2
import java.util.*;
public class RainWaterTrapping {
	

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++){
	    int n=sc.nextInt();

	int []arr=new int[n];
	for(int  j=0;j<n;j++){
	    arr[j]=sc.nextInt();
	}


		System.out.println(trapping(arr));
	 }

	
	    }
	    public static int trapping(int []arr){
	        int n=arr.length;
	        int []left= new int[n];
	        int []right=new int[n];
	        left[0]=arr[0];
	        for(int i=1;i<n;i++){
	            left[i]=Math.max(arr[i],left[i-1]);
	        }
	        right[n-1]=arr[n-1];
	        for(int i=n-2;i>0;i--){
	            right[i]=Math.max(right[i+1],arr[i]);
	        }
	        int ans=0;
	        for(int i=0;i<n;i++){
	            int min=Math.min(left[i],right[i]);
	            ans=ans+(min-arr[i]);
	        }
	       return ans;
	}
}
