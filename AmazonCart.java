package pcd1920.cart;

import java.util.ArrayList;
import java.util.List;
/**
 * This class models an AmazonCart-like reality. Items along with their 
 * frequency are stored inside a List<>.
 * */
public class AmazonCart {

	/**
	 * Internal representation of the cart.
	 * */
	private List<ItemCount> cart = null;
	
	/**
	 * Sole constructor of this class used to build an empty cart.
	 * */
	public AmazonCart() {
		cart = new ArrayList<>();
	}
	
	/**
	 * Adds another item to this class.
	 * 
	 * @param item Used to add an Item to this cart.
	 * 
	 * */
	public void addItem(Item item) {
		cart.add(new ItemCount(item));
	}
	
	/**
	 * Returns the cost of the items residing in the cart.
	 * 
	 * @return int Cost of all the items inside the cart. 
	 * 
	 * */
	public int checkOut() {
		int cost = 0;
		for(int i = 0; i < cart.size(); i++) {
			cost += cart.get(i).cost();
		}
		return cost;
	}
	
	/**
	 * Returns the internal representation of this cart.
	 * 
	 * @return String Internal representation of this cart returned
	 * 				  as a String object.
	 * 
	 * */
	@Override
	public String toString() {
		String ret = "Nel carrello sono presenti i seguenti item";
		for(int i = 0; i < cart.size(); i++) {
			ret += "\nID: " + cart.get(i).getItem().getId();
		}
		return ret;
	}
	
	public static void main(String args[]) {
		Item i1 = new Item(1,21,new String("item1"));
		Item i2 = new Item(2,11,new String("item2"));
		AmazonCart ac = new AmazonCart();
		ac.addItem(i1);
		ac.addItem(i2);
		System.out.println(ac.checkOut());
	}
}
