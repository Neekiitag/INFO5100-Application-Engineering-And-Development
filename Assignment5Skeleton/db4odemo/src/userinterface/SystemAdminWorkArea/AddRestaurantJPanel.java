/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author adity
 */
public class AddRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createRestaurantJPanel
     */
    private final RestaurantDirectory restaurantDirectory;
    private final JPanel container;
    private final EcoSystem system;

    public AddRestaurantJPanel(JPanel container, EcoSystem system, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.restaurantDirectory = restaurantDirectory;
        this.container = container;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddRes = new javax.swing.JLabel();
        lblResName = new javax.swing.JLabel();
        lblStreetAdd = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        txtResName = new javax.swing.JTextField();
        txtStreetAddress = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblManagerName = new javax.swing.JLabel();
        txtManagerName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblZipcode = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        lblPhoneNo1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        lblAddRes.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        lblAddRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddRes.setText(" Register New Restaurant ");

        lblResName.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblResName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResName.setText("Restaurant Name:");

        lblStreetAdd.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblStreetAdd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStreetAdd.setText("Street Address:");

        lblPhoneNo.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblPhoneNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNo.setText("Phone no:");

        btnSave.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnSave.setText("Register");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        lblManagerName.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblManagerName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblManagerName.setText("Manager Name:");

        lblZipcode.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblZipcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblZipcode.setText("Zipcode:");

        lblPhoneNo1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblPhoneNo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNo1.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(lblPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPhoneNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblZipcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(10, 10, 10)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtZipcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblAddRes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblResName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtResName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblAddRes)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStreetAddress)
                    .addComponent(lblStreetAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblPhoneNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(26, 26, 26)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtResName.getText();
        String address = txtStreetAddress.getText();
        String phone = txtPhoneNo.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String managerName = txtManagerName.getText();
        String zipcode = txtZipcode.getText();
        String email = txtEmail.getText();

        if (username.isEmpty() || password.isEmpty() || name.isEmpty() || address.isEmpty() || phone.isEmpty() || managerName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter All Fields!");
        } else if (!system.checkValidPhoneFormat(phone)) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Phone No.");
        } else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Enter Correct Email format.");
        } else if (!system.checkValidNameFormat(name)) {
            JOptionPane.showMessageDialog(null, "Enter Correct Name format.");
        } else if (!system.checkValidNameFormat(managerName)) {
            JOptionPane.showMessageDialog(null, "Enter Correct Manager Name format.");
        } else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            JOptionPane.showMessageDialog(null, "Username Already Exists.");
        } else if (!restaurantDirectory.isPhoneUnique(phone)) {
            JOptionPane.showMessageDialog(null, "Phone no Already Registered.");
        } else {
            Restaurant restaurant = new Restaurant();
            restaurant.setRestaurantName(name);
            restaurant.setStreetAddress(address);
            restaurant.setOperatorName(managerName);
            restaurant.setMobileNo(phone);
            restaurant.setEmail(email);
            restaurant.setZipcode(zipcode);
            restaurantDirectory.add(restaurant);
            system.setRestaurantDirectory(restaurantDirectory);
            Employee employee = system.getEmployeeDirectory().createEmployee(restaurant.getRestaurantNo());
            UserAccount account = system.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
            JOptionPane.showMessageDialog(null, "New Restaurant has been added!");
            clearAllFields();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public void clearAllFields() {
        txtResName.setText("");
        txtStreetAddress.setText("");
        txtPhoneNo.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtManagerName.setText("");
        txtZipcode.setText("");
        txtEmail.setText("");
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UpdateRestaurantJPanel manageRestaurantJPanel = (UpdateRestaurantJPanel) component;
        manageRestaurantJPanel.populateRestaurants();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddRes;
    private javax.swing.JLabel lblManagerName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPhoneNo1;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel lblStreetAdd;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtResName;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}