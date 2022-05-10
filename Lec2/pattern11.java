package Lec2;
import java.util.*;
public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int m = n;
		while (i <= n) {
			// space
			int space = 1;
			while (space <= m - 1) {
				System.out.print("  ");
				space++;
			}
			// pattern
			int j = 1;
			while (j <= 2 * i - 1) {
				if (j % 2 == 0) {
					System.out.print("  ");
				} else {
					System.out.print("*" + " ");
				}
				j++;
			}
			m--;
			i++;
			System.out.println();
		}

	}

}
