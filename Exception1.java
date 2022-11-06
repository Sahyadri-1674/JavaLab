//DEFAULT throw and OUR catch
import java.io.*;
class Exception1{
       public static void main(String [] args){
		 int a ,b ;
         a=3;b=0;        
		 String s = null;
		 try{
         System.out.println("Result is: "+a/b);
		 }
		 catch(ArithmeticException e){
			 System.out.println("Exception : "+ e.getMessage());
		 }
		 finally{
         System.out.println("...rest of the code");		 
         }	   
		 try{
			 System.out.println("Length of the String is: "+s.length());
		 }
		 catch(NullPointerException n){
			 System.out.println("Exception: "+n.getMessage());
		 }
		 System.out.println("Last Line");	
	   }
}