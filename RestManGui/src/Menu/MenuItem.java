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
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
    
    public int getCalories() {
        return calories;
    }
    
    public static int getNextID() {
        return nextID;
    }
}
