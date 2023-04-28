
package My_Forms;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class AddBookForm extends javax.swing.JFrame {

    My_classes.Member member = new My_classes.Member();
    My_classes.Func_Class func = new My_classes.Func_Class();
    My_classes.Genre genre = new My_classes.Genre();
    My_classes.Book book = new My_classes.Book();  
    HashMap<String, Integer> genresMap = genre.getGenresMap();
    String imagePath = "";
    public AddBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        //add a gray border to the panel 
         Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(230, 126, 34));
        jPanel1.setBorder(panelHeaderBorder);
        //display image in the top
        My_classes.Func_Class func = new My_classes.Func_Class();
        func.displayImage(70,50, null, "/My_images/books-2022464_640.png", jLabel_FormTitle);
        
        //điền vào jcombobox với các thể loại
        fillJcomboboxWithGenres();
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
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_ISBN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_Author = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Decription = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton_Select_Picture_ = new javax.swing.JButton();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Cancel_ = new javax.swing.JButton();
        jComboBox_Genre_ = new javax.swing.JComboBox<>();
        jSpinner_Quantity = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Publsher = new javax.swing.JTextField();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jButton_select_author_ = new javax.swing.JButton();
        jDateChooser_Date = new com.toedter.calendar.JDateChooser();
        jLabel_Author_ID = new javax.swing.JLabel();
        jLabel_Genre_ID = new javax.swing.JLabel();
        jButton_Clear_ = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(242, 121, 53));
        jLabel_FormTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Add a New Book");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setBackground(new java.awt.Color(242, 121, 53));
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
        jLabel1.setText("ISBN:");

        jTextField_ISBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name:");

        jTextField_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_Author.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Author.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Author:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Quantity:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Price:");

        jTextField_Price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Date Received:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Genre:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Book Decription:");

        jTextArea_Decription.setColumns(20);
        jTextArea_Decription.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Decription);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Book Cover:");

        jButton_Select_Picture_.setBackground(new java.awt.Color(0, 153, 102));
        jButton_Select_Picture_.setText("Select Picture");
        jButton_Select_Picture_.setOpaque(true);
        jButton_Select_Picture_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_Picture_ActionPerformed(evt);
            }
        });

        jButton_Add_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Add_.setText("Add Book");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Cancel_.setText("Cancel");
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jComboBox_Genre_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_Genre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Genre_ActionPerformed(evt);
            }
        });

        jSpinner_Quantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Publsher:");

        jTextField_Publsher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_Image.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image.setOpaque(true);

        jLabel_ImagePath.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_ImagePath.setForeground(new java.awt.Color(0, 51, 204));
        jLabel_ImagePath.setText("picture path...");

        jButton_select_author_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_select_author_.setText("select author");
        jButton_select_author_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_select_author_MouseClicked(evt);
            }
        });
        jButton_select_author_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_select_author_ActionPerformed(evt);
            }
        });

        jLabel_Author_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Author_ID.setText("ID");

        jLabel_Genre_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Genre_ID.setText("ID");

        jButton_Clear_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Clear_.setText("Clear");
        jButton_Clear_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Clear_ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("ID:");

        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ID.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Clear_)
                        .addGap(41, 41, 41)
                        .addComponent(jButton_Add_)
                        .addGap(41, 41, 41)
                        .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(53, 53, 53))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Publsher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox_Genre_, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_Genre_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_Author_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_select_author_))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jDateChooser_Date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(jTextField_Price, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Select_Picture_)
                                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton_select_author_)
                                    .addComponent(jLabel_Author_ID))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jComboBox_Genre_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Genre_ID))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextField_Publsher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel_ImagePath)
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Select_Picture_)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_)
                    .addComponent(jButton_Cancel_)
                    .addComponent(jButton_Clear_))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, Short.MAX_VALUE)
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
//        //cách ẩn thông báo empty
//        jLabel_EmptyFirstName_.setVisible(false);
//        jLabel_EmptyLastName_.setVisible(false);
//        jLabel_EmptyPhone_.setVisible(false);
        String isbn = jTextField_ISBN.getText();
        if(!verif()){
             JOptionPane.showMessageDialog(null, "Không hợp lệ","Thông báo", 2);
            
        }else if(book.isISBNexists(isbn)){
            JOptionPane.showMessageDialog(null, "ISBN đã tồn tại","Thông báo", 2);
        }
        else{
            try {
            //thêm mới một dữ liệu
            
            String name = jTextField_Name.getText();       
            String publisher = jTextField_Publsher.getText();
            String description = jTextArea_Decription.getText();
        
            Integer id = Integer.parseInt(jTextField_ID.getText());
            Integer author_id = Integer.parseInt(jLabel_Author_ID.getText());
            Integer genre_id = Integer.parseInt(jLabel_Genre_ID.getText());
            Integer quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());      
        
            Double price = Double.parseDouble(jTextField_Price.getText());
        
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String received_date = dateFormat.format(jDateChooser_Date.getDate());
            Path path = Paths.get(imagePath);
            byte[] img = Files.readAllBytes(path); 
            if(member.checkMemberIdExists(id)){
                    JOptionPane.showMessageDialog(null,"ID đã tồn tại", "Thông báo", 0);
                    Random();
                }
                else{
            book.addBook(id, isbn, name, author_id, genre_id, quantity, publisher, price, received_date, description, img);
            Random();
            }
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Bạn cần thêm ảnh!","Thông báo", 1);
        } catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(null, "Bạn nhập sai dữ liệu!","Thông báo", 1);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Bạn cần thêm dữ liệu!","Thông báo", 1);
        }
            
        }
        
        // thêm một cột id 
      
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_ActionPerformed
        // trả về
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel_ActionPerformed

    private void jButton_Select_Picture_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_Picture_ActionPerformed
        String path = func.selectImage();
        jLabel_ImagePath.setText(path);
        func.displayImage(125, 70, null, path, jLabel_Image);
        imagePath = path;
    }//GEN-LAST:event_jButton_Select_Picture_ActionPerformed

    private void jButton_select_author_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_select_author_ActionPerformed
        // hiển thị 1 form
        AuthorsListForm aLF = new AuthorsListForm();
        aLF.setVisible(true);      
            
    }//GEN-LAST:event_jButton_select_author_ActionPerformed
    
    //hien thi ra du liệu của tác giả
    public static void displayAuthorData(int id, String fullName){
        jTextField_Author.setText(fullName);   
        jLabel_Author_ID.setText(String.valueOf(id));
       // jLabel_Genres_ID.setText(String.valueOf(id));
        
        
    }
    
    //tạo một chức năng để xác minh các trường bắt buộc
    public boolean verif(){
        if(jTextField_ISBN.getText().equals("") || jTextField_Author.getText().equals("") || jTextField_Price.getText().equals("") ||
                jTextField_Name.getText().equals("") || jLabel_Genre_ID.getText().equals("ID")){
            return false;
            
        }else{
            return true;
            
        }
    }

    
    //tạo một chú thích để điền jButton với tên thể loại và id bằng cách sử dụng hashmap
    public void fillJcomboboxWithGenres(){
        for(String genreName : genresMap.keySet()){
            jComboBox_Genre_.addItem(genreName);
        }
        
    }
    private void jButton_select_author_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_select_author_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_select_author_MouseClicked

    private void jComboBox_Genre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Genre_ActionPerformed
        // hiển thị id đã chọn
        // nếu jcombobox trống, lỗi sẽ được đưa ra
        //vì vậy để tránh điều đó, chúng tôi sẽ thêm một ngoại lệ
        try{
        int genreId = genresMap.get(jComboBox_Genre_.getSelectedItem().toString());
        jLabel_Genre_ID.setText(String.valueOf(genreId));
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Lỗi","", 2);
        }
        
    }//GEN-LAST:event_jComboBox_Genre_ActionPerformed

    private void jButton_Clear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Clear_ActionPerformed
        // xóa đi một fields 
        Random();
        jTextField_ISBN.setText("");
        jTextField_Name.setText("");
        jTextField_Author.setText("");
        jLabel_Author_ID.setText("ID");
        jComboBox_Genre_.setSelectedItem(0);
        jTextField_Price.setText("");
        jTextField_Publsher.setText("");
        jTextArea_Decription.setText("");
        jSpinner_Quantity.setValue(0);
        jDateChooser_Date.setDate(new java.util.Date());
        jLabel_Image.setIcon(null);
        jLabel_ImagePath.setText("picture path...");
    }//GEN-LAST:event_jButton_Clear_ActionPerformed

    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Cancel_;
    private javax.swing.JButton jButton_Clear_;
    private javax.swing.JButton jButton_Select_Picture_;
    private javax.swing.JButton jButton_select_author_;
    private javax.swing.JComboBox<String> jComboBox_Genre_;
    private com.toedter.calendar.JDateChooser jDateChooser_Date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_Author_ID;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Genre_ID;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Quantity;
    private javax.swing.JTextArea jTextArea_Decription;
    private static javax.swing.JTextField jTextField_Author;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ISBN;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Publsher;
    // End of variables declaration//GEN-END:variables
}
