import java.util.Scanner;
public class InventoryManager {
    public static void main (String args[]) {

        Scanner inputScan = new Scanner(System.in);
        inventoryItems newItem = new inventoryItems();
        newItem.setItem(0, "Random item", 199, 1 );
        int select = 0;
      
        while(select != 3) {
            
            System.out.println("Please enter 1 - 3");
            select = inputScan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("lol");
                    break;
                case 2:
                    System.out.println("lol2");
                    break;
                case 3: 
                    System.out.println("Out");
                    select = 3;
                    break;
                }
            }
            inputScan.close();
        }
        
        
}

 