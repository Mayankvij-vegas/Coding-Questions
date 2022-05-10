package DataType_Assignment;
import java.util.*;
public class Boston_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int ans=0;
		int  sum=0;
		while(m>0){
		    int rem=m%10;
		    sum=sum+rem;
		    m=m/10;
		}

		    for(int i=2;i<=n && n>0;i++){
		        int j=2;
		        if(i==2){
		            
		       
		        while(j<i){
		            continue
		        if(n%i==0 && i%j!=0){
		ans=ans+i;
		        j++;
		          n=n/i;
		        i=2;
		      }
		    }
		    }
		if(sum==ans){
		    System.out.println("1");
		}else{
		    System.out.println("0");
		}
	}

}
