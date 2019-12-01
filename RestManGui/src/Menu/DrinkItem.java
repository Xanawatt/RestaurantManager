package Menu;
/**
 *
 * @author garre
 */
public class DrinkItem extends MenuItem {

    private final boolean straw;
    private final String size;

    /**
     *
     * @param itemID
     * @param itemName
     * @param price
     * @param calories
     * @param straw
     * @param size
     */
    
    public DrinkItem(int itemID, String itemName, double price, int calories,
                    boolean straw, String size) {
        
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.calories = calories;
        this.straw = straw;
        this.size = size;
        
    }
    
    public boolean isStraw() {
        return straw;
    }

    public String getSize() {
        return size;
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
    
    
    
}
