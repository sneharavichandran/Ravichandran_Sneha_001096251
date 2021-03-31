/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount user;
    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageCustomerJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;

       populateCustomerTable();
    }

    private void populateCustomerTable() {
        DefaultTableModel model = (DefaultTableModel) customerJTable.getModel();

        model.setRowCount(0);
        for(UserAccount user: ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(user.getRole().getClass().getName()=="Business.Role.CustomerRole"){
                Object [] row = new Object[3];
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
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

        lblName = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtCustomerName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblName2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerJTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        lblName.setText("Name:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblName1.setText("Username:");

        lblName2.setText("Password:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        customerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "UserName", "Password"
            }
        ));
        jScrollPane2.setViewportView(customerJTable);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(539, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnUpdate)
                                        .addComponent(btnDelete)))
                                .addGap(0, 60, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSubmit)
                                        .addGap(54, 54, 54)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnSave, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmit)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

       /* String name = txtCustomerName.getText();
        String username= txtUserName.getText();
        String password = txtPassword.getText();
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(name);
        UserAccount useraccount= ecosystem.getUserAccountDirectory().createUserAccount(name,username, password, employee, new CustomerRole());*/
        //customer.setName(name);

        //populateCustomerTable();
        if(ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){
             UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(txtCustomerName.getText(), txtUserName.getText(), txtPassword.getText(), null, new CustomerRole());
            Customer customer = ecosystem.getCustomerDirectory().createUserAccount(txtUserName.getText());
            populateCustomerTable();
            txtCustomerName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        ecosystem.getUserAccountDirectory().updateUserAccount(user, txtCustomerName.getText(), txtUserName.getText(), txtPassword.getText());
        populateCustomerTable();
        
            txtCustomerName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Do you want to delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) customerJTable.getValueAt(selectedRow, 1);
                String pwd= (String) customerJTable.getValueAt(selectedRow, 2);
                UserAccount user=ecosystem.getUserAccountDirectory().authenticateUser(username, pwd);

               
                ecosystem.getUserAccountDirectory().deleteUserAccount(user);
                ecosystem.getCustomerDirectory().deleteCustomer(user.getUsername());
                populateCustomerTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = customerJTable.getSelectedRow();

        if(selectRow>=0){
            String name = (String) customerJTable.getValueAt(selectRow, 0);
            String username= (String) customerJTable.getValueAt(selectRow, 1);
            String password= (String) customerJTable.getValueAt(selectRow, 2);
            user=ecosystem.getUserAccountDirectory().authenticateUser(username, password);

            txtCustomerName.setText(name+"");
            txtUserName.setText(username+"");
            txtPassword.setText(password+"");
            
            JOptionPane.showMessageDialog(null,"Please press save button to save the profile after updating the text field");
            

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row to update a profile");
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable customerJTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
