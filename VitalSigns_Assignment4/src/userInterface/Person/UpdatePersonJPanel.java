/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Person;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Person;
import model.PersonDirectory;


/**
 *
 * @author adity
 */
public class UpdatePersonJPanel extends javax.swing.JPanel {
    /**
     * Creates new form UpdatePersonJPanel
     */
    private Person person;
    private PersonDirectory personDirectory;
    private JPanel workAreaJPanel;
    private Boolean isEdit = Boolean.FALSE;
    
 
    private ManagePersonJPanel managePersonJPanel;
    
    
    
    
    public UpdatePersonJPanel(JPanel workAreaJPanel,Person person, Boolean isEdit) {
        initComponents();
        this.workAreaJPanel = workAreaJPanel;
        this.person = person;
        this.isEdit = isEdit;
        
        populatePersonDetails();
        modifyTextFields(this.isEdit);
        //addVerifiers();
        //populatePatientDetails();
        //modifyTextFields(this.isEdit);
    
    }
    
    private void populatePersonDetails() {
        JOptionPane.showMessageDialog(this, person.toString());
        txtupdatePatientName.setText(person.getPersonName());
        txtupdateAge.setText(String.valueOf(person.getAge()));
        txtupdateCommunity.setText(person.getCommunity());
        txtupdateHouse.setText(person.getHouse());
        txtupdateCity.setText(person.getCity());
        txtupdateZipCode.setText(String.valueOf(person.getZipcode()));
        if(person.getGender() == "Male" ){
           jRadioBtnupdateMale.setSelected(false);
           jRadioBtnupdateFemale.setSelected(true);
       }else {
           jRadioBtnupdateFemale.setSelected(false);
           jRadioBtnupdateMale.setSelected(true);
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

        txtCommunity = new javax.swing.JTextField();
        txtPersonName = new javax.swing.JTextField();
        jRadioBtnMale = new javax.swing.JRadioButton();
        txtAge = new javax.swing.JTextField();
        jRadioBtnFemale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtupdatePatientName = new javax.swing.JTextField();
        txtupdateAge = new javax.swing.JTextField();
        btnBack3 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioBtnupdateMale = new javax.swing.JRadioButton();
        jRadioBtnupdateFemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtupdateCity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtupdateCommunity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtupdateHouse = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtupdateZipCode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        txtPersonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonNameActionPerformed(evt);
            }
        });

        jRadioBtnMale.setBackground(new java.awt.Color(204, 204, 204));
        jRadioBtnMale.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jRadioBtnMale.setText("Male");
        jRadioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnMaleActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jRadioBtnFemale.setBackground(new java.awt.Color(204, 204, 204));
        jRadioBtnFemale.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jRadioBtnFemale.setText("Female");
        jRadioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnFemaleActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("City :");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Community :");

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("House :");

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Name of Person :");

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Age :");

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Details");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Patient Name :");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age :");

        txtupdatePatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdatePatientNameActionPerformed(evt);
            }
        });

        txtupdateAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateAgeActionPerformed(evt);
            }
        });

        btnBack3.setBackground(new java.awt.Color(153, 153, 153));
        btnBack3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnBack3.setForeground(new java.awt.Color(153, 255, 255));
        btnBack3.setText("<<Back");
        btnBack3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(153, 153, 153));
        btnEdit.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(153, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Gender :");

        jRadioBtnupdateMale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup.add(jRadioBtnupdateMale);
        jRadioBtnupdateMale.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jRadioBtnupdateMale.setForeground(new java.awt.Color(153, 255, 255));
        jRadioBtnupdateMale.setText("Male");
        jRadioBtnupdateMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnupdateMaleActionPerformed(evt);
            }
        });

        jRadioBtnupdateFemale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup.add(jRadioBtnupdateFemale);
        jRadioBtnupdateFemale.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jRadioBtnupdateFemale.setForeground(new java.awt.Color(153, 255, 255));
        jRadioBtnupdateFemale.setText("Female");
        jRadioBtnupdateFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnupdateFemaleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("City :");

        txtupdateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateCityActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Community :");

        txtupdateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateCommunityActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("House :");

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Zip Code :");

        txtupdateZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateZipCodeActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(153, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtupdateCity)
                                    .addComponent(txtupdateCommunity)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioBtnupdateMale, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioBtnupdateFemale))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtupdateHouse))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtupdateZipCode)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtupdateAge)
                                    .addComponent(txtupdatePatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioBtnupdateMale)
                            .addComponent(jRadioBtnupdateFemale, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtupdatePatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtupdateAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtupdateCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtupdateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtupdateHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtupdateZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:
        
        workAreaJPanel.remove(this);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.previous(workAreaJPanel);
    }//GEN-LAST:event_btnBack3ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
        if (checkBlankInput()==Boolean.TRUE)
        {
            
            person.setPersonName(txtPersonName.getText());
            person.setAge(Integer.parseInt(txtAge.getText()));
            person.setHouse(txtHouse.getText());
            person.setCommunity(txtCommunity.getText());
            person.setCity(txtCity.getText());
            person.setZipcode(Integer.parseInt(txtupdateZipCode.getText()));
            
           if(jRadioBtnupdateFemale.isSelected()){
                person.setGender(jRadioBtnupdateFemale.getText());
            }else {
                person.setGender(jRadioBtnupdateMale.getText());
            }
            JOptionPane.showMessageDialog(this, "Person added!!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtupdatePatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdatePatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdatePatientNameActionPerformed

    private void txtupdateAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdateAgeActionPerformed

    private Boolean checkBlankInput() {
        if (txtupdatePatientName.getText().isEmpty()||txtupdateAge.getText().isEmpty()||txtupdateHouse.getText().isEmpty()||txtupdateCommunity.getText().isEmpty()||txtupdateCity.getText().isEmpty()||txtupdateZipCode.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            txtupdatePatientName.setEnabled(true);
            txtupdateAge.setEnabled(true);
            txtupdateHouse.setEnabled(true);
            txtupdateCommunity.setEnabled(true);
            txtupdateCity.setEnabled(true);
            txtupdateZipCode.setEnabled(true);
            jRadioBtnupdateFemale.setEnabled(true);
            jRadioBtnupdateMale.setEnabled(true);
        } else {
            txtupdatePatientName.setEnabled(false);
            txtupdateAge.setEnabled(false);
            txtupdateHouse.setEnabled(false);
            txtupdateCommunity.setEnabled(false);
            txtupdateCity.setEnabled(false);
            txtupdateZipCode.setEnabled(false);
            jRadioBtnupdateFemale.setEnabled(false);
            jRadioBtnupdateMale.setEnabled(false);
            
            
        }
    }

    
    private void clearFields()
    {
        txtPersonName.setText("");
        txtAge.setText("");
        buttonGroup.clearSelection();
        txtHouse.setText("");
        txtCommunity.setText("");
        txtCity.setText("");
        txtupdateZipCode.setText("");
    }
    
    
    
    private void txtPersonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonNameActionPerformed

    private void jRadioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnMaleActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void jRadioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnFemaleActionPerformed

    private void jRadioBtnupdateMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnupdateMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnupdateMaleActionPerformed

    private void jRadioBtnupdateFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnupdateFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnupdateFemaleActionPerformed

    private void txtupdateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdateCityActionPerformed

    private void txtupdateZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdateZipCodeActionPerformed

    private void txtupdateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdateCommunityActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
//        if (checkBlankInput()==Boolean.TRUE)
//        {
//            String personName= txtPersonName.getText();
//            int age= Integer.parseInt(txtAge.getText());
//            String houseAddress = txtHouseAddress.getText();
//            String community = txtCommunity.getText();
//            String city = txtCity.getText();
//            int zipcode = Integer.parseInt(txtZipcode.getText());
//            
//            String charPattern = "^[a-zA-z]+";
//            Pattern expPersonName = Pattern.compile(charPattern);
//            
//            String agePattern = "^[0-9]{2}+";
//            Pattern expAge = Pattern.compile(agePattern);
//            
//            String zipcodePattern = "^[0-9]{5}+";
//            Pattern expZipCode = Pattern.compile(zipcodePattern);
//            
//            Matcher matcherPersonName = expPersonName.matcher(txtPersonName.getText());
//            if(!matcherPersonName.matches()){
//                lblPersonNameError.setText("Enter a valid person name!!");
//            }else{
//                lblPersonNameError.setText(" ");
//                Matcher matchNumber = expAge.matcher(txtAge.getText());
//                if(!matchNumber.matches()){
//                    lblPersonAgeError.setText("Enter a valid Age!!");
//                }else{
//                    lblPersonAgeError.setText(" ");
//                    Matcher matchZipCode = expZipCode.matcher(txtZipcode.getText());
//                    if(!matchZipCode.matches()){
//                        lblZipcodeError.setText("Enter a valid Zipcode!!");
//                    }else{
//                        lblZipcodeError.setText(" ");
//                        Matcher matchCity = expPersonName.matcher(txtCity.getText());
//                        if(!matchCity.matches()){
//                            lblCityError.setText("Enter a valid City!!");
//                        }else{
//                            lblCityError.setText(" ");
//                            Matcher macthCommunity = expPersonName.matcher(txtCommunity.getText());
//                            if(!macthCommunity.matches()){
//                                lblCommunityError.setText("Enter a valid Community!!");
//                            }else{
//                                lblCommunityError.setText(" ");                           
//person.setPersonName(personName);
//person.setAge(age);
//person.setHouseAddress(houseAddress);
//person.setCommunity(community);
//person.setCity(city);
//person.setZipcode(zipcode);
//
//
//
//if(radioBtnFemale.isSelected()){
//person.setGender(radioBtnFemale.getText());
//}else {
//person.setGender(radioBtnMale.getText());
//}
//JOptionPane.showMessageDialog(this, "Person added!!", "Update",
//JOptionPane.INFORMATION_MESSAGE);
//clearFields();
//
//}
//}
//}
//
//}
//
//}
//}
//
//else
//{
//JOptionPane.showMessageDialog(this, "Please enter all values",
//"Error", JOptionPane.ERROR_MESSAGE);
//}
//        
        
        if (checkBlankInput()==Boolean.TRUE)
        {
            person.setPersonName(txtPersonName.getText());
            person.setAge(Integer.parseInt(txtAge.getText()));
            person.setHouse(txtHouse.getText());
            person.setCommunity(txtCommunity.getText());
            person.setCity(txtCity.getText());
            person.setZipcode(Integer.parseInt(txtupdateZipCode.getText()));
            if(jRadioBtnupdateFemale.isSelected()){
                person.setGender(jRadioBtnupdateFemale.getText());
            }else {
                person.setGender(jRadioBtnupdateMale.getText());
            }
            JOptionPane.showMessageDialog(this, "Person has been added successfully!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "All fields are mandatory","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioBtnFemale;
    private javax.swing.JRadioButton jRadioBtnMale;
    private javax.swing.JRadioButton jRadioBtnupdateFemale;
    private javax.swing.JRadioButton jRadioBtnupdateMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtupdateAge;
    private javax.swing.JTextField txtupdateCity;
    private javax.swing.JTextField txtupdateCommunity;
    private javax.swing.JTextField txtupdateHouse;
    private javax.swing.JTextField txtupdatePatientName;
    private javax.swing.JTextField txtupdateZipCode;
    // End of variables declaration//GEN-END:variables
}
