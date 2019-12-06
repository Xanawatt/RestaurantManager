
import Menu.DrinkItem;
import Menu.FoodItem;
import Menu.Menu;
import Menu.MenuItem;
import java.awt.PopupMenu;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schne
 */
public class MenuGUI extends javax.swing.JFrame {
    Menu menu;
    DefaultListModel<String> mod = new DefaultListModel<String>();
    /**
     * Creates new form MenuGUI
     */
    public MenuGUI() {
        initComponents();
        menu = Driver.getMenu();
        loadItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMenuItems = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtIsAppetizer = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtItemID = new javax.swing.JTextField();
        txtItemPrice = new javax.swing.JTextField();
        txtItemCalories = new javax.swing.JTextField();
        txtIsSpicy = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtIsStraw = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        radFoodItem = new javax.swing.JRadioButton();
        radDrinkItem = new javax.swing.JRadioButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lstMenuItems.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMenuItemsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMenuItems);

        jLabel1.setText("Menu Items:");

        jLabel2.setText("Name:");

        jLabel3.setText("ID:");

        jLabel4.setText("Price:");

        jLabel5.setText("Calories:");

        jLabel6.setText("Appetizer?:");

        jLabel7.setText("Spicy?:");

        jLabel8.setText("Straw?:");

        jLabel9.setText("Size:");

