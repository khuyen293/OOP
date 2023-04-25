
package My_Forms;


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class MemberInfoCardForm extends javax.swing.JFrame {

    /**
     * Creates new form MemberForm
     */
    My_classes.Book book = new My_classes.Book();
    My_classes.Func_Class func = new My_classes.Func_Class();
    My_classes.Author author = new My_classes.Author();
    My_classes.Genre genre = new My_classes.Genre();
    My_classes.Member member = new My_classes.Member();
    //public int book_id;
    public MemberInfoCardForm(int member_id) {
        initComponents();
        this.setLocationRelativeTo(null);
        //add a gray border to the panel 
         Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(37,168,118));
        jPanel1.setBorder(panelHeaderBorder);
        //display image in the top
        My_classes.Func_Class func = new My_classes.Func_Class();
        func.displayImage(70,50,null, "/My_images/members-42918_640.png", jLabel_FormTitle);
        //func.displayImage(80,65,null, "/My_images/blank-profile.png", jLabel_Image);
        displayMemberInfo(member_id);

    }

    // tạo nên 1 hàm hiển thị ra thẻ sách
    public void displayMemberInfo(int member_id){
        
        try {
             My_classes.Member SelectedMember = member.getMemberById(member_id);
            if(SelectedMember !=null){
                jLabel_ID.setText(String.valueOf(SelectedMember.getId()));
                jLabel_Full_Name.setText(SelectedMember.getFirstName() + " " + SelectedMember.getLastName());
                jLabel_Email.setText(SelectedMember.getEmail());
                jLabel_Phone.setText(SelectedMember.getPhone());
                jLabel_Gender.setText(SelectedMember.getGender());
                }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel_Full_Name = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jLabel_Gender1 = new javax.swing.JLabel();
        jLabel_ID1 = new javax.swing.JLabel();
        jLabel_Full_Name1 = new javax.swing.JLabel();
        jLabel_Phone1 = new javax.swing.JLabel();
        jLabel_Email1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(37, 168, 118));
        jLabel_FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Member Info Card");
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

        jLabel_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_ID.setText(" ");

        jLabel_Full_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Full_Name.setText(" ");

        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Phone.setText(" ");

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Email.setText(" ");

        jLabel_Gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Gender.setText(" ");

        jLabel_Gender1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Gender1.setText("Gender");

        jLabel_ID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_ID1.setText("ID");

        jLabel_Full_Name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Full_Name1.setText("Full_Name");

        jLabel_Phone1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Phone1.setText("Phone");

        jLabel_Email1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Email1.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel_Full_Name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_ID1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_Phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel_Email1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Gender1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Full_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(jLabel_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel_Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_ID)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Full_Name)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Phone)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Email))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_ID1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Full_Name1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Phone1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Email1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Gender1)
                            .addComponent(jLabel_Gender))))
                .addGap(28, 28, 28))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Email1;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Full_Name;
    private javax.swing.JLabel jLabel_Full_Name1;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Gender1;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_ID1;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JLabel jLabel_Phone1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
