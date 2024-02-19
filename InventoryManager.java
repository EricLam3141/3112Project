import java.util.Scanner;
public class InventoryManager {
    public static void main (String args[]) {
        int off = 1;
        Scanner inputScan = new Scanner(System.in);
        inventoryItems newItem = new inventoryItems();
        newItem.itemName = "5600x";
        System.out.println(newItem.getItemName());
        newItem.setItem(0, "Random item", 199, 1 );
        System.out.println(newItem.getPrice());
        System.out.println("Hello World");
        System.out.println("What");

        int select = inputScan.nextInt();
        while(off == 1 ) {
            switch (select) {
                
                case 1:
                    System.out.println("lol");
                    break;
                case 2:
                    System.out.println("lol2");
                    break;
                case 3: 
                    System.out.println("Out");
                    off = 0;
                    break;
                }
                select = inputScan.nextInt();
                
            }
        }

}

 