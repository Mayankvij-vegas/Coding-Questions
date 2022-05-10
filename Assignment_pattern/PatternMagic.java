package Assignment_pattern;
import java.util.*;
public class PatternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int m=n;
		int space=-1;
		while(row<=2*n-1){
		int i=1;
		while(i<=m){
		    System.out.print("*");
		    i++;
		}
		int k=1;
		while(k<=space){
		    System.out.print(" ");
		    k++;
		}
		i=1;
		if(row==1 || row==2*n-1){
		    i=2;
		}
		while(i<=m){
		    System.out.print("*");
		    i++;
		}
		if(row<n){
		    m--;
		    space+=2;
		}else{
		    m++;
		    space-=2;
		}
		row++;
		System.out.println();
		}
		
	}

}
