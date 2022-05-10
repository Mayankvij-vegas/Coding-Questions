package DataType_Assignment;
import java.util.*;
public class Odd_and_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int m=sc.nextInt();
		     int sum=0;
		        int sum1=0;
		    while(m>0){
		        int rem=m%10;
		        if(rem%2==0){
		            sum=sum+rem;
		        }else{
		            sum1=sum1+rem;
		        }
		        m=m/10;
		    }
		    if(sum%4==0 || sum1%3==0){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}

}
