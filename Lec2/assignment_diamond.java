package Lec2;
import java.util.*;
public class assignment_diamond {

	public static void main(String[] args) {

		
		        
		      int n=5;
		        int m=(n/2)+1;
		        int space=-1;
		      int row=1;
		        while(row<=n){
		            //pattern
		        	  int i=1;
		            while(i<=m){
		                System.out.print("*"+"\t");
		                i++;
		            }
		            //space;
		            int j=1;
		            while(j<=space){
		                System.out.print("\t");
		                j++;
		            }
		            //pattern
		            int k=1;
		            if(row==1 || row==n) {
		            	k=2;
		            }
		            while(k<=m){
		                System.out.print("*"+"\t");
		                k++;
		            }
		            if(row<((n/2)+1)){
		                m--;
		                space+=2;
		            }
		            else{
		                m++;
		                space-=2;
		            }
		            row++;
		            System.out.println("\t");
		       
		        }

	}

}
