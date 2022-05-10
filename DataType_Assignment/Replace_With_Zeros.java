package DataType_Assignment;
import java.util.*;
public class Replace_With_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		long n=sc.nextLong();
		long m=0;
		while(n>0){
		  long  rem=n%10;
		    if(rem==0){
		        rem=5;
		    }
		    else{
		        rem= rem;
		    }
		    n=n/10;
		     m=m+rem;
		}
		//reverse now
		
	}

}
