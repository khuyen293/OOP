  
package My_Forms;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

/**
 *
 * @author admin
 */
public class ManageUsersForm extends javax.swing.JFrame {

    My_classes.Users user = new My_classes.Users();
    public ManageUsersForm() {
        initComponents();
        //center the form
        this.setLocationRelativeTo(null);
        //add a gray border to the panel 
         Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(129,108,101));
        jPanel1.setBorder(panelHeaderBorder);
        //display image in the top
        My_classes.Func_Class func = new My_classes.Func_Class();
        func.displayImage(75,60,null, "/My_images/user.png", jLabel_FormTitle);
        
        // tuy chinh bang
       func.customTable(jTable_Users_);
         
        // tuy chinh hang tieu de
       func.customTableHeader(jTable_Users_, new Color(51, 110, 123), 13);
       
        
        //cách ẩn thông báo empty
        jLabel_EmptyFirstName_.setForeground(Color.white);
        jLabel_EmptyLastName_.setForeground(Color.white);
        jLabel_EmptyUserName_.setForeground(Color.white);
        jLabel_Password_.setForeground(Color.white);
        //jLabel_EmptyRectype_.setVisible(false);
        populateJtableWithUsers();
        Random();
     
    }
        public void Random(){
        Random rd = new Random();
        jTextField_ID.setText(""+rd.nextInt(1000+1));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_FirstName = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users_ = new javax.swing.JTable();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_UserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jPasswordField_RectypePassword = new javax.swing.JPasswordField();
        jLabel_EmptyUserName_ = new javax.swing.JLabel();
        jLabel_Password_ = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(129, 108, 101));
        jLabel_FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Manage Users");
        jLabel_FormTitle.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("First Name:");

        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_ID.setEnabled(false);

        jTextField_FirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Add_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Add_.setText("Add");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Edit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_Delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jLabel_CloseForm_.setBackground(new java.awt.Color(129, 108, 101));
        jLabel_CloseForm_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("x");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jTable_Users_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_Users_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Users_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Users_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users_);

        jLabel_EmptyFirstName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyFirstName_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_EmptyFirstName_.setText("Enter the first name");
        jLabel_EmptyFirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstName_MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        jTextField_LastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyLastName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyLastName_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_EmptyLastName_.setText("Enter the last name");
        jLabel_EmptyLastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyLastName_MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Username:");

        jTextField_UserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Rectype Password:");

        jPasswordField_Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPasswordField_RectypePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyUserName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyUserName_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_EmptyUserName_.setText("Enter the username");
        jLabel_EmptyUserName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyUserName_MouseClicked(evt);
            }
        });

        jLabel_Password_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_Password_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Password_.setText("Enter the first name");
        jLabel_Password_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Password_MouseClicked(evt);
            }
        });

        jCheckBox1.setText("Make This User an Admin");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCheckBox1)
                                    .addGap(37, 37, 37))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton_Add_)
                                    .addGap(49, 49, 49)))
                            .addComponent(jButton_Edit)
                            .addGap(45, 45, 45)
                            .addComponent(jButton_Delete))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_EmptyUserName_, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Password_, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPasswordField_RectypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyFirstName_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyLastName_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyUserName_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Password_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_RectypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add_)
                            .addComponent(jButton_Edit)
                            .addComponent(jButton_Delete))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        //đóng biểu mẫu 
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
      // Thêm mới một dữ liệu
    String firstName = jTextField_FirstName.getText();
    String lastName = jTextField_LastName.getText();
    String username = jTextField_UserName.getText();
    String password_1 = String.valueOf(jPasswordField_Password.getPassword());
    String password_2 = String.valueOf(jPasswordField_RectypePassword.getPassword());
    String userType = "User";
    if (jCheckBox1.isSelected()) {
        userType = "Admin";
    }

    // Kiểm tra các trường dữ liệu trước khi thêm vào cơ sở dữ liệu
    if (firstName.trim().isEmpty()) {
        jLabel_EmptyFirstName_.setForeground(Color.red);
    } else if (lastName.trim().isEmpty()) {
        jLabel_EmptyLastName_.setForeground(Color.red);
    } else if (username.trim().isEmpty()) {
        jLabel_EmptyUserName_.setForeground(Color.red);
    } else if (password_1.trim().isEmpty()) {
        jLabel_Password_.setForeground(Color.red);
    } else if (!password_1.equals(password_2)) {
        JOptionPane.showMessageDialog(null, "Vui lòng xác nhập lại mật khẩu", "Thông báo", 0);
    } else {
        try {
            int id = Integer.parseInt(jTextField_ID.getText());
            if (user.checkUsernameExists(username, id)) {
                JOptionPane.showMessageDialog(null, "Tên tài khoản đã tồn tại", "Thông báo", 0);
            }
                else{
                user.addUser(id, firstName, lastName, username, password_1, userType);
                // Làm mới bảng
                populateJtableWithUsers();
                Random();              
                jTextField_FirstName.setText("");
                jTextField_LastName.setText("");
                jTextField_UserName.setText("");
                jPasswordField_Password.setText("");
                jPasswordField_RectypePassword.setText("");
                jCheckBox1.setSelected(false);
                hideLabels();
                }

            // Đặt lại các giá trị
            // đặt lại các giá trị của các trường dữ liệu thành rỗng
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Tài khoản thêm không hợp lệ", "Thông báo", 0);
        }
    }
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        //sửa taif khoan           
        
        String firstName = jTextField_FirstName.getText();
        String lastName = jTextField_LastName.getText();
        String username = jTextField_UserName.getText();
        String password_1= jPasswordField_Password .getText();
        String password_2 = jPasswordField_RectypePassword.getText();
        String userType = "User";
        if(jCheckBox1.isSelected()){
            userType = "Admin";
        }
        //hiển thị empty nếu file tồn tại
        if(firstName.trim().isEmpty()){
            jLabel_EmptyFirstName_.setForeground(Color.red);
        }
        else if(lastName.trim().isEmpty()){
            jLabel_EmptyLastName_.setForeground(Color.red);
        }else if(username.trim().isEmpty()){
            //jLabel_EmptyUserName_.setVisible(true);
            jLabel_EmptyUserName_.setForeground(Color.red);
        }else if(password_1.trim().isEmpty()){
            //jLabel_EmptyPassword_.setVisible(true);
            jLabel_Password_.setForeground(Color.red);
        }else if(!password_1.equals(password_2)){
            JOptionPane.showMessageDialog(null, "Vui lòng xác nhập lại mật khẩu", "Thông báo", 0);
            //khi chúng ta tạo ra người dùng thì chúng ta phải kiểm tra xem người dùng này đã được tạo hay chưa
        }else{ 
            try{
                    int id = Integer.parseInt(jTextField_ID.getText());
                    if(user.checkUsernameExists(username, id)){
                      JOptionPane.showMessageDialog(null,"ID hoặc Tên tài khoản đã tồn tại", "Thông báo", 0);
                
                         }else{
                    user.editUser(id, firstName, lastName, username, password_1, userType);
                     // làm mới bảng 
                    populateJtableWithUsers();
                    }
                 Random();
                 jTextField_FirstName.setText("");
                 jTextField_LastName.setText("");
                 jTextField_UserName.setText("");
                 jPasswordField_Password.setText("");
                 jPasswordField_RectypePassword.setText("");
                 jCheckBox1.setSelected(false);
                 hideLabels();
                
                
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Chọn tài khoản bạn muốn chỉnh sửa từ bảng", "Thông báo", 0);
            }
           
           
            
        }
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        //xóa tác giả
        try{
                int id = Integer.parseInt(jTextField_ID.getText());
                int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa tài khoản này?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION){
                user.removeUser(id);
                }
                //author.removeAuthor(id);
                //tichs vào genres và xóa
                populateJtableWithUsers();
                 //xóa luôn ở form
                 Random();
                 jTextField_FirstName.setText("");
                 jTextField_LastName.setText("");
                 jTextField_UserName.setText("");
                 jPasswordField_Password.setText("");
                 jPasswordField_RectypePassword.setText("");
                 jCheckBox1.setSelected(false);
                 hideLabels();
                
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Không hợp lệ", "Thông báo", 0);
            }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jTable_Users_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Users_MouseClicked
         //hiển thị thể loại đã chọn   
    //populateJtableWithAuthors();
    
    //lay ra danh sach da chon
    int index = jTable_Users_.getSelectedRow();
    //nhận giá trị
    if(index >= 0){
         String id = jTable_Users_.getValueAt(index, 0).toString();
        String firstName = jTable_Users_.getValueAt(index, 1).toString();
        String lastName = jTable_Users_.getValueAt(index, 2).toString();
        String username = jTable_Users_.getValueAt(index, 3).toString();
        String password = jTable_Users_.getValueAt(index, 4).toString();
        String userType = jTable_Users_.getValueAt(index, 5).toString();

        //hiển thị dữ liệu ra
        jTextField_ID.setText(id);
        jTextField_FirstName.setText(firstName);
        jTextField_LastName.setText(lastName);
        jTextField_UserName.setText(username);
        jPasswordField_Password.setText(password);
        //jPasswordField_RectypePassword.setText(userType);

        if(userType.equals("Admin")){
            jCheckBox1.setSelected(true);
        }else{
            jCheckBox1.setSelected(false);
        }
    }  
        
    }//GEN-LAST:event_jTable_Users_MouseClicked
    // tạo một phương thức để ẩn tất cả jlabel
    public void hideLabels(){
        jLabel_EmptyFirstName_.setForeground(Color.white);
        jLabel_EmptyLastName_.setForeground(Color.white);
        jLabel_EmptyUserName_.setForeground(Color.white);
        jLabel_Password_.setForeground(Color.white);
    }
    
    //tạo 1 hàm để điền vào bảng các authors
    public void populateJtableWithUsers(){
        ArrayList<My_classes.Users>  usersList = user.usersList();
        //cac cot
        String[] colNames = {"ID", "First Name", "Last Name", "Username", "Password", "Type"};
        
        //hang
        Object[][] rows = new Object[usersList.size()][colNames.length];
        for(int i = 0; i < usersList.size(); i++){
            rows[i][0] = usersList.get(i).getId();
            rows[i][1] = usersList.get(i).getFirstName();
            rows[i][2] = usersList.get(i).getLastName();
            rows[i][3] = usersList.get(i).getUserName();
            rows[i][4] = usersList.get(i).getPassword();
            rows[i][5] = usersList.get(i).getUserType();
            
        }
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable_Users_.setModel(model);
    }
    
    
    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstName_MouseClicked
        // ẩn emptyname khi nhấn
        jLabel_EmptyFirstName_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyFirstName_MouseClicked

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastName_MouseClicked
        jLabel_EmptyLastName_.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_EmptyLastName_MouseClicked

    private void jLabel_EmptyUserName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyUserName_MouseClicked
        jLabel_EmptyUserName_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyUserName_MouseClicked

    private void jLabel_Password_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Password_MouseClicked
        jLabel_Password_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_Password_MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyUserName_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Password_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JPasswordField jPasswordField_RectypePassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users_;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_UserName;
    // End of variables declaration//GEN-END:variables

//    private Object jTable_Genres_getValueAt(int index, int i) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    private int jTable_Genres_getSelectedRow() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

  

 
}
