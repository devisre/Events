package exception;

public class customexample1 {
	void weightcheck(int weight)
	throws InvalidProductException{
		if (weight>100)
	throw new InvalidProductException("you are overweight");
	}

	public static void main(String[] args) {
		customexample1 ob=new customexample1();
		try {ob.weightcheck(50);}
		catch(InvalidProductException e) {
			System.out.println("checked");
			System.err.println(e.getMessage());
		}
        finally {
        	System.out.println("code is checked");
        }
	}

}
