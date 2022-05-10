package DataType_Assignment;
import java.util.*;
public class Replace_Them_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		long n=sc.nextLong();
		long mul=1;
		long i=0;
		while(n>0){
		  long rem=n%10;
		    if(rem==0){
		        i=i+(5*mul);
		    }
		    else{
		        i=i+ (rem*mul);
		    }
		    n=n/10;
		mul *=10;
		}
		    System.out.print(i);
		    
	}

}
