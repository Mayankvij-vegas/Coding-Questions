package Assignment_pattern;
import java.util.*;
public class Pascal_Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
int row=0;
int star=1;
while(row<n){
    int j=0;
    int ncr=1;
    
    while(j<star){
        System.out.print(ncr+"\t");
        ncr=(((row-j)*ncr)/(j+1));
   
        j++;   
    }
    star++;
    row++;
    System.out.println();
}
	}

}
