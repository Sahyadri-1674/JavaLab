//OUR THROW AND DEFAULT CATCH
class Exception3{
	public static void main(String args[])
	{
	   	int a =45,b=0,res;
			if(b==0)
		     throw new ArithmeticException("Math Error");
		res=a/b;
		System.out.println("Result is :"+ res);
		
		System.out.println("...rest of the code");	//This Line will not be executed since default catch block is executed
	}
}