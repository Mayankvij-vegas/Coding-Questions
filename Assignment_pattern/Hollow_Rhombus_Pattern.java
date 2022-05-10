package Assignment_pattern;
import java.util.*;
public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int m=n-1;
		while(row<=n){
		    //space
		int space=1;
		while(space<=m){
		    System.out.print(" ");
		    space++;
		}
		if(row==1 || row==n){
		    int j=1;
		    while(j<=n){
		        System.out.print("*");
		        j++;
		    }}else{
		        System.out.print("*");
		        int j=1;
		        while(j<=n-2){
		            System.out.print(" ");
		            j++;
		        }
		            System.out.print("*");
		}
		m--;
		row++;
		System.out.println();
	}

}}
