/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    CustomerDirectory customerDirectory;
    RestaurantDirectory restaurantDirectory;
    DeliveryManDirectory deliveryManDirectory;
    MenuDirectory menuDirectory;
    OrderDirectory orderDirectory;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerDirectory = customerDirectory;
        this.restaurantDirectory = restaurantDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.menuDirectory = menuDirectory;
        this.orderDirectory = orderDirectory;
    }

    public void populateTree() {
        DefaultMutableTreeNode assets = new DefaultMutableTreeNode("roles");
        DefaultMutableTreeNode restaurant = new DefaultMutableTreeNode("restaurants");
        DefaultMutableTreeNode customers = new DefaultMutableTreeNode("customers");
        DefaultMutableTreeNode deliverymen = new DefaultMutableTreeNode("deliverymen");
        assets.add(restaurant);
        assets.add(customers);
        assets.add(deliverymen);
        for (int i = 0; i < this.ecosystem.getRestaurantDirectory().getRestaurantDirectory().size(); i++) {
        DefaultMutableTreeNode temp = new DefaultMutableTreeNode(this.ecosystem.getRestaurantDirectory().getRestaurantDirectory().get(i).getRestaurantName());
        restaurant.add(temp);
        }
        for (int i = 0; i < this.ecosystem.getUserAccountDirectory().getUserAccountList().size(); i++) {
        if (this.ecosystem.getUserAccountDirectory().getUserAccountList().get(i).getRole().toString() == "Business.Role.DeliverManRole") {
        DefaultMutableTreeNode temp = new DefaultMutableTreeNode(this.ecosystem.getUserAccountDirectory().getUserAccountList().get(i).getUsername());
        deliverymen.add(temp);
        } else if (this.ecosystem.getUserAccountDirectory().getUserAccountList().get(i).getRole().toString() == "Business.Role.CustomerRole") {
        DefaultMutableTreeNode temp = new DefaultMutableTreeNode(this.ecosystem.getUserAccountDirectory().getUserAccountList().get(i).getUsername());
        customers.add(temp);
        }
        }
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(assets));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        btnManageCustomers = new javax.swing.JButton();
        btnManageRestaurants = new javax.swing.JButton();
        btnManageDelivery = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Restaurants");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Customer");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Delivery");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 589, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btnManageCustomers.setBackground(new java.awt.Color(255, 255, 255));
        btnManageCustomers.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnManageCustomers.setText("Customers");
        btnManageCustomers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageRestaurants.setBackground(new java.awt.Color(255, 255, 255));
        btnManageRestaurants.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnManageRestaurants.setText("Restaurants");
        btnManageRestaurants.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });

        btnManageDelivery.setBackground(new java.awt.Color(255, 255, 255));
        btnManageDelivery.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnManageDelivery.setText("Deliveryman");
        btnManageDelivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnManageDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageRestaurants, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnManageRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnManageDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryActionPerformed
        UpdateDeliveryManJPanel manageDeliveryJPanel = new UpdateDeliveryManJPanel(userProcessContainer, ecosystem, deliveryManDirectory);
        userProcessContainer.add("manageDeliveryJPanel", manageDeliveryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryActionPerformed

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed
        UpdateRestaurantJPanel manageRestaurantJPanel = new UpdateRestaurantJPanel(userProcessContainer, ecosystem, restaurantDirectory);
        userProcessContainer.add("manageRestaurantJPanel", manageRestaurantJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        UpdateCustomersJPanel manageCustomersJPanel = new UpdateCustomersJPanel(userProcessContainer, ecosystem, customerDirectory);
        userProcessContainer.add("manageCustomersJPanel", manageCustomersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCustomersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageDelivery;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
