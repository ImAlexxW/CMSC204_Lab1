import java.util.Scanner;

public class SocSecProcessor

{

	public static void main (String [] args)
	
	{
	
		Scanner keyboard = new Scanner (System.in);
		
		String name;
		
		String socSecNumber;
		
		String response;
		
		char answer = 'Y';
		
		while (Character.toUpperCase(answer) == 'Y')
		
		{
		
			try
		
			{
		
				System.out.print("Name? \n");
				name = keyboard.nextLine();
		
				System.out.print("\nSSN?\n");
				socSecNumber = keyboard.nextLine();
		
				if(isValid(socSecNumber))
				{
		
					System.out.println(name + " " + socSecNumber + "is Valid");
		
				}
		
			}
		
			catch (SocSecException e) 
		
			{
		
				System.out.println(e.getMessage());
		
			}
		
			System.out.print("\nWould you like to continue? \n");
			response = keyboard.nextLine();
			answer = response.charAt(0);
		
		}
		
	}
		
		private static boolean isValid(String number)throws SocSecException
		
		{
		
			boolean goodSoFar = true;
		
			int index = 0;
		
			// To do: Task #2 step 2
		
			// Checks for the length of SSN
		
			if (number.length() != 11)
		
			{
		
				throw new SocSecException("Incorrect number of characters ");
		
			}
		
		for( index=0;index<number.length();++index)
		{
		
			if(index==3 || index==6)
			{
		
				if (number.charAt(index) != '-')
				{
		
					throw new SocSecException("Dashes are in the wrong position");
		
				}
		
			}
		
			else if (!Character.isDigit(number.charAt(index)))
		
			{
		
				throw new SocSecException("contains a character that is not a digit");
		
			}
		
		}
		
		
		return goodSoFar;
		
	}
	
}