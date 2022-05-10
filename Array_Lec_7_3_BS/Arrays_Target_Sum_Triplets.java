package Array_Lec_7_3_BS;
import java.util.*;
public class Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int [n];
		for (int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int t = sc.nextInt();
		target(arr,t);
		    }
		    public static void target(int []arr,int t){
		        Arrays.sort(arr);
		      for(int i=0;i<arr.length;i++) {
                      int  m=i;
			        int j=i+1;
			        int k=arr.length-1;
			        
			        while(j<=k){
			            if((arr[m]+arr[j]+arr[k])==t){
			                System.out.println(m+", "+j+" and "+k);
			                j++;
			                k--;
			            }
			            else if((arr[m]+arr[j]+arr[k])>t){
			                j--;
			            }
			            else{
			                 m++;
			                j+=i;
			            }
			               
			          
			        }
		      }
		    
	}

}
