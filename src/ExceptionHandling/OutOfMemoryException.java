package ExceptionHandling;

public class OutOfMemoryException {

	    public static void main(String[] args) {
	    	
	    	System.out.println("Start");
	    	
	        try {
	            // Create an ArrayList to store a large number of objects, causing an OutOfMemoryError
	            java.util.List<Integer> list = new java.util.ArrayList<>();
	            while (true) {
	                list.add(4);
	            }
	        } catch (OutOfMemoryError e) {
	            System.out.println("Handled");
	        }
	  System.out.println("End");
	}

}
