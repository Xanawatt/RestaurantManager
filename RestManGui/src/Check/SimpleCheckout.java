/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Check;

import Menu.MenuItem;

/**
 *
 * @author schne
 */
public interface SimpleCheckout {
    void addItems(MenuItem item);
    void checkout(double tip);
    void setDiscount(double discount);
    
}
