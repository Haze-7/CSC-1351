//Hayes Chiasson
//Student ID: 897578538

public class Cake implements Comparable<Cake> { // comparable interface added
	
	/*
	 * What we're adding / changing
	 * Members are now private(best practice)
	 * add a parametrized constructor to initialize flavor, price, and tiers
	 * implement comparable interface
	 * complies with principle of least privilege 
	 * 
	 */

	//set members / instance variables // switched to private
	private String flavor; // flavor of the cake
	private int tiers; // # of tiers on the cake
	private double price; // price of each cake
	
	public Cake()
	{
		flavor = ""; // sets flavor default
		tiers = 0; // sets # of tiers default
		price = 0; // sets the default pric
	}
	/**
	 * Constructs a Cake object e
	 *  @param flavor: flavor of the cake
	 *  @param tiers: # of tiers on the cake
	 *  @param price: The price of a cake
	 */
	public Cake(String Flavors, int Tiers, double Prices) // creates Cake Object w/ parameters
	{
		flavor = Flavors;
		tiers = Tiers;
		price = Prices;
	}	
	/**
	 * Sets the price of each cake
	 * @param cakePrice: The user inserted price of each cake
	 */
	public void setPrice(double cakePrice) // mutator method
	{
		price = cakePrice; // sets the price of the cake to that of the user input passed in through the explicit parameter
	}


	public int compareTo(Cake other) //Compares Cake Objects
	{
		if (flavor.compareTo(other.flavor) != 0) // if they're not equal, compare by flavor (String so alphabetized)
		{
			return flavor.compareTo(other.flavor); //return the results to be displayed
		}
		else// or
		{
			return Double.compare(price, other.price); //compare by price instead if they're equal
		}
	}
		
		/**
		 * Prints out the card/ info for each cake and its details
		 */
		public void printCard()
		{
			System.out.printf("A " + tiers + " tier " + flavor + " cake\t\t$%.2f\n\n", price); // prints formatted output
			//note for above: placed 2nd \n to follow with the presentation of the output on the instructions
		}


				
	}
	

