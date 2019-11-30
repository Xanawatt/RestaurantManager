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
    
    public MenuItem getRandomMenuItem () {
        
        int randomInt = ThreadLocalRandom.current().nextInt(1, menu.size());
        MenuItem choice = menu.get(randomInt);
    
        return choice;
    }
    
    public void getAllMenuItems () {
        for (MenuItem i : menu) {
            System.out.println(i.getItemName());
        }
    }
    
}
