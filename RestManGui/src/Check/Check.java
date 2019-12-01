/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Check;

import Menu.*;
import Table.*;
import java.util.ArrayList;

/**
 *
 * @author garre
 */
public class Check {
    private int id;
    private Table table;
    private boolean open; //Open checks are true or closed are false
    private double subtotal; //total price of all of the items
    private double total; // final total
    private ArrayList<MenuItem> items;
    
    public Check(int id, Table table){
        
        this.id = id;
        this.table = table;
        this.open = true;
        this.subtotal = 0.00;
        this.total = subtotal;
        
        items = new ArrayList<MenuItem>();
    }
}
