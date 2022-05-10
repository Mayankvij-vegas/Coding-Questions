package Array_Lec_7_3_BS;
import java.util.*;
public class logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
System.out.println(sqrt(n));
	}
public static int sqrt(int n) {
for(int i=0;i<=n;i++) {
	if(n==1) {
		return 1;
	}
}	
return ((int)Math.sqrt(n));
}
}
