package Assignment_pattern;
import java.util.*;
public class Mirror_Star_Pattern_Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int row=1;
	        int m=n/2;
	        int star=1;
	        while(row<=n){
	            //space
	            int space=1;
	            while(space<=m){
	                System.out.print("\t");
	                space++;
	            }
	            //pattern
	            int i=1;
	            while(i<=star){
	                System.out.print("*"+"\t");
	                i++;
	            }
	            if(row<(n+1)/2){
	                m--;
	                star+=2;
	            }
	            else{
	                m++;
	                star-=2;
	            }
	            row++;
	            System.out.println();
	        }
	}

}
