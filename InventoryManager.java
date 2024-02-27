import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class InventoryManager {
    public static void main (String args[]) throws FileNotFoundException {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

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

 