package Table;
import Employee.*;
/**
 *
 * @author garre
 */
public class Table {
    
    private String name;
    private int chairs;
    private boolean occupied;
    private Employee assignedWaiter;

    public Table(String name, int chairs, boolean occupied, Employee assignedWaiter) {
        this.name = name;
        this.chairs = chairs;
        this.occupied = occupied;
        this.assignedWaiter = assignedWaiter;
    }

    public String getName() {
        return name;
    }

    public int getChairs() {
        return chairs;
    }

    public boolean isOccupied() {
        return occupied;
    }
    
    public Employee getAssignedWaiter() {
        return assignedWaiter;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    
}
