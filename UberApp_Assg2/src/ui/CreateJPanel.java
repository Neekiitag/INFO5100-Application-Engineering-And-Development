/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.CarHistory;
import model.CarInfo;

/**
 *
 * @author adity
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    CarHistory history;
    
    public CreateJPanel(CarHistory history) {
        
        initComponents();
        this.history = history;

        int endYear = Calendar.getInstance().get(Calendar.YEAR);
        this.history = history;

        //String listYear[] = new String[25];
        jComboBoxYearOfManufacturing.addItem("--Please Select--");
        //JOptionPane.showMessageDialog(this, endYear);
        for(int year = endYear; 
                year > endYear-25; year--){
            jComboBoxYearOfManufacturing.addItem(Integer.toString(year));
        
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

        buttonGroup = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCarModelName = new javax.swing.JTextField();
        lblserialNo = new javax.swing.JLabel();
        jCombocarManufacturer = new javax.swing.JComboBox<>();
        lblmaintainenceCertStatus = new javax.swing.JLabel();
        btnRadioYes = new javax.swing.JRadioButton();
        lblyearOfManufacturing = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblcarManufacturer = new javax.swing.JLabel();
        btnRadioNo = new javax.swing.JRadioButton();
        txtCarModelNumber = new javax.swing.JTextField();
        jComboNoOfSeats = new javax.swing.JComboBox<>();
        lblTitle1 = new javax.swing.JLabel();
        lblcountOfSeats = new javax.swing.JLabel();
        lblcarModelNo = new javax.swing.JLabel();
        lblavailability = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        btnCheckActive = new javax.swing.JCheckBox();
        lblcarModelName = new javax.swing.JLabel();
        jComboLocation = new javax.swing.JComboBox<>();
        jComboBoxYearOfManufacturing = new javax.swing.JComboBox<>();
        lblErrorCarModelName = new javax.swing.JLabel();
        lblErrorCarModelNum = new javax.swing.JLabel();
        lblErrorSerialNumber = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(51, 51, 0));

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        txtCarModelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarModelNameActionPerformed(evt);
            }
        });
        txtCarModelName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCarModelNameKeyPressed(evt);
            }
        });

        lblserialNo.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblserialNo.setForeground(new java.awt.Color(255, 255, 255));
        lblserialNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblserialNo.setText("Serial No.:");

        jCombocarManufacturer.setBackground(new java.awt.Color(0, 0, 0));
        jCombocarManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select from options--", "Toyota", "Hyundai", "TATA", "BMW", "Audi", "Mercedes", "Tesla" }));
        jCombocarManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombocarManufacturerActionPerformed(evt);
            }
        });

        lblmaintainenceCertStatus.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblmaintainenceCertStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblmaintainenceCertStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblmaintainenceCertStatus.setText("Maintainence Certificate Status:");

        btnRadioYes.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup.add(btnRadioYes);
        btnRadioYes.setForeground(new java.awt.Color(255, 255, 255));
        btnRadioYes.setText("Yes");

        lblyearOfManufacturing.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblyearOfManufacturing.setForeground(new java.awt.Color(255, 255, 255));
        lblyearOfManufacturing.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblyearOfManufacturing.setText("Year of Manufacturing:");

        btnSave.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblcarManufacturer.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblcarManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        lblcarManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcarManufacturer.setText("Car Manufacturer:");

        btnRadioNo.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup.add(btnRadioNo);
        btnRadioNo.setForeground(new java.awt.Color(255, 255, 255));
        btnRadioNo.setText("No");

        txtCarModelNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCarModelNumberKeyPressed(evt);
            }
        });

        jComboNoOfSeats.setBackground(new java.awt.Color(0, 0, 0));
        jComboNoOfSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select from options--", "2", "4", "5", "6", "9" }));
        jComboNoOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboNoOfSeatsActionPerformed(evt);
            }
        });

        lblTitle1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("New Car Details");

        lblcountOfSeats.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblcountOfSeats.setForeground(new java.awt.Color(255, 255, 255));
        lblcountOfSeats.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcountOfSeats.setText("No. of Seats:");

        lblcarModelNo.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblcarModelNo.setForeground(new java.awt.Color(255, 255, 255));
        lblcarModelNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcarModelNo.setText("Car Model No.:");

        lblavailability.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblavailability.setForeground(new java.awt.Color(255, 255, 255));
        lblavailability.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblavailability.setText("Availability:");

        lblcity.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 255, 255));
        lblcity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcity.setText("Location:");

        txtSerialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSerialNoKeyPressed(evt);
            }
        });

        btnCheckActive.setBackground(new java.awt.Color(0, 0, 0));
        btnCheckActive.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckActive.setText("Yes");

        lblcarModelName.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblcarModelName.setForeground(new java.awt.Color(255, 255, 255));
        lblcarModelName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcarModelName.setText("Car Model Name:");

        jComboLocation.setBackground(new java.awt.Color(0, 0, 0));
        jComboLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select from options--", "Boston", "New York", "Chicago", "Norwalk", "New Jersey", "San Jose", "Seattle" }));

        jComboBoxYearOfManufacturing.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxYearOfManufacturing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select from options--" }));

        lblErrorCarModelName.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblErrorCarModelName.setForeground(new java.awt.Color(255, 255, 255));

        lblErrorCarModelNum.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblErrorCarModelNum.setForeground(new java.awt.Color(255, 255, 255));

        lblErrorSerialNumber.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lblErrorSerialNumber.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblcarManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcarModelNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblyearOfManufacturing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblserialNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcountOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblavailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmaintainenceCertStatus)
                            .addComponent(lblcarModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRadioYes)
                                .addGap(18, 18, 18)
                                .addComponent(btnRadioNo))
                            .addComponent(btnCheckActive)
                            .addComponent(jComboLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSerialNo)
                            .addComponent(txtCarModelNumber)
                            .addComponent(txtCarModelName)
                            .addComponent(jCombocarManufacturer, 0, 186, Short.MAX_VALUE)
                            .addComponent(jComboNoOfSeats, 0, 186, Short.MAX_VALUE)
                            .addComponent(jComboBoxYearOfManufacturing, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErrorCarModelName, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblErrorSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(lblErrorCarModelNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombocarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcarManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcarModelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblErrorCarModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCarModelName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCarModelNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lblErrorCarModelNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcarModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblyearOfManufacturing, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jComboBoxYearOfManufacturing))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblserialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrorSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jComboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcountOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblavailability, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRadioYes)
                    .addComponent(btnRadioNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmaintainenceCertStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckActive))
                .addGap(20, 20, 20)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarModelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarModelNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarModelNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        try{
            ArrayList<Integer> unqname = new ArrayList<>();
            for( CarInfo carInfo : history.getHistory()){
                if(!(unqname.contains(carInfo.getSerialNumber()))){
                    unqname.add(carInfo.getSerialNumber());
                }
            }
            
            if(unqname.contains(Integer.parseInt(txtSerialNo.getText()))) {
                JOptionPane.showMessageDialog(this, "Enter unique serial number ");
            }
        } catch(Exception e){
            System.out.println("Error in serial no check " +e);
        }
        
        String carManufacturer = jCombocarManufacturer.getSelectedItem().toString();
        String carModelname = txtCarModelName.getText();
        String carModelNum = txtCarModelNumber.getText();
        String yearOfManufacturing = jComboBoxYearOfManufacturing.getSelectedItem().toString();
        String serialNumber = txtSerialNo.getText();
        String city = jComboLocation.getSelectedItem().toString();
        String countOfSeats = jComboNoOfSeats.getSelectedItem().toString();
        
        String carModelNamePattern = "^[a-zA-z]+";
        Pattern expCarModelName = Pattern.compile(carModelNamePattern);
        
        String serialNumberPattern = "^[0-9]{6}+";
        Pattern expSerialNumber = Pattern.compile(serialNumberPattern);
        
        String carModelNumPattern = "^[a-zA-Z0-9]+";
        Pattern expCarModelNum = Pattern.compile(carModelNumPattern);
        
                
        if(txtCarModelName.getText().isEmpty()|| txtCarModelNumber.getText().isEmpty() || txtSerialNo.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Fields are mandatory.");
        }else {
            if(carManufacturer == "--Select from options--" || city == "--Select from options--" || countOfSeats == "--Select from options--" || yearOfManufacturing == "--Select from options--"){
                JOptionPane.showMessageDialog(this, "Please check the fields.");
            }else{
                Matcher matchCarModelName = expCarModelName.matcher(txtCarModelName.getText());
                if(!matchCarModelName.matches()){
                    lblErrorCarModelName.setText("Enter a valid Model Name");
                }else{
                    lblErrorCarModelName.setText(" ");
                    
                    Matcher matchSerialNumber = expSerialNumber.matcher(txtSerialNo.getText());
                    if(!matchSerialNumber.matches()){
                        lblErrorSerialNumber.setText("Enter a valid Serial Number");
                    }else{
                        lblErrorSerialNumber.setText(" ");
                        
                        Matcher matchCarModelNum = expCarModelNum.matcher(txtCarModelNumber.getText());
                        if(!matchCarModelNum.matches()){
                            lblErrorCarModelNum.setText("Enter a valid Model Number");
                        }else{
                            lblErrorCarModelNum.setText(" ");
                            
                            CarInfo carInfo = history.addNewCars();
                            
                            carInfo.setCarManufacturer(carManufacturer);
                            carInfo.setCarModelname(carModelname);
                            carInfo.setCarModelNum(carModelNum);
                            carInfo.setYearOfManufacturing(yearOfManufacturing);
                            carInfo.setCity(city);
                          
                            try{
                                carInfo.setCountOfSeats(Integer.parseInt(countOfSeats));
                                carInfo.setSerialNumber(Integer.parseInt(serialNumber));
                            }catch(NumberFormatException e){// handle your exception
                                e.printStackTrace();
                            } 
                            
                            if(btnRadioYes.isSelected()){
                                carInfo.setAvailability(btnRadioYes.getText());
                            }else {
                                carInfo.setAvailability(btnRadioNo.getText());
                            } 
                            
                            if(btnCheckActive.isSelected()){
                                carInfo.setMaintainenceCertStatus(btnCheckActive.getText());
                            }else {
                                JOptionPane.showMessageDialog(this, "If not selected, Maintenance Certificate status is considered to be 'NO' ");
                                carInfo.setMaintainenceCertStatus("No");
                            } 
                            
                            JOptionPane.showMessageDialog(this, "New Car Details Added"); //clearing the text after the car details are saved
                            
                            jCombocarManufacturer.setSelectedItem("--Select from options--");
                            txtCarModelName.setText("");
                            txtCarModelNumber.setText("");
                            jComboBoxYearOfManufacturing.setSelectedItem("--Please Select--");
                            txtSerialNo.setText("");
                            jComboLocation.setSelectedItem("--Select from options--");
                            jComboNoOfSeats.setSelectedItem("--Select from options--");
                            buttonGroup.clearSelection(); 
                            btnCheckActive.setSelected(false);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jCombocarManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombocarManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombocarManufacturerActionPerformed

    private void jComboNoOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboNoOfSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboNoOfSeatsActionPerformed

    private void txtCarModelNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarModelNameKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            lblErrorCarModelName.setText(" ");
            txtCarModelName.setEditable(true);
        }else {
            if(!Character.isLetter(c)){
                lblErrorCarModelName.setText("Enter a valid name");
            }
        }
        
    }//GEN-LAST:event_txtCarModelNameKeyPressed

    private void txtSerialNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNoKeyPressed
        // TODO add your handling code here:
        
        String serialNumber = txtSerialNo.getText();
        int length = serialNumber.length();
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<6){
                txtSerialNo.setEditable(true);
                lblErrorSerialNumber.setText("Serial Number should be 6 digits");
            }else{
                txtSerialNo.setEditable(false);
                lblErrorSerialNumber.setText(" ");
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                txtSerialNo.setEditable(true);
            }else{
                txtSerialNo.setEditable(false);
            }
        }  
    }//GEN-LAST:event_txtSerialNoKeyPressed

    private void txtCarModelNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarModelNumberKeyPressed
        // TODO add your handling code here:
        
        String carModelNum = txtCarModelNumber.getText();
        String PATTERN = "^[a-zA-Z0-9]+";
        Pattern exp = Pattern.compile(PATTERN);
        Matcher match = exp.matcher(carModelNum);
        if(!match.matches()){
            lblErrorCarModelNum.setText("Enter Car Model Number");
        }else{
            lblErrorCarModelNum.setText(" ");
        }
    }//GEN-LAST:event_txtCarModelNumberKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnCheckActive;
    private javax.swing.JRadioButton btnRadioNo;
    private javax.swing.JRadioButton btnRadioYes;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> jComboBoxYearOfManufacturing;
    private javax.swing.JComboBox<String> jComboLocation;
    private javax.swing.JComboBox<String> jComboNoOfSeats;
    private javax.swing.JComboBox<String> jCombocarManufacturer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrorCarModelName;
    private javax.swing.JLabel lblErrorCarModelNum;
    private javax.swing.JLabel lblErrorSerialNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblavailability;
    private javax.swing.JLabel lblcarManufacturer;
    private javax.swing.JLabel lblcarModelName;
    private javax.swing.JLabel lblcarModelNo;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcountOfSeats;
    private javax.swing.JLabel lblmaintainenceCertStatus;
    private javax.swing.JLabel lblserialNo;
    private javax.swing.JLabel lblyearOfManufacturing;
    private javax.swing.JTextField txtCarModelName;
    private javax.swing.JTextField txtCarModelNumber;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables

}
