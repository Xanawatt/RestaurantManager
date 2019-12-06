package Menu;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author garre
 */
public class Menu {
    
    ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public Menu() {
    }
    
    public void addToMenu(MenuItem newItem) {
        menu.add(newItem);
    }
    
    public void removeFromMenu(MenuItem itemToDelete) {
        menu.remove(itemToDelete);
    }
    
    public void updateItemFromMenu(MenuItem itemToUpdate) {
        int index = menu.indexOf(itemToUpdate);
        menu.set(index, itemToUpdate);
    }
    
    public MenuItem getMenuItem(String targetName) {
        MenuItem menItem = new MenuItem();
        for (MenuItem i : menu) {
            if (i.getItemName().equals(targetName)) {
                return i;
            }
        }
        return menItem;
    }
    
    public MenuItem getMenuItem(int index) {
        return menu.get(index);
    }
    
    public MenuItem getRandomMenuItem () {
        
        int randomInt = ThreadLocalRandom.current().nextInt(1, menu.size());
        MenuItem choice = menu.get(randomInt);
    
        return choice;
    }
    
    public ArrayList<MenuItem> getAllMenuItems () {
        for (MenuItem i : menu) {
            System.out.println(i.getItemName());
        }
        return menu;
    }
    
}
