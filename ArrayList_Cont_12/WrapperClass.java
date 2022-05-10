package ArrayList_Cont_12;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer a=100;
int a1=10;
System.out.println(a1);
System.out.println(a);
Short s1=78;       //class
Byte b1=19;        //class
System.out.println(s1);
System.out.println(b1);
a=a1;              //autoboxing
System.out.println(a);
Integer ii=100;
int i=10;
i=ii;              // Onboxing
System.out.println(i);
                  //  IMPORTANT
Integer c1=19;
Integer c2=190;
System.out.println(c1==c2);
Integer d1=190;
Integer d2=190;
System.out.println(d1==d2);
	}

}
