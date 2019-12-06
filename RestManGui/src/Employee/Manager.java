package Employee;

import Menu.MenuItem;

/**
 *
 * @author garre
 */
public class Manager extends Employee {
    
    public Manager(String name, int age, String title, int id, double wage) {
        super(name, age, title, id, wage);
        
        //Employee.nextID += 1;
    }
    
}
