package Menu;
/**
 *
 * @author garre
 */
public class FoodItem extends MenuItem {

    private final boolean appetizer;
    private final boolean spicy;

    public FoodItem(int itemID, String itemName, double price, int calories,
                    boolean appetizer, boolean spicy) {
        super(itemID, itemName, price, calories);
        
        this.appetizer = appetizer;
        this.spicy = spicy;
        MenuItem.nextID += 1;
    }
    
    public boolean isAppeitizer() {
        return appetizer;
    }

    public boolean isSpicy() {
        return spicy;
    }
}
