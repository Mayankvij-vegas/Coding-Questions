package Lec2;

import java.util.*;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int m = n;
		while (i <= n) {
//space
			int space = 1;
			while (space < i) {
				System.out.print("  ");
				space++;
			}
//patttern
			int j = 1;
			while (j <= 2 * m - 1) {
				System.out.print("*" + " ");
				j++;
			}
			i++;
			m--;
			System.out.println();
		}

	}
}