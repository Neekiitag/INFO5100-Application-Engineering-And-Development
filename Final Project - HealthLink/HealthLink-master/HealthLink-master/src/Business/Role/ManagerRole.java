/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountantOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmaManagerRole.ManageMenuJPanel;
import userinterface.PharmaManagerRole.ManagerWorkAreaJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class ManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new ManagerWorkAreaJPanel(userProcessContainer, account,(ManagerOrganization)organization, enterprise);
    }
    
}