        btnAdd.setText("Add Item");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        radFoodItem.setText("Food Item");
        radFoodItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFoodItemActionPerformed(evt);
            }
        });

        radDrinkItem.setText("Drink Item");
        radDrinkItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDrinkItemActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Item");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear Text");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtItemID)
                                    .addComponent(txtItemPrice)
                                    .addComponent(txtItemCalories)
                                    .addComponent(txtIsAppetizer)
                                    .addComponent(txtIsSpicy)
                                    .addComponent(txtIsStraw)
                                    .addComponent(txtSize)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radDrinkItem)
                                    .addComponent(radFoodItem))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemCalories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIsAppetizer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIsSpicy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIsStraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(radFoodItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radDrinkItem)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstMenuItemsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMenuItemsValueChanged
        MenuItem itemSelected;
        int index = lstMenuItems.getSelectedIndex(); 
        if (index < 0) {
            return;
        }
        
        itemSelected = menu.getMenuItem(index);
        txtItemName.setText(itemSelected.getItemName());
        txtItemID.setText(Integer.toString(itemSelected.getItemID()));
        txtItemPrice.setText(Double.toString(itemSelected.getItemPrice()));
        txtItemCalories.setText(Integer.toString(itemSelected.getItemCalories()));
        if (itemSelected instanceof FoodItem) {
            FoodItem food = (FoodItem) itemSelected;
            if (food.isAppeitizer()) {
                txtIsAppetizer.setText("Yes");
            } else {
                txtIsAppetizer.setText("No");
            }
            
            if (food.isSpicy()) {
                txtIsSpicy.setText("Yes");
            } else {
                txtIsSpicy.setText("No");
            }
            
            txtIsStraw.setText("");
            txtSize.setText("");
            txtIsAppetizer.setEnabled(true);
            txtIsSpicy.setEnabled(true);
            txtIsStraw.setEnabled(false);
            txtSize.setEnabled(false);
            radDrinkItem.setSelected(false);
            radFoodItem.setSelected(true);
        } else if (itemSelected instanceof DrinkItem) {
            DrinkItem drink = (DrinkItem) itemSelected;
            if (drink.isStraw()) {
                txtIsStraw.setText("Yes");
            } else {
                txtIsStraw.setText("No");
            }
            
            txtSize.setText(drink.getSize());
            
            txtIsAppetizer.setText("");
            txtIsSpicy.setText("");
            txtIsStraw.setEnabled(true);
            txtSize.setEnabled(true);
            txtIsAppetizer.setEnabled(false);
            txtIsSpicy.setEnabled(false);
            radDrinkItem.setSelected(true);
            radFoodItem.setSelected(false);
            
        }
        
        
        
    }//GEN-LAST:event_lstMenuItemsValueChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addItem();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteItem();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void radFoodItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFoodItemActionPerformed
        if (radFoodItem.isSelected()) {
            radDrinkItem.setSelected(false);
            txtIsStraw.setText("");
            txtSize.setText("");
            txtIsStraw.setEnabled(false);
            txtSize.setEnabled(false);
            txtIsAppetizer.setEnabled(true);
            txtIsSpicy.setEnabled(true);
        }
    }//GEN-LAST:event_radFoodItemActionPerformed

    private void radDrinkItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDrinkItemActionPerformed
        if (radDrinkItem.isSelected()) {
            radFoodItem.setSelected(false);
            txtIsAppetizer.setText("");
            txtIsSpicy.setText("");
            txtIsAppetizer.setEnabled(false);
            txtIsSpicy.setEnabled(false);
            txtIsStraw.setEnabled(true);
            txtSize.setEnabled(true);
        }
    }//GEN-LAST:event_radDrinkItemActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtIsAppetizer.setText("");
        txtIsSpicy.setText("");
        txtIsStraw.setText("");
        txtItemCalories.setText("");
        txtItemName.setText("");
        txtItemPrice.setText("");
        txtSize.setText("");
        radDrinkItem.setSelected(false);
        radFoodItem.setSelected(false);
        txtIsAppetizer.setEnabled(true);
        txtIsSpicy.setEnabled(true);
        txtIsStraw.setEnabled(true);
        txtSize.setEnabled(true);
        
        loadItems();
    }//GEN-LAST:event_btnClearActionPerformed

    private void loadItems() {
        txtItemID.setText(Integer.toString(MenuItem.getNextID()));
        txtItemID.setEnabled(false);
        ArrayList<MenuItem> menuItems = menu.getAllMenuItems();
        lstMenuItems.setModel(mod);
        mod.removeAllElements();
        
        menuItems.forEach((i) -> {
            mod.addElement(i.getItemName());
        });
    }
    
    private void addItem() {
        if (validateInput() == false) {
            return;
        }
        
        MenuItem itemToAdd = new MenuItem();
        
        if (radDrinkItem.isSelected()) {
            boolean isStraw;
            if (txtIsStraw.getText().toLowerCase().equals("yes")) {
                isStraw = true;
            } else {
                isStraw = false;
            }
            
            itemToAdd = new DrinkItem(MenuItem.getNextID(), 
                                      txtItemName.getText(), 
                                      Double.parseDouble(txtItemPrice.getText()), 
                                      Integer.parseInt(txtItemCalories.getText()), 
                                      isStraw, 
                                      txtSize.getText());
            
        } else if (radFoodItem.isSelected()) {
            boolean isAppetizer;
            boolean isSpicy;
            
            isAppetizer = txtIsAppetizer.getText().toLowerCase().equals("yes");
            isSpicy = txtIsSpicy.getText().toLowerCase().equals("yes");
            
            itemToAdd = new FoodItem(MenuItem.getNextID(), 
                                     txtItemName.getText(), 
                                     Double.parseDouble(txtItemPrice.getText()), 
                                     Integer.parseInt(txtItemCalories.getText()), 
                                     isAppetizer, 
                                     isSpicy);
        }
        
        menu.addToMenu(itemToAdd);
        loadItems();
        
    }
    
    private void deleteItem() {
        MenuItem itemSelected;
        int index = lstMenuItems.getSelectedIndex(); 
        if (index < 0) {
            return;
        }
        
        itemSelected = menu.getMenuItem(index);
        if (JOptionPane.showConfirmDialog(this, "Are you sure you want to delete " + itemSelected.getItemName() + "?") == 0) {
            menu.removeFromMenu(itemSelected);
            loadItems();
        }
        
    }
    
    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void setFocus(JTextField textbox) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                textbox.requestFocus();
            }
        });
        
    }
    
    private boolean validateInput() {
        if (txtItemName.getText().length() == 0) {
            showMessage("Please enter the Item Name.");
            setFocus(txtItemName);
            return false;
        }
        
        /*
        try {
            Integer.parseInt(txtItemID.getText());
        } catch (NumberFormatException e) {
            showMessage("Please enter an Integer for ID.");
            setFocus(txtItemID);
            return false;
        }
        */
        
        try {
            Double.parseDouble(txtItemPrice.getText());
        } catch (NumberFormatException e) {
            showMessage("Please enter a double for the Price.");
            setFocus(txtItemPrice);
            return false;
        }
        
        try {
            Integer.parseInt(txtItemCalories.getText());
        } catch (NumberFormatException e) {
            showMessage("Please enter an Integer for the Calories.");
            setFocus(txtItemCalories);
            return false;
        }
        
        if (radFoodItem.isSelected()) {
            if (!txtIsAppetizer.getText().toLowerCase().equals("yes") && 
                    !txtIsAppetizer.getText().toLowerCase().equals("no")) {
                showMessage("Please enter 'yes' or 'no' for if the item is an appetizer.");
                setFocus(txtIsAppetizer);
                return false;
            }
            
            if (!txtIsSpicy.getText().toLowerCase().equals("yes") && 
                    !txtIsSpicy.getText().toLowerCase().equals("no")) {
                showMessage("Please enter 'yes' or 'no' for if the item is spicy.");
                setFocus(txtIsSpicy);
                return false;
            }
        } else if (radDrinkItem.isSelected()) {
            if (!txtIsStraw.getText().toLowerCase().equals("yes") && 
                    !txtIsStraw.getText().toLowerCase().equals("no")) {
                showMessage("Please enter 'yes' or 'no' for if the drink has a straw.");
                setFocus(txtIsStraw);
                return false;
            }
            
            if (!txtSize.getText().toLowerCase().equals("small") && 
                !txtSize.getText().toLowerCase().equals("medium") &&
                !txtSize.getText().toLowerCase().equals("large")) {
                
                showMessage("Please enter 'small', 'medium', or 'large' for the drink size.");
                setFocus(txtIsStraw);
                return false;
            }
        } else {
            showMessage("Please select whether the item is a food or a drink.");
            return false;
        }
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> lstMenuItems;
    private javax.swing.JRadioButton radDrinkItem;
    private javax.swing.JRadioButton radFoodItem;
    private javax.swing.JTextField txtIsAppetizer;
    private javax.swing.JTextField txtIsSpicy;
    private javax.swing.JTextField txtIsStraw;
    private javax.swing.JTextField txtItemCalories;
    private javax.swing.JTextField txtItemID;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
