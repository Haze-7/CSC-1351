//Super class
public class Publication implements Comparable<Publication>{ // adds comparable interface/ superclass
	
	//create main members to be inherited
	protected String genre; // stores publication's genre
	protected String title; // stores publication's title
	
	/**
	 * Constructs Publication object
	 *  @param title: title of Publication
	 *  @param genre: genre of the Publication
	 */
	public Publication(String pTitle, String pGenre)
	{
		this.title = pTitle;
		this.genre = pGenre;
		
	}
	/**
	 * Compares/ sorts the Publications based on genre, or if the same, by the title
	 * @param Publication other: publication object
	 */
	public int compareTo(Publication other)
	{
		if (genre.compareTo(other.genre) != 0)
		{
			return (genre.compareTo(other.genre));
		}
		else
		{
			return (title.compareTo(other.title));
			
		}
	}
	
	/**
	 * gathers User input from above and returns it as a string
	 */
	public String getInfo()
	{
		return (title + ", " + genre + ".");
	}
	
	
}