
public class InventoryManager {
    public static void main (String args[]) {
        inventoryItems newItem = new inventoryItems();
        newItem.itemName = "5600x";
        System.out.println(newItem.getItemName());
        newItem.setItem(0, "Ryzen 5600x", 199, 1 );
        System.out.println(newItem.getPrice());
        System.out.println("Hello World");

    }
}
 