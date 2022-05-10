package DataType_Assignment;
import java.util.*;
public class Lower_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        char ch=sc.next().charAt(0);
	        if((ch==97 || ch<=123)){
	            System.out.print("lowercase");
	        }
	        else if ((ch==65 || ch<=91)){
	            System.out.print("UPPERCASE");
	        }
	        else {
	            System.out.print("Invalid");
	        }
	}
	

}
