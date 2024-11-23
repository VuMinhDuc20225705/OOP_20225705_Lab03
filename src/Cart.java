
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(/* insert disc information here */);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(/* insert disc information here */);
		anOrder.addDigitalVideoDisc(dvd2);
		
	}


	private void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		// TODO Auto-generated method stub
		
	}
	
	private void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		// TODO Auto-generated method stub
		
	}
	
	private void addDigitalVideoDisc (DigitalVideoDisc[] dvdlist) {
		
	}
	
	private void addDigitalVideoDisc (int amount) {
		
	}
	
	private void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		
	}
}
