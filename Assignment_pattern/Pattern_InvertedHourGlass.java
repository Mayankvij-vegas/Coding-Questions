package Assignment_pattern;
import java.util.*;
public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row =1;
		int m=n;
		int i=1;
		while(row<=2*n+1){
		    while(row>1){
		        System.out.println();
		    }
		    while(i<=2*m+1){
		        System.out.print( m );
		        System.out.println();
		        i++;
		    }
		    if(row<n/2){
		        m--;
		        i--;
		    }
		    else{
		        m++;
		        i++;
		    }
		    row++;
		}
	}

}
