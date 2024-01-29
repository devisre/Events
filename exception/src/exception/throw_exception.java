package exception;

public class throw_exception {
	static void validate(int age) {
	if(age<18) 
		throw new ArithmeticException("not valid");
	else 
		System.out.println("you can vote");}
	  

	public static void main(String[] args) {
		// throw_exception ob=new  throw_exception();
		 validate(16);
		 System.out.println("");
	}

}
