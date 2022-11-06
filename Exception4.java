//OUR THROW AND OUR CATCH
//Why we need "throw"?
//-->1.because we want to set a different message.
//-->2.because java cannot recognize exceptional situation of business logic. 
class Exception3{
	public static void main(String args[])
	{
	   	int a =45,b=0,res;
		try
		{		
		 if(b==0)
		    throw new ArithmeticException("Math Error");
		 res=a/b;
		 System.out.println("Result is :"+ res);
        }
        catch(ArithmeticException e)
		{
         System.out.println("Exception : "+ e.getMessage());
		}	
		System.out.println("...rest of the code");	//This Line will now be executed since "our" catch block is present
	}
}