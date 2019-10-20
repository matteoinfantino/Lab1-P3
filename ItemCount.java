package pcd1920.cart;

/**
 * This class wraps an Item object along with its count (number of items) 
 * inside the AmazonCart.
 * */
public class ItemCount {

	/**
	 * Item represented by this ADT
	 * */
	private Item item = null;

	/**
	 * Number of items this ADT represents
	 * */
	private int count = 0;
	
	/**
	 * Total number of this item sold
	 * */
	private static int totCount = 0;

	
	/**
	 * Constructor for this ADT.
	 * */
	public ItemCount(Item item) {
		this.item = item;
		count += 1;
	}
	
	/**
	 * Constructor for this ADT, fully qualifying all parameters.
	 * */
	public ItemCount(Item item, int count) {
		this(item);
		this.count = count;
	}
	
	
	/**
	 * Increments the number of this particular item represented by 
	 * this ADT
	 * */
	public void incrementCount() {
		count++;
	}
	
	/**
	 * Decrements the number of this particular item represented by 
	 * this ADT
	 * */
	public void decrementF() {
		if(count > 0) {
			count--;
		}
	}
	
	/**
	 * Returns the cost of all items represented by this ADT
	 * 
	 * @return int representing the cost of all items represented by this 
	 * 				ADT
	 * */
	public int cost() {
		return item.getCost() * count;
	}
	
	public Item getItem(){
		return item;
	}
}
