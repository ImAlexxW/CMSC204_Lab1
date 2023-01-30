
public class SocSecException extends Exception
{
	public SocSecException(String error)
	
		{
		
		super("\nSocial Security Number is invalid : " + error);
		
		}
}


