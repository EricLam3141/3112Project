public class inventoryItems {
    private int invNumber;
    public String itemName;
    public int price;
    public int weight;

    public inventoryItems() {
        int invNumber;
        String itemName;
        int price;
        int weight;
    }

    public int getInvNumber (){
        return invNumber;
    }
    public String getItemName (){
        return itemName;
    }
    public int getPrice (){
        return price;
    }
    public int getWeight (){
        return weight;
    }
    public void setInvNumber (int number) {
        this.invNumber = number;
    }
    public void setItemName (String name) {
        this.itemName = name;
    }
    public void setItemPrice (int newPrice) {
        this.price = newPrice;
    }
    public void setWeight (int newWeight) {
        this.weight = newWeight;
    }
    public void setItem (int invNumber, String name, int price, int weight) {
        this.invNumber = invNumber;
        this.itemName = name;
        this.price = price;
        this.weight = weight;
    }



}
