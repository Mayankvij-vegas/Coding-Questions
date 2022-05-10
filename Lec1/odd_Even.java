package Lec1;

import java.util.*;

public class odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int c=1;
if(n%2==0) {
	System.out.println(n+"is even");
	}
if(n%2!=0 && n==3*c) {
	System.out.println(n +"is multiple of 3");
	}
else

	{
		System.out.println(n + "is odd");
	}

}
}