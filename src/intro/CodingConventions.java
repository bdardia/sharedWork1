package intro;

public class CodingConventions 
{
	// fields are at the top
	// forward declarations
	private String name;
	private String description;
	
	// constructor, so the return type is an instance of the class
	// a constructor must always be named after the class
	public CodingConventions(String name, int descriptionIndex)
	{
		// distinguish between parameters and other variables by using "this"
		
		this.name = name;
		description = " is a " + IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	public void doStuff()
	{
		String output = name + description;
		
		// static method call
		System.out.println(output);
	}
}