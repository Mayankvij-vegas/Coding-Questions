package ArrayList_10;
import java.util.*;
public class Arraylist_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
ArrayList<Integer>list=new ArrayList<>();
int n=5;
for(int i=0;i<n;i++) {
	list.add(sc.nextInt());
}
for(int i=0;i<list.size();i++) {
	System.out.print(list.get(i)+" ");
}
System.out.println();
System.out.println("E_F_L");
for(int val: list) {
	System.out.print(val+" ");
	
}
System.out.println();
int []arr= {10,20,30};
for(int Mayank:arr) {
	System.out.print(Mayank+" ");
}
System.out.println();
//2-D Array
int [][]a=new int[2][3];
for(int[]a1:a) {
	for(int i:a1) {
		System.out.print(i+" ");
	}
}
System.out.println();
	}

}
