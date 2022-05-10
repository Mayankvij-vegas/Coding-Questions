package ArrayList_10;
import java.util.*; 
public class Arraylist_Demo {

	public static void main(String[] args) {
		// T
	//	ODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
		ArrayList<Integer>list=new ArrayList<>();
		// In heap new Array box[] will be created.
		System.out.println(list.size());
		System.out.println(list);
		//Add
		list.add(10);
		list.add(20);
		System.out.println(list);
		list.add(1,30);
		System.out.println(list);
		list.add(1,40);
		System.out.println(list);
		//set
		list.set(1,90);
		System.out.println(list);// diff between set and add. In set there is no shifting only overwriting.
		//To know size
		System.out.println(list.size());
		//Remove/delete
		System.out.println(list.remove(1));
		System.out.println(list);
		//to sort
		Collections.sort(list);
		System.out.println(list);
		//Reverse
		Collections.reverse(list);
		System.out.println(list);
	}

}
