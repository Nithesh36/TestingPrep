package exceptionsDemo;

public class ExceptionDemo {
	static int a[]= {1};
public static void errorMs() {
	try {
		System.out.println("wel");
		System.out.println(a[9]);
		
		throw new IndexOutOfBoundsException("Mh ind");
		
	}
	
	finally {
		System.out.println("helo");
//		try {
//			System.out.println(a[33]);
//		}
//		
//		catch (Exception $e) {
//			// TODO: handle exception
//			
//			System.out.println("eh");
//			$e.printStackTrace();
//		}
		
		
	}
	

}
	public static void main(String[] args) {
		
		errorMs();
		

	}

}
