package files;

import java.util.ArrayList;
import java.text.*;

public class MenuUpdater
{

	public static void main(String[] args)
	{
		// paths to the files to read & write
		String readPath = "src/files/old_menu.txt";
		String writePath = "src/files/new_menu.txt";
		
		//Will use to increase price by 10%
		double PRICE_INCREASE = 1.1;
		
		FileManager manager = new FileManager();
		manager.readFile(readPath);
		
		StringBuilder myString = new StringBuilder();
		ArrayList<MenuItem> menu= manager.getMenuItems();
		for (int item = 0; item < menu.size(); item++)
		{
			if (!menu.get(item).isSetForRemoval())
			{
				MenuItem currentItem = menu.get(item);
				
				double oldPrice = menu.get(item).getPrice();
				double newPrice = (oldPrice)*(PRICE_INCREASE);
				
				currentItem.setPrice(newPrice);
				
				myString.append(currentItem.getName());
				myString.append("\t");
				myString.append(currentItem.getType());
				myString.append("\t");
				myString.append(currentItem.getDescription());
				myString.append("\t");
				DecimalFormat two = new DecimalFormat("0.00");
				myString.append(two.format(currentItem.getPrice()));
				myString.append("\t");
				myString.append("No");
				myString.append("\n");
			}
		}
		String finalString = myString.toString();
		manager.writeFile(finalString, writePath);
		
	}

}
