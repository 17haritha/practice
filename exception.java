package homelabs;
class InvalidPassException extends Exception {
	public InvalidPassException(String s)
	{
		super(s);
	}
}
public class Userexcp {
	static void validate(int pass) throws InvalidPassException
	{
		System.out.println(" Mobile lock Password");
	if(pass<5353)
		throw new InvalidPassException("Not valid");
	else
		System.out.println(" Valid");
	}
	public static void main(String []args) 
	{
		try
		{
			validate(5353);
		}
		catch(Exception m)
		{
			System.out.println("Excaption error : "+m);
		}
		     System.out.println("Mobile lock Opened");
	}