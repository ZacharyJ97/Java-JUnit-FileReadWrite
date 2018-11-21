package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager
{
	// TO-DO Instance variable
	ArrayList<MenuItem> menuItems;
	
	/**
	 * Constructor
	 */
	public FileManager()
	{
		menuItems = new ArrayList<MenuItem>();

	}
	
	/**
	 * Opens and reads the file at the given file path 
	 * @param filePath the path to the file to read
	 * @return the contents of the file
	 */
	public void readFile(String filePath) 
	{
		try (BufferedReader read = new BufferedReader(new FileReader(filePath)))
		{
			//each line
			String item = null;
			
			//As long as each line(item) is not null
			while ((item = read.readLine()) !=null)
			{
				//Split the item line into separate parts after tab characters and store in temp array
				String items[] = item.split("\t");
				
				//Assigning each part of the line item to a variable
				String name = items[0];
				String type = items[1];
				String description = items[2];
				double price = Double.parseDouble(items[3]);
				boolean toRemove;
				
				//Deciding the removal boolean
				if (items[4].equalsIgnoreCase("yes"))
				{
					toRemove = true;
				}
				else
				{
					toRemove = false;
				}
				
				//Create MenuItem
				MenuItem newItem = new MenuItem(name, type, description, price, toRemove);
				//Add MenuItem to arraylist of menu items
				menuItems.add(newItem);

			}
			
		} catch (FileNotFoundException e) {
			// Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	/**
	 * Writes the given text to the file at the given file path
	 * @param text the contents to write
	 * @param writePath the path to the file in which to write
	 */
	public void writeFile(String text, String writePath)
	{
		//Use a filewriter but change it to a buffered writer. Open writing on the file provided by writePath
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(writePath)))
		{
			// Write given text to file
			writer.write(text);	
		} 
		catch (IOException except)
		{
			except.printStackTrace();
		}

	}
	
	public ArrayList<MenuItem> getMenuItems()
	{
		return menuItems;

	}
	

}

