package Function_lec5;
import java.util.*;
public class Is_Armstrong_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d=Is_Armstrong_No(n);
boolean f=ArmstrongNo(n);
System.out.println(f);
}
	
public static int Is_Armstrong_No (int n) {//n is local variable
	 int c=0;
	while(n>0) {
		n=n/10;
		c++;
	}
	return(c);
	
}
public static boolean ArmstrongNo(int n) {//n is local variable. Can also take another variable instead of n
	int ans=0;
	int temp=n;
	int d= Is_Armstrong_No(n);
	while(n>0) {
	int	rem=n%10;
		n=n/10;
		ans=(int)(ans+Math.pow(rem, d));
	}
	if(ans==temp) {
		return true;
	}
	else {
		return false;
	}
}
}
	


