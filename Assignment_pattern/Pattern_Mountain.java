package Assignment_pattern;
import java.util.*;
public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=2*n-3;
		int star=1;
		int val=1;
		while(row<=n){
		    int j=1;
		    int p=val;
		    while(j<=star){
		        System.out.print(p+"\t");
		        j++;
		        p++;
		    }
		    //space
		    int k=1;
		    while(k<=space){
		        System.out.print("\t");
		        k++;
		    }
		    //pattern
		    j=1;
		    p--;
		    if(star==n) {
	    		p--;
	    		star--;
	    	}
		    while(j<=star){
		    	
		        System.out.print(p+"\t");
		        j++;
		        p--;
		    } 
		    star++;
		 space-=2;
		row++;
		System.out.println();
	}

}}
