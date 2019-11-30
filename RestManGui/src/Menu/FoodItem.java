package Menu;
/**
 *
 * @author garre
 */
public class FoodItem extends MenuItem {

    private boolean appetizer;
    private boolean spicy;

    /**
     *
     * @param itemID
     * @param itemName
     * @param price
     * @param calories
     * @param appetizer
     * @param spicy
     */
    
    public FoodItem(int itemID, String itemName, double price, int calories,
                    boolean appetizer, boolean spicy) {
        
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.calories = calories;
        this.appetizer = appetizer;
        this.spicy = spicy;
        
    }
    
    public boolean isAppeitizer() {
        return appetizer;
    }

    public boolean isSpicy() {
        return spicy;
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
