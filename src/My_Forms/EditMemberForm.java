
package My_Forms;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import My_classes.Member;

public class EditMemberForm extends javax.swing.JFrame {

    My_classes.Member member = new My_classes.Member();
    My_classes.Func_Class func = new My_classes.Func_Class();
    public EditMemberForm() {
        initComponents();
        //center the form
        this.setLocationRelativeTo(null);
        //add a gray border to the panel 
         Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(3,166,120));
        jPanel1.setBorder(panelHeaderBorder);
        
        //display image in the top
        func.displayImage(70,50,null, "/My_images/members-42918_640.png", jLabel_FormTitle);     
        //cách ẩn thông báo empty
        jLabel_EmptyFirstName_.setVisible(false);
        jLabel_EmptyLastName_.setVisible(false);
        jLabel_EmptyPhone_.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jButton_Edit_ = new javax.swing.JButton();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel_EmptyPhone_ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_Gender = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jButton_Search_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(37, 168, 118));
        jLabel_FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Edit Member");
        jLabel_FormTitle.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("First Name:");

        jTextField_FirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Edit_.setText("Edit Member Info");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jLabel_CloseForm_.setBackground(new java.awt.Color(37, 168, 118));
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

        jLabel_EmptyFirstName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyFirstName_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_EmptyFirstName_.setText("Enter the first name");
        jLabel_EmptyFirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstName_MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phone Number:");

        jTextField_Phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jLabel_EmptyPhone_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyPhone_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_EmptyPhone_.setText("Enter the phone number");
        jLabel_EmptyPhone_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPhone_MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email:");

        jTextField_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Gender:");

        jComboBox_Gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Enter Member ID:");

        jTextField_Id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Search_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Search_.setText("search");
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(29, 29, 29)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_EmptyPhone_, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Search_, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton_Search_))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyFirstName_))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyLastName_))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyPhone_))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jButton_Edit_)
                .addGap(68, 68, 68))
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

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        

        //sửa một dữ liệu
        String firstName = jTextField_FirstName.getText();
        String lastName = jTextField_LastName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String gender = jComboBox_Gender.getSelectedItem().toString();
        //String about = jTextArea_About.getText();
        int id = Integer.parseInt(jTextField_Id.getText());
        
        //hiển thị empty nếu file tồn tại
        if(firstName.isEmpty()){
            jLabel_EmptyFirstName_.setVisible(true);
        }
        else if(lastName.isEmpty()){
            jLabel_EmptyLastName_.setVisible(true);
        }else if(phone.isEmpty()){
            jLabel_EmptyPhone_.setVisible(true);
        }
        else{           
            member.editMember(id, firstName, lastName, phone, email, gender);
            // làm mới bảng 
         
            
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    
    
    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstName_MouseClicked
        // ẩn emptyname khi nhấn
        jLabel_EmptyFirstName_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyFirstName_MouseClicked

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastName_MouseClicked
        jLabel_EmptyLastName_.setVisible(false);
        
    }//GEN-LAST:event_jLabel_EmptyLastName_MouseClicked

    private void jLabel_EmptyPhone_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyPhone_MouseClicked
        jLabel_EmptyPhone_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyPhone_MouseClicked

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_ActionPerformed
        // lấy dữ liệu thành vien
        Member SelecteMember;
       try {
        // tìm kiếm một id và hiển thị ra thông tin dữ liệu       
            Integer id = Integer.parseInt(jTextField_Id.getText());
            SelecteMember = member.getMemberById(id);
            if(SelecteMember !=null){
                   jTextField_Id.setText(Integer.toString(SelecteMember.getId()));
                    jTextField_FirstName.setText(SelecteMember.getFirstName());
                    jTextField_LastName.setText(SelecteMember.getLastName());
                    jTextField_Phone.setText(SelecteMember.getPhone());
                    jTextField_Email.setText(SelecteMember.getEmail());
                    jComboBox_Gender.setSelectedItem(SelecteMember.getGender());
    } else {
        JOptionPane.showMessageDialog(null, "Không tìm thấy thành viên có id này", "Thông báo", 3);
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Thông tin không hợp lệ", "Thông báo", 3);
}
      
    }//GEN-LAST:event_jButton_Search_ActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
                if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JComboBox<String> jComboBox_Gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyPhone_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Phone;
    // End of variables declaration//GEN-END:variables

}
