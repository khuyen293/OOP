
package My_Forms;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import My_classes.Author;

public class AuthorsListForm extends javax.swing.JFrame {

    //My_classes.Author author = new My_classes.Author();
    public String formType = "";
    public AuthorsListForm() {
        initComponents();
        //center the form
        this.setLocationRelativeTo(null);
        //add a gray border to the panel 
         Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(37, 116, 169));
        jPanel1.setBorder(panelHeaderBorder);
        //display image in the top
        My_classes.Func_Class func = new My_classes.Func_Class();
        func.displayImage(75,60,null, "/My_images/author.png", jLabel_FormTitle);
        
        // tuy chinh bang
       func.customTable(jTable_Authors_);
         
        // tuy chinh hang tieu de
       func.customTableHeader(jTable_Authors_, new Color(51, 110, 123), 13);
       
        
       
        populateJtableWithAuthors("");
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Authors_ = new javax.swing.JTable();
        jButton_Select_Author_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jButton_Search_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(37, 116, 169));
        jLabel_FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Authors List");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(37, 116, 169));
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

        jTable_Authors_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_Authors_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Authors_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Authors_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Authors_);

        jButton_Select_Author_.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton_Select_Author_.setText("Select Author");
        jButton_Select_Author_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_Author_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Value to Search:");

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jButton_Search_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Search_.setText("search");
        jButton_Search_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Search_MouseClicked(evt);
            }
        });
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                            .addComponent(jButton_Select_Author_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton_Search_, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search_))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Select_Author_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void jTable_Authors_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Authors_MouseClicked
       
    }//GEN-LAST:event_jTable_Authors_MouseClicked

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        //đóng biểu mẫu
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jButton_Select_Author_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_Author_ActionPerformed
         //hiển thị thể loại đã chọn
        //populateJtableWithAuthors();

        //lay ra danh sach da chon
        int index = jTable_Authors_.getSelectedRow();
        //nhận giá trị
       
            int id = Integer.parseInt(jTable_Authors_.getValueAt(index, 0).toString());
            String firstName = jTable_Authors_.getValueAt(index, 1).toString();
            String lastName = jTable_Authors_.getValueAt(index, 2).toString();
            String full_name = firstName + " " + lastName;
            if(formType.equals("edit")){ // nếu form đang gọi đến để sửa
                EditBookForm.displayAuthorData(id,full_name);
            }else
            AddBookForm.displayAuthorData(id,full_name);
            
            this.dispose();

      
    }//GEN-LAST:event_jButton_Select_Author_ActionPerformed

    private void jButton_Search_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Search_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Search_MouseClicked

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_ActionPerformed
        // Tim kiem va in du lieu ra bang
        String value = jTextField_Search.getText();
        String query = "SELECT * FROM authors WHERE id LIKE '%"+value+"%' or firtName LIKE '%"+value+"%' or lastName LIKE '%"+value+"%' ";
        populateJtableWithAuthors(query);

    }//GEN-LAST:event_jButton_Search_ActionPerformed

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    
    //tạo 1 hàm để điền vào bảng các authors
    public void populateJtableWithAuthors(String query){
        My_classes.Author author = new My_classes.Author();
        ArrayList<My_classes.Author>  authorsList = author.authorsList(query);
        //cac cot
        String[] colNames = {"ID", "First Name", "Last Name", "Expertise", "About"};
        
        //hang
        Object[][] rows = new Object[authorsList.size()][colNames.length];
        for(int i = 0; i < authorsList.size(); i++){
            rows[i][0] = authorsList.get(i).getId();
            rows[i][1] = authorsList.get(i).getFirstName();
            rows[i][2] = authorsList.get(i).getLastName();
            rows[i][3] = authorsList.get(i).getField_Of_Expertise();
            rows[i][4] = authorsList.get(i).getAbout();
            
        }
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable_Authors_.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JButton jButton_Select_Author_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_Authors_;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables

 
}
