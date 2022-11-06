class Exception1{
       public static void main(String [] args){
		 int a ,b ;
         a=3;b=0;
		 try{
	     System.out.println("In try block");	
         System.out.println("Result is: "+a/b);
		 }
		 //DEFAULT THROW ,OUR TRY AND DEFAULT CATCH 
		 finally{
         System.out.println("...rest of the code");		 
         }	   
	   }
}
