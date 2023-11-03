package ExceptionHandling;

public class NullPointerExceptionSample {
    public static void main(String[] args) {
    	
    	System.out.println("Start");
        String string = null; 
        
        try {
            int length = string.length();
            System.out.println("Length of the string");
            
        } catch (NullPointerException e) {
           
            System.out.println("Handled");
        }
        
        System.out.println("End");
    }
}

