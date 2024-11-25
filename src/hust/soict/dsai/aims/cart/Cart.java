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
		invoice(itemsOrdered);
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc dvd) {
		int length = itemsOrdered.length;
		DigitalVideoDisc[] newCart = new DigitalVideoDisc[length + 1];
		for (int i = 0; i < itemsOrdered.length; i++) {
			newCart[i] = itemsOrdered[i];
		}
		newCart[length] = dvd;
		for (int i = 0; i < newCart.length; i++) {
			itemsOrdered[i] = newCart[i];
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int add_len = dvdList.length;
		DigitalVideoDisc[] newCart = new DigitalVideoDisc[itemsOrdered.length + add_len];
		for (int i = 0; i < itemsOrdered.length; i++) {
			newCart[i] = itemsOrdered[i];
		}
		for (int i = itemsOrdered.length; i < newCart.length; i++) {
			newCart[i + itemsOrdered.length] = dvdList[i];
		}
		for (int i = 0; i < newCart.length; i++) {
			itemsOrdered[i] = newCart[i];
		}
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		DigitalVideoDisc[] newCart = new DigitalVideoDisc[itemsOrdered.length + 2];
		for (int i = 0; i < itemsOrdered.length; i++) {
			newCart[i] = itemsOrdered[i];
		}
		newCart[itemsOrdered.length] = dvd1;
		newCart[itemsOrdered.length + 1] = dvd2;
		for (int i = 0; i < newCart.length; i++) {
			itemsOrdered[i] = newCart[i];
		}
	}
	
	public static void invoice(DigitalVideoDisc[] items) {
		int num = items.length;
		float total = 0;
		System.out.println("***********************CART***********************");
		System.out.println("Ordered items");
		
		for (int i = 0; i < num; i++) {
			System.out.println((i+1) + " - " + items[i].getTitle() + " - " + items[i].getCategory() + " - " + items[i].getDirector() + " - " + items[i].getLength() + " - " + items[i].getCost() +"$");
			total = total + items[i].getCost();
		}
		System.out.println("Total cost: " + total);
		System.out.println("*************************************************** ");
		
	}
}
