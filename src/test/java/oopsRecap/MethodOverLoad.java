package oopsRecap;

public class MethodOverLoad {
	static int add(int a, int b){
		System.out.println("eheh");
		return a+b;}  
	static double add(int  a, char b){
		System.out.println("weel");
		return a+b;}  
	
	public static void main(String[] args) {
		
		System.out.println("hlro"+add(0, 0));
		
	}

}
