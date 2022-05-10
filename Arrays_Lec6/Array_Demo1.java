package Arrays_Lec6;

public class Array_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr=new int [5];
//get
System.out.println(arr);
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);
//System.out.println(arr[5]);//Since array size is 5 from 0 to 4 so it will be out of bound.
//set
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);
//System.out.println(arr[5]);
System.out.println(arr.length);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]=(100)*(i+1));
}
	}

}
