package DataType_Assignment;
import java.util.*;
public class Revising_Quadratic_Equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int root1=(-b-(int)(Math.sqrt(b^2-4*a*c)))/2*a;
		int root2=(-b+(int)(Math.sqrt(b^2-4*a*c)))/2*a;
		 if(root1!=root2){
		System.out.println("Real and Distinct");
		System.out.println(root1+" "+root2);
		 }
		 else if((root1==root2)){
		System.out.println("Real and Equal");
		System.out.println(root1+" "+root2);
		 }
		 else{
		System.out.println("Imaginay");
		 }
	}

	
}
