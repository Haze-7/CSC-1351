public class Magazine extends Publication { // Magazine is an offshoot / subclass of Publication

	// add publisher member to only be used in Book.java/ class(private)
	private String publisher; // Principle of least privilege
	/**
	 * Constructs Magazine object
	 *  @param publisher: name of publisher 
	 *  @param title: title of magazine 
	 *  @param genre: genre of the magazine
	 */
	public Magazine (String publisher, String title, String genre)
	{
		super(title, genre); // pulls in members from superclass Publication
		this.publisher = publisher; // sets publisher to user input/ this. denotes object
		
	}
	

	
	/**
	 * gathers User input and returns it as a string
	 */
	@Override
	public String getInfo() // overrides superclass Publication's getInfo method 
	{
		return (title + ", " + genre + ". Published by " + publisher); // returns string of user input to be printed by main method

	}
	
}