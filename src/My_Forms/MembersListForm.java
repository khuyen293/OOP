
package My_Forms;

import My_classes.Member;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class MembersListForm extends javax.swing.JFrame {
    My_classes.Member member = new My_classes.Member();
    My_classes.Func_Class func = new My_classes.Func_Class();
    public MembersListForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        //add a gray border to the panel 
         Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(3,166,120));
        jPanel1.setBorder(panelHeaderBorder);
        //display image in the top
        My_classes.Func_Class func = new My_classes.Func_Class();
        func.displayImage(70,50,null, "/My_images/members-42918_640.png", jLabel_FormTitle);
        func.displayImage(80,65,null, "/My_images/blank-profile.png", jLabel_Image);
        
         // tuy chinh bang
       func.customTable(jTable_Members_);
         
        // tuy chinh hang tieu de
       func.customTableHeader(jTable_Members_, new Color(51, 110, 123), 13);
        populateJtableWithMembers("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Members_ = new javax.swing.JTable();
        jButton_Search_ = new javax.swing.JButton();
        jLabel_FullName = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(37, 168, 118));
        jLabel_FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Members List");
        jLabel_FormTitle.setOpaque(true);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Value to Search:");

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTable_Members_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Members_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Members_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Members_);

        jButton_Search_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Search_.setText("search");
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        jLabel_FullName.setText("Full Name");

        jLabel_Phone.setText("Phone");

        jLabel_Email.setText("Email");

        jLabel_Gender.setText("Gender");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton_Search_, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search_))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_FullName)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Phone)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Email)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Gender))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
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

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_ActionPerformed
        // Tim kiem va in du lieu ra bang
        String value = jTextField_Search.getText();
        String query = "SELECT * FROM members WHERE firstName LIKE '%"+value+"%' or lastName LIKE '%"+value+"%'";
        populateJtableWithMembers(query);
    }//GEN-LAST:event_jButton_Search_ActionPerformed

    private void jTable_Members_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Members_MouseClicked
        // hiển thị dữ liệu thành viên đã chọn
        // lấy dữ liệu thành vien
        Member SelecteMember;
        try {
            
            //lấy chỉ mục hàng jtable đã chọn
            Integer rowIndex = jTable_Members_.getSelectedRow();
            //lấy id thành viên từ jtable (id là cột đầu tiên)
            Integer id = Integer.parseInt(jTable_Members_.getModel().getValueAt(rowIndex, 0).toString());
            SelecteMember = member.getMemberById(id);
            if(SelecteMember !=null){
                jLabel_FullName.setText(SelecteMember.getFirstName() + " " + SelecteMember.getLastName());
                jLabel_Phone.setText(SelecteMember.getPhone());
                jLabel_Email.setText(SelecteMember.getEmail());
                jLabel_Gender.setText(SelecteMember.getGender());
            }else{
                JOptionPane.showMessageDialog(null, "Không tìm thấy thành viên có id này", "Thông báo", 3);
            }
            
        } catch (Exception ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Thông tin không hợp lệ", "Thông báo", 3);
        }
        
    }//GEN-LAST:event_jTable_Members_MouseClicked

   public void populateJtableWithMembers(String query){
        ArrayList<My_classes.Member>  membersList = member.membersList(query);
        //cac cot
        String[] colNames = {"ID", "First Name", "Last Name", "Phone", "Email", "Gender"};
        
        //hang
        Object[][] rows = new Object[membersList.size()][colNames.length];
        for(int i = 0; i < membersList.size(); i++){
            rows[i][0] = membersList.get(i).getId();
            rows[i][1] = membersList.get(i).getFirstName();
            rows[i][2] = membersList.get(i).getLastName();
            rows[i][3] = membersList.get(i).getPhone();
            rows[i][4] = membersList.get(i).getEmail();
            rows[i][5] = membersList.get(i).getGender();
            
        }
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable_Members_.setModel(model);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_FullName;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Members_;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
