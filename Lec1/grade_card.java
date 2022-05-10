package Lec1;

import java.util.*;

public class grade_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
if( marks<=100 && marks>= 80) {
	System.out.println("Grade is A");
}
else if(marks<80 && marks>=70){
	System.out.println("grade is B");
}
else if(marks<70 && marks>=60) {
	System.out.println("grade is c");
}
else if(marks<60 && marks>=40) {
	System.out.println("Pass");
}
else{
	System.out.println("Fail");
}
	}

}
