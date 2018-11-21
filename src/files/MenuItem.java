package files;

public class MenuItem
{
	// Variable declarations
	private String name = null;
	private String type = null;
	private String description = null;
	private double price = 0;
	private boolean toRemove = false;
	
	/**
	 * Constructs a menu item
	 * @param name the menu item's name
	 * @param type the menu item's type (entree, salad, etc.)
	 * @param desc the menu item's detailed description
	 * @param price the menu item's price
	 * @param remove if the menu item is marked for removal
	 */
	public MenuItem(String name, String type, String desc, 
			double price, boolean remove)
	{
		this.name = name;
		this.type = type;
		this.description = desc;
		this.price = price;
		this.toRemove = remove;
	}
	
	/**
	 * Default constructor
	 */
	public MenuItem() { }
	
	/***************************************************************
	 * GETTERS
	 ***************************************************************/
	
	public String getName()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public boolean isSetForRemoval()
	{
		return toRemove;
	}
	
	/***************************************************************
	 * SETTERS
	 ***************************************************************/
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setDescription(String desc)
	{
		this.description = desc;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setForRemoval(boolean remove)
	{
		this.toRemove = remove;
	}
}
