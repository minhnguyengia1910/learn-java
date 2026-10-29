package chapter12.video127;
import java.util.List;
import java.util.ArrayList;
public class Video127 {
	public static void main(String[] args) {
		InventoryItem<Integer> product1 = new InventoryItem<>(1001, "Laptop Dell", 1500);
		InventoryItem<String> product2 = new InventoryItem<>("SKU12345", "iPhone 15", 1200); 
		InventoryUtils.printItemInfo(product1);
		InventoryUtils.printItemInfo(product2);
		List<InventoryItem<?>> arr = new ArrayList<>();
		arr.add(product1);
		arr.add(product2);
		double price = InventoryUtils.calculateTotalPrice(arr);
		System.out.println("Total price: " + price);
	}
}
