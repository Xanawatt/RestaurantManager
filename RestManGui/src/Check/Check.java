package Check;

import Menu.*;
import Table.*;
import java.util.ArrayList;
/**
 *
 * @author Ethan Norlander
 */
public class Check implements SimpleCheckout{
    private int id;
    private Table table;
    private boolean open; //Open checks are true or closed are false
    private double subtotal; //total price of all of the items
    private double total; // final total
    private double discount;
    private ArrayList<MenuItem> items;
    
    public Check(int id, Table table, double discount){
        
        this.id = id;
        this.table = table;
        this.open = true;
        this.discount = discount;
        this.subtotal = 0.00;
        this.total = 0.00;
        
        items = new ArrayList<MenuItem>();
    }
    
    @Override
    public void addItems(MenuItem item){
        getItems().add(item);
        subtotal += item.getPrice();
    }
    
    @Override
    public void checkout(double tip){ 
        total = subtotal * (1 - getDiscount()); // discount would be a percent off ( 25% off would be discount == 0.25 )
        total += total * 0.07;
        total += tip;
        open = false;
    }
    
    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    /*
     Get Methods
    */

    public int getId() {
        return id;
    }

    public Table getTable() {
        return table;
    }

    public boolean isOpen() {
        return open;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public double getDiscount() {
        return discount;
    }
}
