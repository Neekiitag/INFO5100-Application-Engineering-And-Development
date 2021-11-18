/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public void deleteCustomer(int index,EcoSystem system){
        String id = customerDirectory.get(index).getCustomerNumber();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        customerDirectory.remove(index);
    }
    
    public void add(Customer customer){
        customerDirectory.add(customer);
    }
    
    public Customer getCustomerId(int index){
        return customerDirectory.get(index);
    }
    
    public void updateCustomer(String customerNo, String customerName, String customerPhone, String customerStreet,String customerZipcode,String customerEmail){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerNumber().equalsIgnoreCase(customerNo)){
                customer.setCustomerName(customerName);
                customer.setCustomerPhoneNumber(customerPhone);
                customer.setCustomerStreetName(customerStreet);
                customer.setCustomerZipcode(customerZipcode);
                customer.setCustomerEmailId(customerEmail);
            }
        }
    }
    
    public boolean isPhoneUnique(String phone){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    
    public boolean isEmailUnique(String email){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerEmailId().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public Customer getCustomer(String id){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerNumber().equalsIgnoreCase(id)){
                return customer;
            }
        }
        return null;
    }
    
    public String generateCustomerID(){
        return "Customer"+(customerDirectory.size()+1);
    }
    
    
}
