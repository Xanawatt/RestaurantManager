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
        super(itemID, itemName, price, calories);
        
        this.straw = straw;
        this.size = size;
        MenuItem.nextID += 1;
    }
    
    public boolean isStraw() {
        return straw;
    }

    public String getSize() {
        return size;
    }
}
