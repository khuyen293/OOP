
package My_Forms;

import java.awt.Color;
import java.awt.HeadlessException;

import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class ReturnBookForm extends javax.swing.JFrame {

    /**
     * Creates new form MemberForm
     */
    My_classes.Member member = new My_classes.Member();
    My_classes.Func_Class func = new My_classes.Func_Class();
    My_classes.Genre genre = new My_classes.Genre();
    My_classes.Book book = new My_classes.Book();  
    My_classes.Issue_Book issue = new My_classes.Issue_Book();  
    HashMap<String, Integer> genresMap = genre.getGenresMap();
    boolean book_Exist = false;
    boolean member_Exist = false;
   // String imagePath = "";
    public ReturnBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        //add a gray border to the panel 
         Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(175,65,84));
        jPanel1.setBorder(panelHeaderBorder);
        //display image in the top
        My_classes.Func_Class func = new My_classes.Func_Class();
        func.displayImage(80,55, null, "/My_images/issue.png", jLabel_FormTitle);
          // tuy chinh bang
       func.customTable(jTable_IssuedBooks_);
         
        // tuy chinh hang tieu de
       func.customTableHeader(jTable_IssuedBooks_, new Color(51, 110, 123), 13);
        setBorderToJlabel(jLabel_BookName, Color.white);
        setBorderToJlabel(jLabel_MemberFullName, Color.white);
        populateJtableWithIssue_Books("");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_Return_ = new javax.swing.JButton();
        jButton_Lost_ = new javax.swing.JButton();
        jDateChooser_Issue_Date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel_BookName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel_MemberFullName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser_Return_Date = new com.toedter.calendar.JDateChooser();
        jSpinner_BookId = new javax.swing.JSpinner();
        jSpinner_MemberId = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_IssuedBooks_ = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_BookStatus_ = new javax.swing.JComboBox<>();
        jButton_Delete_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(175, 65, 84));
        jLabel_FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Return Book");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(175, 65, 84));
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Issue Date:");

        jButton_Return_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Return_.setText("Return");
        jButton_Return_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Return_ActionPerformed(evt);
            }
        });

        jButton_Lost_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Lost_.setText("Lost");
        jButton_Lost_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Lost_ActionPerformed(evt);
            }
        });

        jDateChooser_Issue_Date.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Enter Book ID:");

        jLabel_BookName.setForeground(new java.awt.Color(0, 51, 204));
        jLabel_BookName.setText("Book Name");
        jLabel_BookName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_BookName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Enter Member ID:");

        jLabel_MemberFullName.setForeground(new java.awt.Color(0, 51, 204));
        jLabel_MemberFullName.setText("Member Full Name");
        jLabel_MemberFullName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MemberFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullNameMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Return Date:");

        jSpinner_BookId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinner_BookId.setEnabled(false);

        jSpinner_MemberId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinner_MemberId.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Note:");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        jTable_IssuedBooks_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_IssuedBooks_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_IssuedBooks_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_IssuedBooks_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_IssuedBooks_);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Select Book Status: ");

        jComboBox_BookStatus_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_BookStatus_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Issued", "Returned", "Lost" }));
        jComboBox_BookStatus_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_BookStatus_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Delete_.setText("Delete");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
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
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateChooser_Issue_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_BookName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinner_MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinner_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_MemberFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 33, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton_Return_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Lost_, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_BookStatus_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox_BookStatus_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_BookName)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner_MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_MemberFullName)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_Issue_Date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Return_)
                            .addComponent(jButton_Lost_))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Delete_)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Lost_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Lost_ActionPerformed
        // khi sách bị mất
        //cần cập nhật trạng thái khi sách mất
        // cần chỉnh lại số lượng sách
        // số lượng sách - 1
        //mất sách cũng k đổi ngày trả
        int book_id = (int) jSpinner_BookId.getValue();
        int member_id = (int) jSpinner_MemberId.getValue();
        String note = jTextArea_Note.getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{        
        
        String return_date = dateFormat.format(jDateChooser_Return_Date.getDate());      
        //trước khi cấp chúng ta cần kiểm tra
        //nếu trả về ngày ban hành
        String issue_date = dateFormat.format(jDateChooser_Issue_Date.getDate());
             issue.updateIssue(book_id, member_id, "lost", issue_date, return_date, note);
             //cần cập nhật lại số lượng sách
             int quantity = new My_classes.Book().getBookById(book_id).getQuantity(); //lấy số lượng sách
             book.setQuantity_Minus_One(book_id, quantity - 1);//cập nhật lại sôs sách
             
             jSpinner_BookId.setValue(0);
             jSpinner_MemberId.setValue(0);
             jLabel_BookName.setText("Book Name");
             jLabel_MemberFullName.setText("Member Full_Name");
             jDateChooser_Issue_Date.setDate(new Date());
             jDateChooser_Return_Date.setDate(new Date());
             jTextArea_Note.setText("");
       
        }catch(HeadlessException | NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Chọn một mục từ bảng", "Thông báo", 2);
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_Lost_ActionPerformed

    private void jButton_Return_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Return_ActionPerformed
        // return một cuốn sách
        //chúng ta sẽ cập nhật ngày trả
        // ghi chú
        // và status để trả lại
        int book_id = (int) jSpinner_BookId.getValue();
        int member_id = (int) jSpinner_MemberId.getValue();
        String note = jTextArea_Note.getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{        
        
        String return_date = dateFormat.format(jDateChooser_Return_Date.getDate());
        Date rtnDate = dateFormat.parse(return_date); 
        //trước khi cấp chúng ta cần kiểm tra
        //nếu trả về ngày ban hành
        String issue_date = dateFormat.format(jDateChooser_Issue_Date.getDate());
        Date issDate = dateFormat.parse(issue_date);
        
        if(rtnDate.before(issDate)){
             JOptionPane.showMessageDialog(null, "Dữ liệu trả về phải sau ngày phát hành", "Thông báo", 2);
        }else{
             issue.updateIssue(book_id, member_id, "returned", issue_date, return_date, note);
             jSpinner_BookId.setValue(0);
             jSpinner_MemberId.setValue(0);
             jLabel_BookName.setText("Book Name");
             jLabel_MemberFullName.setText("Member Full_Name");
             jDateChooser_Issue_Date.setDate(new Date());
             jDateChooser_Return_Date.setDate(new Date());
             jTextArea_Note.setText("");
        }
       
        }catch(HeadlessException | NullPointerException | ParseException ex){
            JOptionPane.showMessageDialog(null, "Chọn một mục từ bảng", "Thông báo", 2);
        }
    }//GEN-LAST:event_jButton_Return_ActionPerformed

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        //đóng biểu mẫu
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jLabel_BookNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseClicked
        // hiển thị thẻ sách
        int book_id =(int)jSpinner_BookId.getValue();
        BookInfoCardForm bookCardF = new BookInfoCardForm(book_id);
       
        bookCardF.setVisible(true);
    }//GEN-LAST:event_jLabel_BookNameMouseClicked

    private void jLabel_MemberFullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullNameMouseClicked
       int member_id =(int)jSpinner_MemberId.getValue();
        MemberInfoCardForm memberCardF = new MemberInfoCardForm(member_id);       
        memberCardF.setVisible(true);
    }//GEN-LAST:event_jLabel_MemberFullNameMouseClicked

    private void jLabel_BookNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseEntered

           setBorderToJlabel(jLabel_BookName, new Color(51, 102, 155));
    }//GEN-LAST:event_jLabel_BookNameMouseEntered

    private void jLabel_BookNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseExited

          setBorderToJlabel(jLabel_BookName, Color.white);
    }//GEN-LAST:event_jLabel_BookNameMouseExited

    private void jLabel_MemberFullNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullNameMouseEntered

          setBorderToJlabel(jLabel_MemberFullName, new Color(51, 102, 155));
    }//GEN-LAST:event_jLabel_MemberFullNameMouseEntered

    private void jLabel_MemberFullNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullNameMouseExited
          setBorderToJlabel(jLabel_MemberFullName, Color.white);
    }//GEN-LAST:event_jLabel_MemberFullNameMouseExited

    private void jTable_IssuedBooks_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_IssuedBooks_MouseClicked
        //hiển thị thể loại đã chọn
        //populateJtableWithAuthors();

        //lay ra danh sach da chon
        int index = jTable_IssuedBooks_.getSelectedRow();
        //nhận giá trị
        if(index >= 0){
            int book_id = Integer.parseInt(jTable_IssuedBooks_.getValueAt(index, 0).toString());
            int member_id = Integer.parseInt(jTable_IssuedBooks_.getValueAt(index, 1).toString());
              My_classes.Book selectedBook;
              My_classes.Member selectedMember = member.getMemberById(member_id);
            try {
                selectedBook = book.getBookById(book_id);
                //hien thi tieu de sach
                if(selectedBook!=null){
                jLabel_BookName.setText(selectedBook.getName());  
                jSpinner_BookId.setValue(selectedBook.getID());
                }else{
                   // JOptionPane.showMessageDialog(null, "Sách không hiện có");
                }               
                selectedMember= member.getMemberById(member_id);
                if(selectedMember != null){
                //hien thi tieu de sach
                jLabel_MemberFullName.setText(selectedMember.getFirstName() + " " + selectedMember.getLastName());   
                jSpinner_MemberId.setValue(selectedMember.getId());
                }else{
                   // JOptionPane.showMessageDialog(null, "Thành viên không hiện có");
                }
                String issued_date = jTable_IssuedBooks_.getValueAt(index, 3).toString();
                String return_date = jTable_IssuedBooks_.getValueAt(index, 4).toString();
                //String status = jTable_IssuedBooks_.getValueAt(index, 4).toString();
                String note = jTable_IssuedBooks_.getValueAt(index, 5).toString();
                
                Date issDate = new SimpleDateFormat("yyyy-MM-dd").parse(issued_date);
                jDateChooser_Issue_Date.setDate(issDate);
                
                Date rtnDate = new SimpleDateFormat("yyyy-MM-dd").parse(return_date);
                jDateChooser_Return_Date.setDate(rtnDate);
                
                jTextArea_Note.setText(note);
            } catch (SQLException ex) {
                Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

    }//GEN-LAST:event_jTable_IssuedBooks_MouseClicked

    private void jComboBox_BookStatus_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_BookStatus_ActionPerformed
        //hien thi du lieu vao bang dua tren tuy chon
        String status = jComboBox_BookStatus_.getSelectedItem().toString();
        if(status.equals("All")){
            status = "";
        }
        populateJtableWithIssue_Books(status);
    }//GEN-LAST:event_jComboBox_BookStatus_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed

        int index = jTable_IssuedBooks_.getSelectedRow();
        try{
        int book_id = Integer.parseInt(jTable_IssuedBooks_.getValueAt(index, 0).toString());
        int member_id = Integer.parseInt(jTable_IssuedBooks_.getValueAt(index, 1).toString());
        String issue_date = jTable_IssuedBooks_.getValueAt(index, 3).toString();
        
        issue.removeFromIssuedBook(book_id, member_id, issue_date);
        jSpinner_BookId.setValue(0);
        jSpinner_MemberId.setValue(0);
        jLabel_BookName.setText("Book Name");
        jLabel_MemberFullName.setText("Member Full-Name");
        jDateChooser_Issue_Date.setDate(new Date());
        jDateChooser_Return_Date.setDate(new Date());
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo", 2);
            
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    public void setBorderToJlabel(JLabel label, Color color){
        Border border = BorderFactory.createMatteBorder(0, 0,1, 0, color);
        label.setBorder(border);
    }
    
     public void populateJtableWithIssue_Books(String status){
        ArrayList<My_classes.Issue_Book>  issBooksList = issue.issueBooksList(status);
        //cac cot
        String[] colNames = {"Book ID", "Member ID", "Status", "Issued Date", "Return Date", "Note"};
        
        //hang
        Object[][] rows = new Object[issBooksList.size()][colNames.length];
        for(int i = 0; i < issBooksList.size(); i++){
            rows[i][0] = issBooksList.get(i).getBook_id();
            rows[i][1] = issBooksList.get(i).getMember_id();
            rows[i][2] = issBooksList.get(i).getStatus();
            rows[i][3] = issBooksList.get(i).getIssue_date();
            rows[i][4] = issBooksList.get(i).getReturn_date();
            rows[i][5] = issBooksList.get(i).getNote();
            
        }
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable_IssuedBooks_.setModel(model);
    }
    
    // tao mot 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                     //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Lost_;
    private javax.swing.JButton jButton_Return_;
    private javax.swing.JComboBox<String> jComboBox_BookStatus_;
    private com.toedter.calendar.JDateChooser jDateChooser_Issue_Date;
    private com.toedter.calendar.JDateChooser jDateChooser_Return_Date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_BookName;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_MemberFullName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_BookId;
    private javax.swing.JSpinner jSpinner_MemberId;
    private javax.swing.JTable jTable_IssuedBooks_;
    private javax.swing.JTextArea jTextArea_Note;
    // End of variables declaration//GEN-END:variables
}
