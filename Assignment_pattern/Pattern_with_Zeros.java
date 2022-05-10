package Assignment_pattern;
import java.util.*;
public class Pattern_with_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
		int row=1;
while(row<=n) {
	int i=1	;
	while(i<=row) {

		if(i>1 && i<row) {
			System.out.print("0"+" ");
		}
		else {
			System.out.print(row+ " ");
		}
		i++;
	}
	row++;
	System.out.println();
}
	}

}
