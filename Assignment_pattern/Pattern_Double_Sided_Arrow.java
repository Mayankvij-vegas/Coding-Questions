package Assignment_pattern;
import java.util.*;
public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int m=n-1;
		int star=1;
		int i=1;
		while(row<=n){
		    //space
		    int space=1;
		    while(space<=m){
		        System.out.print("  ");
		        space++;
		    }
		    int j=0;
		    while(j<star){
		        while(j<row){
		            System.out.print(i+" ");
		            i--;
		        }
		        if(j>=row && j<star-row){
		            System.out.print("  ");
		        }
		        while(j>=star-row){
		            int t=1;
		            while(t<=row){
		                System.out.print(t+" ");
		            t++;
		            }
		            
		        }
		        j++;
		        if(row<(n/2)+1){
		        i=row+1;
		        m-=2;
		        star+=2;
		    }
		    else{
		        m+=2;
		        star-=4;
		    }
		    row++;
		     System.out.println();
		}
		   
	}
	
	}}

