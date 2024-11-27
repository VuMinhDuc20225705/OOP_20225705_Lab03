package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private static DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	int qtyOrdered = itemsOrdered.length;
	public static void main(String[] args) {
		// Create new cart
		Cart anOrder = new Cart();
		
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", 
				"Animation", 19.95f);
		anOrder.addDigitalVideoDisc(dvd3);
		//System.out.println(itemsOrdered.length);
		invoice(itemsOrdered);
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc dvd) {
		int length = 0;
		//itemsOrdered[length] = dvd;
		for (DigitalVideoDisc ptr : itemsOrdered) {
			if (ptr != null) length++;
		}
		itemsOrdered[length] = dvd;
	}
	
	public static void invoice(DigitalVideoDisc[] items) {
		int length = 0;
		for (DigitalVideoDisc ptr : itemsOrdered) {
			if (ptr != null) length++;
		}
		float total = 0;
		System.out.println("***********************CART***********************");
		System.out.println("Ordered items");
		
		for (int i = 0; i < length; i++) {
			System.out.println((i+1) + " - " + items[i].getTitle() + " - " + items[i].getCategory() + " - " + items[i].getDirector() + " - " + items[i].getLength() + " - " + items[i].getCost() +"$");
			total = total + items[i].getCost();
		}
		System.out.println("Total cost: " + total +"$");
		System.out.println("*************************************************** ");
		
	}
}
