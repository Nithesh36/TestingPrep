package oopsRecap;


 class A{  
void msg() throws ArithmeticException{
	int ar[]= {1};
	System.out.println("Hello"+ar[9]);
}  
}  
  class B
{  
void msg(){System.out.println("Welcome");}  
void msg2(){
    System.out.println("Welcome2");
    
}  
} 
public class InheritanceDemo extends A
{
	
	//return type should be same
	// change our subclass method signature(return type ) or its name to remove the compilation error.
	void msg(){System.out.println("child helo");}  
	
	public static void main(String[] args) {
	  new	InheritanceDemo().msg();
	}
	

}
