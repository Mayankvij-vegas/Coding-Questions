package Assignment_pattern;
import java.util.*;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int m = n -1;
		int star = 1;
		int val = row;
		while (row <= 2*n-1) {
			// space
			int space = 1;
			while (space <= m) {
				System.out.print("\t");
				space++;
			}
			// pattern
			int j = 1;
			if (row <=n ) {
				val = row;
			} else {
				val=(2*n) -row;
			}

			while (j <= star) {
				System.out.print(val + "\t");
				if (j < (star + 1) / 2) {
					val++;
				} else {
					val--;
				}
				j++;

			}

			if (row <n) {
				m--;
				star += 2;
			} else {
				m++;
				star -= 2;
			}
			row++;
			System.out.println();
		}
	}

}