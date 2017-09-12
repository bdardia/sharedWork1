package intro;

public class CodingConventions 
{
	// fields are at the top
	// forward declarations
	private String[] name;
	private String description;
	
	// constructor, so the return type is an instance of the class
	// a constructor must always be named after the class
	public CodingConventions(String[] name, int descriptionIndex)
	{
		// distinguish between parameters and other variables by using "this"
		for (int i = 0; i < name.length; i += 1)
		{
			this.name[i] = name[i];	
		}
		description = " is a " + IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	public void doStuff()
	{
		for (int i = 0; i < name.length; i += 1)
		{
			String output = name[i] + description;
			System.out.println(output);
		}
	}
}
