package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Employeee");
        Employee deliveryMan = system.getEmployeeDirectory().createEmployee("DeliveryMan");
        Employee customer = system.getEmployeeDirectory().createEmployee("Nikita");
        Employee restaurantAdmin = system.getEmployeeDirectory().createEmployee("RestaurantAdmin");
        
        UserAccount RoleCustomer = system.getUserAccountDirectory().createUserAccount("custLogin", "custLogin", customer, new CustomerRole());
        UserAccount RoleSysAdmin = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount RoleDeliveryMan = system.getUserAccountDirectory().createUserAccount("deliveryMan", "deliveryMan", deliveryMan, new DeliverManRole());
        UserAccount RoleRestaurantAdmin = system.getUserAccountDirectory().createUserAccount("adminRole", "adminRole", restaurantAdmin, new AdminRole());
        
        return system;
    }
    
}
