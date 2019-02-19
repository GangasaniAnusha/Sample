package exceptions;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("trying exception");
		int[] a=new int[5];

	try {

	
	System.out.println(a[4]);
}

catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
	finally {
		
	}
	
try {
	System.out.println(3/0);
}
catch(ArithmeticException e1) {
	System.out.println(e1);
}

catch(NullPointerException e1) {
	System.out.println(e1);
}

System.out.println("completed");
	}

}
