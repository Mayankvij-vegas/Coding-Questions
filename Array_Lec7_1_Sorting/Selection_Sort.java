package Array_Lec7_1_Sorting;
import java.util.*;
public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Selection(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			}
			public static void Selection(int[] arr) {
				for(int i=0;i<arr.length;i++) {
					int min_index=i;
					for(int j=i+1;j<arr.length;j++) {
						if(arr[j]<arr[min_index]) {
							min_index=j;
						}
					}
					int temp=arr[min_index];
					arr[min_index]=arr[i];
					arr[i]=temp;
				}
		
	}

}
