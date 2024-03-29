package Array_Lec_2;
import java.util.*;// THIS IS LEC 7_2
public class Array_Product_With_Itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         int n= sc.nextInt();
         long []arr=new long[n];
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         //    System.out.print(ans[i]+" "); // no need to output
         }
        product(arr);   // need to call now 
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); // now output
         }
         
     }  public static long[] product(long arr[]) {   // since it store products which may be goes out of range
         int n = arr.length;
         long[]left=new long[n];
         long []right=new long [n];
         left[0]=1;
         for (int i=1;i<n;i++) {
             left[i]=left[i-1]*arr[i-1];
         }
         right[n-1]=1;
         for(int i=n-2;i>=0;i--) {
             right[i]=right[i+1]*arr[i+1];
         }
         for(int i=0;i<right.length;i++) {
             arr[i]=left[i]*right[i];
         }
         return arr;
     }
      
}
