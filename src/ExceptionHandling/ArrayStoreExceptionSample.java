package ExceptionHandling;

public class ArrayStoreExceptionSample {

	    public static void main(String[] args) {
	    	
	    	System.out.println("Start");
	    	
	        Object[] objectArray = new Integer[5];
	        
	        try {
	        	
	            objectArray[0] = "Hello"; 
	            System.out.println(objectArray[0]);
	        } catch (ArrayStoreException e) {
	        	
	            System.out.println("Handled");
	        }
	        System.out.println("End");
	    }

}
