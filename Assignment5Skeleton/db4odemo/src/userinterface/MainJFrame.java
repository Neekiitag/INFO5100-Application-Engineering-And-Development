/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private final EcoSystem system;
    private final DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private final CustomerDirectory customerDirectory;
    private final RestaurantDirectory restaurantDirectory;
    private final DeliveryManDirectory deliveryManDirectory;
    private final EmployeeDirectory employeeDirectory;
    private final MenuDirectory menuDirectory;
    private final OrderDirectory orderDirectory;

    public MainJFrame() throws IOException {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        if(system.getMenuDirectory() == null)
        {           
            this.menuDirectory = new MenuDirectory();

        } else {
            this.menuDirectory = system.getMenuDirectory();
        }
        if (system.getCustomerDirectory() == null) {
            this.customerDirectory = new CustomerDirectory();

        } else {
            this.customerDirectory = system.getCustomerDirectory();
        }
        if (system.getRestaurantDirectory() == null) {
            this.restaurantDirectory = new RestaurantDirectory();

        } else {
            this.restaurantDirectory = system.getRestaurantDirectory();
        }
        if (system.getDeliveryManDirectory() == null) {
            deliveryManDirectory = new DeliveryManDirectory();

        } else {
            this.deliveryManDirectory = system.getDeliveryManDirectory();
        }
        if (system.getOrderDirectory() == null) {
            orderDirectory = new OrderDirectory();

        } else {
            this.orderDirectory = system.getOrderDirectory();
        }
        if (system.getEmployeeDirectory() == null) {
            employeeDirectory = new EmployeeDirectory();

        } else {
            this.employeeDirectory = system.getEmployeeDirectory();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuContainer = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        cardLayoutJPanel = new javax.swing.JPanel();
        cardLayoutMainWindow = new javax.swing.JPanel();
        GrubHublbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuContainer.setBackground(new java.awt.Color(204, 255, 255));

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblPassword.setText("Password:");

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnLogout.setEnabled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuContainerLayout = new javax.swing.GroupLayout(menuContainer);
        menuContainer.setLayout(menuContainerLayout);
        menuContainerLayout.setHorizontalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuContainerLayout.createSequentialGroup()
                .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menuContainerLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(loginJLabel))
                    .addGroup(menuContainerLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuContainerLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuContainerLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        menuContainerLayout.setVerticalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuContainerLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(loginJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuContainerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(457, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(menuContainer);

        cardLayoutJPanel.setLayout(new java.awt.CardLayout());

        cardLayoutMainWindow.setBackground(new java.awt.Color(204, 255, 255));

        GrubHublbl.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        GrubHublbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GrubHublbl.setText("GrubHub");
        GrubHublbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout cardLayoutMainWindowLayout = new javax.swing.GroupLayout(cardLayoutMainWindow);
        cardLayoutMainWindow.setLayout(cardLayoutMainWindowLayout);
        cardLayoutMainWindowLayout.setHorizontalGroup(
            cardLayoutMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayoutMainWindowLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(GrubHublbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1080, Short.MAX_VALUE))
        );
        cardLayoutMainWindowLayout.setVerticalGroup(
            cardLayoutMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayoutMainWindowLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(GrubHublbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
        );

        cardLayoutJPanel.add(cardLayoutMainWindow, "card2");

        splitPane.setRightComponent(cardLayoutJPanel);

        getContentPane().add(splitPane, java.awt.BorderLayout.CENTER);
        splitPane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get user name
        String userName = txtUsername.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        if (userAccount != null) {
            CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();
            cardLayoutJPanel.add("GetUserWorkArea", userAccount.getRole().createWorkArea(cardLayoutJPanel, userAccount, system, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory, orderDirectory));
            layout.next(cardLayoutJPanel);
            txtUsername.setText("");
            txtPassword.setText("");
            btnLogout.setEnabled(true);
            txtUsername.setEnabled(false);
            txtPassword.setEnabled(false);
            btnLogin.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Username or password incorrect. Please try again.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        btnLogout.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        btnLogin.setEnabled(true);
        txtUsername.setText("");
        txtPassword.setText("");

        cardLayoutJPanel.removeAll();

        CardLayout crdLyt = (CardLayout) cardLayoutJPanel.getLayout();
        crdLyt.next(cardLayoutJPanel);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainJFrame frame = new MainJFrame();
                    frame.dispose();
                    frame.setSize(1300, 700);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GrubHublbl;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel cardLayoutJPanel;
    private javax.swing.JPanel cardLayoutMainWindow;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPanel menuContainer;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
