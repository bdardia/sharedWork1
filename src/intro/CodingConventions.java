package intro;

public class CodingConventions 
{
	// fields are at the top
	// forward declarations
	private String name;
	private String description;
	
	// constructor, so the return type is an instance of the class
	// a constructor must always be named after the class
	public CodingConventions()
	{
		name = "Benjamin";
		description = "student";
	}
	public void doStuff()
	{
		// static method call
		System.out.println("123");
	}
}