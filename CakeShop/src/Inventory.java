//Hayes Chiasson
//Student ID: 897578538

import java.util.Collections;
import java.util.ArrayList;

public class Inventory { 
	/*
	 * uses:
	 * has ArrayList of Cakes
	 * method AddCake to add a new cake to the Inventory's ArrayList
	 * method listInventory which printgs the cards of each individual cake in the invetory's ArrayList
	 * ^ sorted by flavor, if flavor is =, sort by price
	 */
	private static ArrayList<Cake>cakeInventory = new ArrayList<Cake>(); // crates ArrayList cakeInventory to be filled with Cake objects
	
	public void addCake(Cake newCake) // adds Cake objects into the cakeInventory ArrayList / mutator
	{
	cakeInventory.add(newCake); // adds newCake object new Cake into cakeInventory ArrayList
	}
	
	public void listInventory() //lists out the inventory of cakes within cakeInventory ArrayList (accessor)
	{
		Collections.sort(cakeInventory); // sorts the ArrayList 
		
		for (Cake newCake: cakeInventory)//iterate as many times as there are cakes in ArrayList cakeInventory/ can be flexible
		{
		newCake.printCard(); // uses printCard method to print out the value of the cake objects within cakeInventory ArrayList
		}
	}
	

}
