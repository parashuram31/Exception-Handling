package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionSample {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
            
            FileInputStream fileInputStream = new FileInputStream("xyz.txt");
            fileInputStream.close();
            
          } catch (FileNotFoundException e) {
       
            System.out.println("Handled");
            
          } catch (IOException e) {
            
            System.out.println("IO Handled");
          }
		
		System.out.println("End");
      }
}
