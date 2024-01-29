package Thread;

public class wait_eg1 {
	int amount=5000;
	synchronized void withdraw(int amount) {
		System.out.println("withdraw..");
	
    if (this.amount<amount) {
    	System.out.println("not enough balance,wait for deposit");
    
    try {wait();}
    catch(Exception ex) {
    	System.out.println(ex);}}
    this.amount-=amount;
    System.out.println("withdraw completed ");}
    
    synchronized void deposit(int amount) {
    	System.out.println("depositing..");
    this.amount+=amount;
    System.out.println("deposit completed");
    notify();
    
    
   }}
