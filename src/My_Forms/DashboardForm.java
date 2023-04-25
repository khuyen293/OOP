
package My_Forms;

import My_classes.Book;
import My_classes.Func_Class;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class DashboardForm extends javax.swing.JFrame {

    //the button border
     Border buttonBorder1 = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
     Border buttonBorder0 = BorderFactory.createMatteBorder(1,1,1,1,new Color(36,37,42));
     
     My_classes.Func_Class func = new Func_Class();
     My_classes.Book book = new Book();
     
     //tạo nên một mảng jlabel để hiển thị 5 hình ảnh sách
     JLabel[] labels_tab = new JLabel[5];
     
    public DashboardForm() {
        initComponents();
        this.setLocationRelativeTo(null);
         //display image in the dashboard left slide
        func.displayImage(jLabel_Dashboard_Logo.getWidth(), jLabel_Dashboard_Logo.getHeight(),null, "/My_Images/book_dashboad.png", jLabel_Dashboard_Logo);
        
        //add a border to the panel Header
        Border panelHeaderBorder = BorderFactory.createMatteBorder(0,0,1,0,Color.white);
        jPanel_Header.setBorder(panelHeaderBorder);
        //add more borders 
        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(235,125,22));
        jPanel_4_header.setBorder(panelHeader_1_Border);
        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(251,183,129));
        jPanel_2_header.setBorder(panelHeader_2_Border);
        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(200,242,175));
        jPanel_3_header.setBorder(panelHeader_3_Border);
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(68,94,169));
        jPanel_4_header.setBorder(panelHeader_4_Border);
            //add border to the buttons
        addBorders();
        //the hover effect
        buttonsHoverEffect();
        
        // đếm dữ liệu 
        displayCount();
        
        //hiển thị bìa 5 cuốn sách mới nhất ở phía dưới
        
        // thêm vào jlabel 
        labels_tab[0] = jLabel_Image_1;
        labels_tab[1] = jLabel_Image_2;
        labels_tab[2] = jLabel_Image_3;
        labels_tab[3] = jLabel_Image_4;
        labels_tab[4] = jLabel_Image_5;
        //hiển thị ảnh
        book.displayBooksCover(labels_tab); 
    }

    //create a unction to add border to all the button in the jpanel menu
    public void addBorders(){
         //get all the component in the jpanel menu
        Component[] comps = jPanel_Menu.getComponents();
        for(Component comp : comps){
            //check if the component is a button
            if(comp instanceof JButton){
                JButton button = (JButton) comp;
                //add border
                button.setBorder(buttonBorder0);
                    }            
        }
    }
    
    //create a unction to add a hover effect on the menu buttouns
    public void buttonsHoverEffect(){
        //get all the component in the jpanel menu
        Component[] comps = jPanel_Menu.getComponents();
        for(Component comp : comps){
            //check if the component is a button
            if(comp instanceof JButton){
                JButton button = (JButton) comp;
                // add the action we want to the button
                button.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseEntered(MouseEvent evt){
                        button.setBorder(buttonBorder1);
                    }
                    
                    @Override
                    public void mouseExited(MouseEvent evt){
                        button.setBorder(buttonBorder0);
                    }
                });
                
            }
        }
    }
    
    public void displayCount(){        
             jLabel_BooksCount.setText(String.valueOf(book.countData()));  
             jLabel_AuthorsCount.setText(String.valueOf(func.countData("authors")));  
             jLabel_MembersCount.setText(String.valueOf(func.countData("members")));  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Dashboard_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_Members_List_ = new javax.swing.JButton();
        jButton_AddMember_ = new javax.swing.JButton();
        jButton_EditMember_ = new javax.swing.JButton();
        jButton_DeleteMember_ = new javax.swing.JButton();
        jLabel_Genres_ = new javax.swing.JLabel();
        jButton_Manage_Genres_ = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton_Manage_Authors_ = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton_AddBook_ = new javax.swing.JButton();
        jButton_EditBook_ = new javax.swing.JButton();
        jButton_DeleteBook_ = new javax.swing.JButton();
        jButton_Book_List_ = new javax.swing.JButton();
        jLabel_Circulation_ = new javax.swing.JLabel();
        jButton_Issue_ = new javax.swing.JButton();
        jButton_ReturnBook_ = new javax.swing.JButton();
        jButton_ManageUsers_ = new javax.swing.JButton();
        jButton_Logout_ = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        jPanel_4_header = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Image_1 = new javax.swing.JLabel();
        jLabel_Image_2 = new javax.swing.JLabel();
        jLabel_Image_5 = new javax.swing.JLabel();
        jLabel_Image_3 = new javax.swing.JLabel();
        jLabel_Image_4 = new javax.swing.JLabel();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_MembersCount = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_AuthorsCount = new javax.swing.JLabel();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_header1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_BooksCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Menu.setBackground(new java.awt.Color(108, 122, 137));

        jPanel_Header.setBackground(new java.awt.Color(149, 165, 166));

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Members");

        jButton_Members_List_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Members_List_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Members_List_.setText("Members List");
        jButton_Members_List_.setContentAreaFilled(false);
        jButton_Members_List_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Members_List_ActionPerformed(evt);
            }
        });

        jButton_AddMember_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_AddMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddMember_.setText("Add Member");
        jButton_AddMember_.setContentAreaFilled(false);
        jButton_AddMember_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddMember_ActionPerformed(evt);
            }
        });

        jButton_EditMember_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_EditMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EditMember_.setText("Edit Member");
        jButton_EditMember_.setContentAreaFilled(false);
        jButton_EditMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditMember_ActionPerformed(evt);
            }
        });

        jButton_DeleteMember_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_DeleteMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteMember_.setText("Delete Member");
        jButton_DeleteMember_.setContentAreaFilled(false);
        jButton_DeleteMember_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteMember_ActionPerformed(evt);
            }
        });

        jLabel_Genres_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Genres_.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel_Genres_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Genres_.setText("Genres");

        jButton_Manage_Genres_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Manage_Genres_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Genres_.setText("Manage Genres");
        jButton_Manage_Genres_.setContentAreaFilled(false);
        jButton_Manage_Genres_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_Genres_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Genres_ActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Authors");

        jButton_Manage_Authors_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Manage_Authors_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Authors_.setText("Manage Authors");
        jButton_Manage_Authors_.setContentAreaFilled(false);
        jButton_Manage_Authors_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_Authors_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Authors_ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Books");

        jButton_AddBook_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_AddBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddBook_.setText("Add Book");
        jButton_AddBook_.setContentAreaFilled(false);
        jButton_AddBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddBook_ActionPerformed(evt);
            }
        });

        jButton_EditBook_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_EditBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EditBook_.setText("Edit Book");
        jButton_EditBook_.setContentAreaFilled(false);
        jButton_EditBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditBook_ActionPerformed(evt);
            }
        });

        jButton_DeleteBook_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_DeleteBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteBook_.setText("Delete Book");
        jButton_DeleteBook_.setContentAreaFilled(false);
        jButton_DeleteBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteBook_ActionPerformed(evt);
            }
        });

        jButton_Book_List_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Book_List_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Book_List_.setText("Book List");
        jButton_Book_List_.setContentAreaFilled(false);
        jButton_Book_List_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Book_List_ActionPerformed(evt);
            }
        });

        jLabel_Circulation_.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Circulation_.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel_Circulation_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Circulation_.setText("Circulation");

        jButton_Issue_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Issue_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Issue_.setText("Issue Book");
        jButton_Issue_.setContentAreaFilled(false);
        jButton_Issue_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Issue_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Issue_ActionPerformed(evt);
            }
        });

        jButton_ReturnBook_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_ReturnBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ReturnBook_.setText("return Book");
        jButton_ReturnBook_.setContentAreaFilled(false);
        jButton_ReturnBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ReturnBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnBook_ActionPerformed(evt);
            }
        });

        jButton_ManageUsers_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_ManageUsers_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ManageUsers_.setText("Manage Users");
        jButton_ManageUsers_.setContentAreaFilled(false);
        jButton_ManageUsers_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ManageUsers_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageUsers_ActionPerformed(evt);
            }
        });

        jButton_Logout_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Logout_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Logout_.setText("Logout");
        jButton_Logout_.setContentAreaFilled(false);
        jButton_Logout_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Logout_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Logout_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Circulation_, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_DeleteBook_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_EditBook_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_AddBook_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Book_List_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Manage_Authors_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Manage_Genres_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Genres_, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_DeleteMember_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_EditMember_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_AddMember_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Members_List_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Logout_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jButton_ManageUsers_)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Issue_)
                .addGap(18, 18, 18)
                .addComponent(jButton_ReturnBook_)
                .addGap(25, 25, 25))
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Genres_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton_Manage_Genres_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Manage_Authors_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton_AddMember_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_EditMember_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_DeleteMember_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Members_List_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_AddBook_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_EditBook_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_DeleteBook_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Book_List_)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Circulation_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ReturnBook_)
                    .addComponent(jButton_Issue_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ManageUsers_)
                    .addComponent(jButton_Logout_))
                .addContainerGap())
        );

        jPanel_4.setBackground(new java.awt.Color(44, 130, 201));

        jPanel_4_header.setBackground(new java.awt.Color(68, 94, 169));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Latest Books Added");

        javax.swing.GroupLayout jPanel_4_headerLayout = new javax.swing.GroupLayout(jPanel_4_header);
        jPanel_4_header.setLayout(jPanel_4_headerLayout);
        jPanel_4_headerLayout.setHorizontalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_4_headerLayout.setVerticalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel_Image_1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image_1.setOpaque(true);

        jLabel_Image_2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image_2.setOpaque(true);

        jLabel_Image_5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image_5.setOpaque(true);

        jLabel_Image_3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image_3.setOpaque(true);

        jLabel_Image_4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image_4.setOpaque(true);

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_4_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel_4Layout.setVerticalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addComponent(jPanel_4_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel_2.setBackground(new java.awt.Color(251, 192, 147));

        jPanel_2_header.setBackground(new java.awt.Color(251, 183, 129));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Members");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel_MembersCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_MembersCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MembersCount.setText("11389");

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_2Layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addGap(85, 85, 85)))
        );

        jPanel_3.setBackground(new java.awt.Color(200, 247, 197));

        jPanel_3_header.setBackground(new java.awt.Color(200, 242, 175));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Authors");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel_AuthorsCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_AuthorsCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AuthorsCount.setText("18");

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
            .addGroup(jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_3Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(85, Short.MAX_VALUE)))
        );

        jPanel_1.setBackground(new java.awt.Color(41, 241, 195));

        jPanel_1_header1.setBackground(new java.awt.Color(41, 235, 172));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Books");

        javax.swing.GroupLayout jPanel_1_header1Layout = new javax.swing.GroupLayout(jPanel_1_header1);
        jPanel_1_header1.setLayout(jPanel_1_header1Layout);
        jPanel_1_header1Layout.setHorizontalGroup(
            jPanel_1_header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_1_header1Layout.setVerticalGroup(
            jPanel_1_header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel_BooksCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_BooksCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BooksCount.setText("00532");

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(79, 79, 79))
        );

        jLabel2.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Welcome To Library");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 730, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Manage_Genres_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_Genres_ActionPerformed
        // hiển thị form ManageGenres
        ManageGenresForm mngGenresF = new ManageGenresForm();
        mngGenresF.setVisible(true);
    }//GEN-LAST:event_jButton_Manage_Genres_ActionPerformed

    private void jButton_Manage_Authors_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_Authors_ActionPerformed
        ManageAuthorsForm mngAuthorsF = new ManageAuthorsForm();
        mngAuthorsF.setVisible(true);
    }//GEN-LAST:event_jButton_Manage_Authors_ActionPerformed

    private void jButton_AddMember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddMember_ActionPerformed
        AddMemberForm aMemberF = new AddMemberForm();
        aMemberF.setVisible(true);
    }//GEN-LAST:event_jButton_AddMember_ActionPerformed

    private void jButton_EditMember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditMember_ActionPerformed
        EditMemberForm eMemberF = new EditMemberForm();
        eMemberF.setVisible(true);
    }//GEN-LAST:event_jButton_EditMember_ActionPerformed

    private void jButton_DeleteMember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteMember_ActionPerformed
        DeleteMemberForm dMemberF = new DeleteMemberForm();
        dMemberF.setVisible(true);
    }//GEN-LAST:event_jButton_DeleteMember_ActionPerformed

    private void jButton_Members_List_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Members_List_ActionPerformed
         MembersListForm mLF = new MembersListForm();
         mLF.setVisible(true);
    }//GEN-LAST:event_jButton_Members_List_ActionPerformed

    private void jButton_AddBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddBook_ActionPerformed
         AddBookForm aBookF = new AddBookForm();
         aBookF.setVisible(true);
    }//GEN-LAST:event_jButton_AddBook_ActionPerformed

    private void jButton_EditBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditBook_ActionPerformed
         EditBookForm eBookF = new EditBookForm();
         eBookF.setVisible(true);
    }//GEN-LAST:event_jButton_EditBook_ActionPerformed

    private void jButton_DeleteBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteBook_ActionPerformed
         DeleteBookForm dBookF = new DeleteBookForm();
         dBookF.setVisible(true);
    }//GEN-LAST:event_jButton_DeleteBook_ActionPerformed

    private void jButton_Book_List_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Book_List_ActionPerformed
         BookListForm bLF = new BookListForm();
         bLF.setVisible(true);
    }//GEN-LAST:event_jButton_Book_List_ActionPerformed

    private void jButton_Issue_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Issue_ActionPerformed
         IssueBookForm issBookForm = new IssueBookForm();
         issBookForm.setVisible(true);
    }//GEN-LAST:event_jButton_Issue_ActionPerformed

    private void jButton_ReturnBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnBook_ActionPerformed
         ReturnBookForm rtnBookForm = new ReturnBookForm();
         rtnBookForm.setVisible(true);
    }//GEN-LAST:event_jButton_ReturnBook_ActionPerformed

    private void jButton_ManageUsers_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageUsers_ActionPerformed
        ManageUsersForm manageusersForm = new ManageUsersForm();
         manageusersForm.setVisible(true);
    }//GEN-LAST:event_jButton_ManageUsers_ActionPerformed

    private void jButton_Logout_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Logout_ActionPerformed
        LoginForm login = new LoginForm();
        login.setVisible(true);
    }//GEN-LAST:event_jButton_Logout_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddBook_;
    private javax.swing.JButton jButton_AddMember_;
    private javax.swing.JButton jButton_Book_List_;
    private javax.swing.JButton jButton_DeleteBook_;
    private javax.swing.JButton jButton_DeleteMember_;
    private javax.swing.JButton jButton_EditBook_;
    private javax.swing.JButton jButton_EditMember_;
    private javax.swing.JButton jButton_Issue_;
    public javax.swing.JButton jButton_Logout_;
    private javax.swing.JButton jButton_ManageUsers_;
    private javax.swing.JButton jButton_Manage_Authors_;
    private javax.swing.JButton jButton_Manage_Genres_;
    private javax.swing.JButton jButton_Members_List_;
    private javax.swing.JButton jButton_ReturnBook_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AuthorsCount;
    private javax.swing.JLabel jLabel_BooksCount;
    public javax.swing.JLabel jLabel_Circulation_;
    private javax.swing.JLabel jLabel_Dashboard_Logo;
    private javax.swing.JLabel jLabel_Genres_;
    private javax.swing.JLabel jLabel_Image_1;
    private javax.swing.JLabel jLabel_Image_2;
    private javax.swing.JLabel jLabel_Image_3;
    private javax.swing.JLabel jLabel_Image_4;
    private javax.swing.JLabel jLabel_Image_5;
    private javax.swing.JLabel jLabel_MembersCount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_header1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_4_header;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
