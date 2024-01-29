package samp;

public class Static_variable1 {
	
   static int count=0;//will get memory only once and retain its value
		
   Static_variable1 (){
		count++;
		System.out.println(count);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_variable1 c1=new Static_variable1 ();
		Static_variable1 c2=new Static_variable1 ();
		Static_variable1 c3=new Static_variable1 ();
			}
			}
	


