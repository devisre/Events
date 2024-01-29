package operator;

public class while_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1;
 while (a<=20) {
	 if (a%3==0&&a%5==0) {
		 System.out.println("multiple of 3 and 5");}
	 else if (a%3==0) {
		 System.out.println("multiple of 3");}
	 else if (a%5==0){
			 System.out.println("multiple of 5");}
		 
		 else {
	System.out.println(a);
		 }
	a++;
}

	}

}
