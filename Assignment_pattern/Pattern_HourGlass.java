package Assignment_pattern;
import java.util.*;
public class Pattern_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=n;
int t=0;
int row=1;
int p=2*n+1;
while(row<=p) {
	int space=1;
	while(space<=t) {
		System.out.print("  ");
		space++;
	}
	int s=1;
	int k=m;
	if(s<=m+1) {
		System.out.print(k+" ");
		s++;
		k--;
	}
	s=1;
	k++;
	while(s<m) {
		System.out.print(k+" ");
		k++;
		s++;
	}
	if(row<=n) {
		p-=2;
		t++;
		m--;
	}else {
		p+=2;
		t--;
		m++;
	}
	row++;
	System.out.println();
}
	}

}
