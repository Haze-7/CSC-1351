
//Hayes Chiasson
//897578538

import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TextTranslator {

	public static void main(String[] args) throws FileNotFoundException {

//Pseudo Code
//Load list of acronyms from file acronyms.txt into a Map
		//use hashmap for easy search
		//maps good as acronym is key and long version is value
//Ask the user to enter a sentence
		//prompt and detect input with Scanner
//Replace all acronyms in the sentence with expanded form
		
		String acronym = "acronyms.txt";
		HashMap<String, String> acros = new HashMap<>(); // creation of Hashmap for storing acronyms

//Load the list of acronyms from the file acronyms.txt and store in hashmap

		try (Scanner input = new Scanner(new File(acronym))) {// reach each line try / catch for FileNotFoundException

			while (input.hasNextLine()) //iterate through file contents
			{
				String line = input.nextLine(); // read line
				String[] split = line.split("\t"); // split line into two parts key and value by the seperating tab
				acros.put(split[0].toLowerCase(), split[1].toLowerCase()); // insert both the key and value into the hashmap, with their new labels
			}
		} 
		catch (FileNotFoundException e) // catch the FileNotFoundException if thrown, and printStackTrace/ if file not found
		{
			e.printStackTrace();
		}

//Prompt the User
		System.out.print("Please enter a sentence: "); //
		Scanner in = new Scanner(System.in).useDelimiter("\\n");
		String userInput = in.next();

//split input into individual words to be tested for acronyms\

		String output = "";// serve as input storage
		String word = ""; // serve as input storage

		for (int i = 0; i < userInput.length(); i++) //loop through to find word and expansion
		{
			char h = userInput.charAt(i); //get current char

			if (Character.isLetterOrDigit(h)) //check for character to be number or digit
			{
				word += h; // add new character to word
			} 
			else // if character isn't a letter or digit
			{
				if (!word.isEmpty()) //check to see if there is a word
				{
					String replace = acros.get(word.toLowerCase()); // find expanded form within hashmap
					if (replace != null) // check for expanded form in list
					{
						output += replace; //add new expanded form to output
					}
					else // move on if no need to replace
					{
					output += word; //add original word to output
					}
					word = ""; // reset current to empty
				}
			output += h; // add current char to output
		}
	 }
		System.out.println(output.trim()); // print output
		in.close();// close Scanner resource leak
	}
}
