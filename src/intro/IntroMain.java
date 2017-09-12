// package declaration
package intro;

public class IntroMain 
{
	public static final String[] DESCRIPTIONS = {"student", "teacher"};
	
	public static void main(String[] args)
	{
		// declaration of an instance of CodingConventions
		// also being instantiated
		// always use new when calling constructors
		
		int numberOfPeople = 10;
		
		for(int i = 0; i < numberOfPeople; i += 1)
		{
			CodingConventions conventionsInstance = new CodingConventions("Benjamin", i%2);
			
			// local variables are not fields
			// they are variables that are only used in the scope of a method
			// after the method they are destroyed
			
			// instance method call
			conventionsInstance.doStuff(); 
		}
		
	}
}