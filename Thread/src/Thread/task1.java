package Thread;

public class task1 {
	int ticket=500;
   synchronized void booktickets(int noOfticketsToBook) {
	   System.out.println("booking...");

	 if (this.ticket<noOfticketsToBook) {
	    	System.out.println("no tickets available,wait for cancellation");
	    
	 try {wait();}
	 catch(Exception ex) {
	    	System.out.println(ex);}}
	 
	 this.ticket-=noOfticketsToBook;
	    System.out.println("booking completed ");}
	    
	  synchronized void cancellation(int cancelthetickets) {
	    	System.out.println("canceling...");
	    this.ticket-=cancelthetickets;
	    System.out.println("cancellation completed");
	    notify();
	    
	      
   }

	
		
	}

