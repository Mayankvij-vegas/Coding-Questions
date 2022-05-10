package Lec2;

public class patern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int n = 5;
		int m = n;
		int row = 1;
		while (row <= n) {
			// space
			int space = 1;
			while (space <= m - 3) {
				System.out.print("\t\t");
				space++;
			}
			// pattern
			int j = 1;

			while (j <= i) {
				System.out.print("*" + "\t");
				j++;
			}
			if (row <= n - 3) {
				m--;
				i+=2;;
			} else {
				m++;
				i-=2;
			}
			row++;
			System.out.println();
		}

	}
}
