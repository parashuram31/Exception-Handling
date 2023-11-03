package ExceptionHandling;

public class NumberFormatExceptionSample {

	    public static void main(String[] args) {
	    	
	    	System.out.println("Start");
	        String str = "abc";

	        try {
	            int number = Integer.parseInt(str);
	            System.out.println(number);
	            
	        } catch (NumberFormatException e) {
	        	
	            System.out.println("Handled");
	        }
	        
	        System.out.println("End");
	}

}
