package Doubt_Bef_Recursion;
import java.util.*;
public class Next_Prermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	        int t =sc.nextInt();
	        while(t-->0){
	            int n=sc.nextInt();
	            int []arr= new int[n];
	            for(int i=0;i<n;i++){
	                arr[i]=sc.nextInt();
	            }
	            next_permutation(arr);
	            for(int i=0;i<arr.length;i++){
	                System.out.print(arr[i]+" ");
	            }
	            System.out.println();
	        }
	    }
	    public static int[] next_permutation(int []arr) {//2 4 5 4 3 1
	        int i=arr.length-2;//4
	          int p=0;//to rember inndex
	          if(arr[i]<arr[i+1]){
	            p=i;// 1
	          
	          for(int q=arr.length-1;q>=0;q--){//5 4 3 
	              if (arr[q]>arr[p]){
	                  int temp=arr[q];//5
	                  arr[q]=arr[p];//4
	                  arr[p]=temp;//5
	                  reverse(arr,p);
	                  break;}
	              }
	          }
	          else{
	            i--; //3 2 1
	          }
	    }
	    public static int []reverse(int []arr,int p){
	        int i=arr.length-1;
	        int j=p;
	        while(j<i){
	            int temp=arr[j];
	            arr[j]=arr[i];
	            arr[i]=temp;
	            i--;
	            j++;
	        }
	     
	        Scanner sc=new Scanner(System.in);
	        int t =sc.nextInt();
	        while(t-->0){
	            int n=sc.nextInt();
	            int []arr= new int[n];
	            for(int i=0;i<n;i++){
	                arr[i]=sc.nextInt();
	            }
	            next_permutation(arr);
	            for(int i=0;i<arr.length;i++){
	                System.out.print(arr[i]+" ");
	            }
	            System.out.println();
	        }
	    }
	    public static int[] next_permutation(int []arr) {//2 4 5 4 3 1
	        int i=arr.length-2;//4
	          int p=0;//to rember inndex
	          if(arr[i]<arr[i+1]){
	            p=i;// 1
	          
	          for(int q=arr.length-1;q>=0;q--){//5 4 3 
	              if (arr[q]>arr[p]){
	                  int temp=arr[q];//5
	                  arr[q]=arr[p];//4
	                  arr[p]=temp;//5
	                  reverse(arr,p);
	                  return arr;}
	              }
	          }
	          else{
	            i--; //3 2 1
	          }
	    }
	    public static int[] reverse(int []arr,int p){
	        int i=arr.length-1;
	        int j=p;
	        while(j<i){
	            int temp=arr[j];
	            arr[j]=arr[i];
	            arr[i]=temp;
	            i--;
	            j++;
	        }
	        
	    }
	}

