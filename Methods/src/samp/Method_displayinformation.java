package samp;

public class Method_displayinformation {
	Method_displayinformation(){
		System.out.println("this is default constructor");
	}
	Method_displayinformation(String b){
		System.out.println("this is parameterized constructor");
	}
	int rollno;
	String name;
	void insertRecord(int r,String n) {
	rollno=r;
	name=n;

	}
	void displayinFormation() { System.out.println(rollno+""+name);}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Method_displayinformation S1=new  Method_displayinformation();
		 Method_displayinformation S2=new  Method_displayinformation("ball");
		 S1.insertRecord(12, "Parvathy");
		 S2.insertRecord(7, "aswathy");
		 S1.displayinFormation();
		 S2.displayinFormation();

	}
	

}
