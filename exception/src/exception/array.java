package exception;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int ary[]= {1,2,3,4,5,6};
  
   try
     {System.out.println(ary[3]/0);}
   
  // catch(ArithmeticException c)
    // {System.out.println("error");
     //c.printStackTrace();}

    catch (ArrayIndexOutOfBoundsException a) 
     {System.out.println(a);}
    
   finally {
	   System.out.println("this is important code");
   }
	}
}
