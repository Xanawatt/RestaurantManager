package Menu;
/**
 *
 * @author garre
 */
public class MenuItem {
    
    int itemID;
    String itemName;
    double price;
    int calories;   
    static int nextID = 1;
    
    public MenuItem() {
        
    }
    
    public MenuItem(int itemID, String itemName, double price, int calories) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.calories = calories;
    }
    
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public void setItemPrice(double price) {
        this.price = price;
    }
    
    public void setItemCalories(int calories) {
        this.calories = calories;
    }
    
    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return price;
    }
    
    public int getItemCalories() {
        return calories;
    }
    
    public static int getNextID() {
        return nextID;
    }
}
