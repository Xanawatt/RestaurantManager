/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

/**
 *
 * @author schne
 */
public class InventoryItem {
    private final String name;
    private final int ID;
    private int quantity;
    private double priceToStock;
    
    public InventoryItem(String name, int ID, int quantity, double priceToStock) {
        this.name = name;
        this.ID = ID;
        this.quantity = quantity;
        this.priceToStock = priceToStock;
    }
    
    /**
     * Updates the quantity of the item to a new amount
     * @param newQuantity 
     */
    public void updateQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    
    /**
     * Updates the price to stock the item to a new amount
     * @param newPriceToStock 
     */
    public void updatePriceToStock(double newPriceToStock) {
        priceToStock = newPriceToStock;
    }
    
    @Override
    public String toString() {
        return "Name: '" + name + "'\t ID: '" + ID + "'\t Quantity: '" + quantity + "'\t Price to Stock: '" + priceToStock + "'";
    }
    
    /**
     * Get Methods
     */
    public String getName() {
        return name;
    }
    
    public int getID() {
        return ID;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getPriceToStock() {
        return priceToStock;
    }
    
    
}
