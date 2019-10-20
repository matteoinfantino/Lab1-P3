package pcd1920.cart;

/**
 * This class models an ADT of type Item in our AmazonCart scenario.
 * */
public class Item {

	/**
	 * Identifier for this item type.
	 * */
	private long id;

	/**
	 * Cost of this item
	 * */
	private int cost;
	
	/**
	 * Name of the item
	 * */
	private String name;
	
	/**
	 * Description of this item
	 * */
	private String description;
	
	/**
	 * Constructor for this ADT
	 * */
	public Item(long id, int cost, String name) {
		this.id = id;
		this.cost = cost;
		this.name = name;
	}

	/**
	 * Constructor for this ADT, qualifying all Item attributes.
	 * */
	public Item(long id, int cost, String name, String description) {
		this(id,cost,name);
		this.description = description;
	}

	/**
	 * Checks whether two Items are equals or not depending on their
	 * identifier
	 * 
	 * @param obj Should be an Item object
	 * @return true if the item obj is equal to this instance item,
	 * 			false otherwise
	 * */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Item) {
			if(this.id == ((Item)obj).id) {
				return true;
			}
		}
		return false;
	}


	/**
	 * Returns the internal representation of this item
	 * 
	 * @return a String representing the internal object state.
	 * */
	@Override
	public String toString() {return "Item con id: " + id;}
	
	public int getCost() {
		return cost;
	}
	
	public long getId() {
		return id;
	}

}
