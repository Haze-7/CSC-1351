
public class CakeShop {

	public static void main(String[] args) {

	Inventory cakeInventory = new Inventory();

	cakeInventory.addCake(new Cake("Chocolate", 1, 149.99));
	cakeInventory.addCake(new Cake("Chocolate", 3, 299.99));
	cakeInventory.addCake(new Cake("Carrot", 2, 99.99));
	cakeInventory.addCake(new Cake("Vanilla", 6, 199.99));

	cakeInventory.listInventory();
	}

}
