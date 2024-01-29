public class Book extends Publication {
	//add author member to only be used in Book.java/ class(private)
	private String author; // Principle of least privilege 
	/**
	 * Constructs Book object
	 *  @param author: name of author
	 *  @param title: title of book 
	 *  @param genre: genre of the book
	 */
	public Book(String author, String title, String genre)
	{
		super(title, genre); //pulls in members from superclass Publication
		this.author = author; // sets author to user input/ this. denotes object
	}
	
	/**
	 * gathers User input and returns it as a string
	 */
	@Override
	public String getInfo() // overrides superclass Publication's getInfo method 
	{
		return (title + ", " + genre + ". Written By " + author);  // returns string of user input to be printed by main method
	}
	
	
	
	
	
}
