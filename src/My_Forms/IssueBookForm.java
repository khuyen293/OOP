
package My_Forms;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class IssueBookForm extends javax.swing.JFrame {

    My_classes.Member member = new My_classes.Member();
    My_classes.Func_Class func = new My_classes.Func_Class();
    My_classes.Genre genre = new My_classes.Genre();
    My_classes.Book book = new My_classes.Book();  
    My_classes.Issue_Book issue = new My_classes.Issue_Book();  
    HashMap<String, Integer> genresMap = genre.getGenresMap();
    boolean book_Exist = false;
    boolean member_Exist = false;
    String imagePath = "";
    public IssueBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        //add a gray border to the panel 
         Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(175,65,84));
        //jPanel1.setBorder(panelHeaderBorder);
        //display image in the top
        My_classes.Func_Class func = new My_classes.Func_Class();
        func.displayImage(80,55, null, "/My_images/issue.png", jLabel_FormTitle);
        setBorderToJlabel(jLabel_BookName, Color.white);
        setBorderToJlabel(jLabel_MemberFullName, Color.white);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_Issue_ = new javax.swing.JButton();
        jButton_Cancel_ = new javax.swing.JButton();
        jButton_search_book_ = new javax.swing.JButton();
        jDateChooser_Issue_Date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel_BookName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel_MemberFullName = new javax.swing.JLabel();
        jButton_search_member_ = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel_Avalable = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser_Return_Date = new com.toedter.calendar.JDateChooser();
        jSpinner_BookId = new javax.swing.JSpinner();
        jSpinner_MemberId = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(175, 65, 84));
        jLabel_FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Issue Book");
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

        jButton_Issue_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Issue_.setText("Issue");
        jButton_Issue_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Issue_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Cancel_.setText("Cancel");
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jButton_search_book_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_search_book_.setText("search book");
        jButton_search_book_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_search_book_MouseClicked(evt);
            }
        });
        jButton_search_book_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_book_ActionPerformed(evt);
            }
        });

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

        jButton_search_member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_search_member_.setText("search member");
        jButton_search_member_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_search_member_MouseClicked(evt);
            }
        });
        jButton_search_member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_member_ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Is This Book Avalable:");

        jLabel_Avalable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Avalable.setForeground(new java.awt.Color(0, 51, 204));
        jLabel_Avalable.setText("Yes-or-No");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Return Date:");

        jSpinner_BookId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jSpinner_MemberId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Note:");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jDateChooser_Issue_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSpinner_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_search_book_))
                                    .addComponent(jLabel_BookName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton_Issue_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(108, 108, 108)
                                    .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSpinner_MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton_search_member_)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_MemberFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Avalable, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton_search_book_)
                    .addComponent(jSpinner_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel_BookName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jButton_search_member_))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner_MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_MemberFullName)
                        .addGap(45, 45, 45)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel_Avalable))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser_Issue_Date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Issue_)
                    .addComponent(jButton_Cancel_))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_search_book_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_book_ActionPerformed
            // tim kiem sach by id
            // hiển thi tiêu đề sách
            // kiểm tra sách có sẵn hay không
            //lay id sachs
            int book_id = (int)jSpinner_BookId.getValue();
            
            
        try { 
            //lay sach boi id
            My_classes.Book selectedBook = book.getBookById(book_id);
            //hien thi tieu de sach
            if(selectedBook != null){//neu sach co san
            jLabel_BookName.setText(selectedBook.getName());
            //khi sach ton tai
            book_Exist = true;
            //hiển thị số lượng có sẵn
            if(issue.checkBookAvailability(book_id)){
                jLabel_Avalable.setText("YES");
                jLabel_Avalable.setForeground(Color.green);
            }else{
                jLabel_Avalable.setText("NO");
                jLabel_Avalable.setForeground(Color.red);
            }
            }else{//neeus sach khong co san thi thoat
                JOptionPane.showConfirmDialog(null, "Sách hiện không có sẵn", "Thông báo", 2);
                jLabel_BookName.setText("Book Name");
                book_Exist = false;
                jLabel_Avalable.setText("YES-or-NO");
                 jLabel_Avalable.setForeground(new Color(51, 102, 155));
            }
        } catch (SQLException ex) {
            Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
            
        }

    }//GEN-LAST:event_jButton_search_book_ActionPerformed

    private void jButton_search_book_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_search_book_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_search_book_MouseClicked

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_ActionPerformed
        // trả về
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel_ActionPerformed

    private void jButton_Issue_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Issue_ActionPerformed
        // phát hành một cuốn sách
        int book_id = (int) jSpinner_BookId.getValue();
        int member_id = (int) jSpinner_MemberId.getValue();
        String note = jTextArea_Note.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{        
        String issue_date = dateFormat.format(jDateChooser_Issue_Date.getDate());
        String return_date = dateFormat.format(jDateChooser_Return_Date.getDate());
        
        //trước khi cấp chúng ta cần kiểm tra
        //nếu trả về ngày ban hành
        Date issDate = dateFormat.parse(issue_date);
        Date rtnDate = dateFormat.parse(return_date); 
        if(!book_Exist){
             JOptionPane.showConfirmDialog(null, "bạn cần kiểm tra xem cuốn sách này có tồn tại trước hay không bằng cách nhấp vào nút tìm kiếm", "Thông báo", 2);
        }else if(!member_Exist){
            JOptionPane.showConfirmDialog(null, "bạn cần kiểm tra xem thành viên này có tồn tại trước hay không bằng cách nhấp vào nút tìm kiếm", "Thông báo", 2);
        }else if(!issue.checkBookAvailability(book_id)){
            JOptionPane.showConfirmDialog(null, "Cuốn sách này không có sẵn ngay bây giờ", "Thông báo", 2);
        }
        else if(rtnDate.before(issDate)){
             JOptionPane.showConfirmDialog(null, "Dữ liệu trả về phải sau ngày phát hành", "Thông báo", 2);
        }else{
             issue.AddIssue(book_id, member_id, "issued", issue_date, return_date, note);
        }
       
        }catch(HeadlessException | NullPointerException | ParseException ex){
            JOptionPane.showConfirmDialog(null, "Bạn cần nhập dữ liệu", "Thông báo", 2);
        }
    }//GEN-LAST:event_jButton_Issue_ActionPerformed

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        //đóng biểu mẫu
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jButton_search_member_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_search_member_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_search_member_MouseClicked

    private void jButton_search_member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_member_ActionPerformed
        // tim kiem thành viên bằng id và hiển thị tên của thành viên đó
          // tim kiem sach by id
            // hiển thi tiêu đề sách
            // kiểm tra sách có sẵn hay không
            //lay id thành viên
            int member_id = (int)jSpinner_MemberId.getValue();
            //lay sach boi id
            My_classes.Member selectedMember = member.getMemberById(member_id);
            //hien thi tieu de sach
            if(selectedMember != null){//neu sach co san
                jLabel_MemberFullName.setText(selectedMember.getFirstName() + " " + selectedMember.getLastName());
                //khi thanh vien ton tai
                member_Exist = true;
            }else{//neeus sach khong co san thi thoat
                JOptionPane.showConfirmDialog(null, "Thành viên hiện không tồn tại", "Thông báo", 2);
                jLabel_MemberFullName.setText("Member Full Name");
                member_Exist = false;
            }
    }//GEN-LAST:event_jButton_search_member_ActionPerformed

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

    public void setBorderToJlabel(JLabel label, Color color){
        Border border = BorderFactory.createMatteBorder(0, 0,1, 0, color);
        label.setBorder(border);
    }

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
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new IssueBookForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel_;
    private javax.swing.JButton jButton_Issue_;
    private javax.swing.JButton jButton_search_book_;
    private javax.swing.JButton jButton_search_member_;
    private com.toedter.calendar.JDateChooser jDateChooser_Issue_Date;
    private com.toedter.calendar.JDateChooser jDateChooser_Return_Date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Avalable;
    private javax.swing.JLabel jLabel_BookName;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_MemberFullName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_BookId;
    private javax.swing.JSpinner jSpinner_MemberId;
    private javax.swing.JTextArea jTextArea_Note;
    // End of variables declaration//GEN-END:variables
}
