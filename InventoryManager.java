import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class InventoryManager {
    public static void main (String args[]) throws FileNotFoundException {
        //Initialization of objects/vars
        File myObj = new File("inventory.txt");
        Scanner myReader = new Scanner(myObj);
        Scanner inputScan = new Scanner(System.in);
        inventoryItems newItem = new inventoryItems();
        newItem.setItem(0, "Random item", 199, 1 );
        int select = 0;


        //Reader prototype
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();

        newItem.setItem(0, "Random item", 199, 1 );
 
      
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

 