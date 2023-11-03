package ExceptionHandling;

public class StringIndexOutOfBoundsExceptionSample {

	    public static void main(String[] args) {
	    	
	    	System.out.println("Start");
	        String str = "Hello, World";

	        try {
	            char character = str.charAt(20); 
	            System.out.println(character);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Handled");
	        }
	        
	        System.out.println("End");
	    }
}
