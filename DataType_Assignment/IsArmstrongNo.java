package DataType_Assignment;
import java.util.*;
public class IsArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m=n;
		int  j=n;
		int count=0;
		int ans=0;
		while(m>0){
		    int rem=m%10;
		    count++;
		    m=m/10;
		}
		while(j>0){
		    int rem=j%10;
		    ans=ans+(int)(Math.pow(rem,count));
		    j=j/10;
		}
		    }
		    public static boolean IsArmstrongNum(int ans,int n) {
		    	if(ans==n){
				    return true;
				}
				else{
				    return false;
				}
		    return;
		    }
		
	}


