/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_classes;

import java.sql.Statement;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author admin
 */
public class Func_Class {
       // Tạo hàm hiển thị hình ảnh trong jLabel
       
       public void displayImage(int width, int height, byte[] imagebyte, String imagePath, JLabel label) {
    ImageIcon imgIco;
    if (imagebyte != null) {
        imgIco = new ImageIcon(imagebyte);
    } else {
        try {
            // đọc hình ảnh từ tài nguyên dự án
            InputStream input = getClass().getResourceAsStream(imagePath);
            BufferedImage image = ImageIO.read(input);
            imgIco = new ImageIcon(image);
        } catch (Exception e) {
            // lấy hình ảnh từ máy tính
            imgIco = new ImageIcon(imagePath);
        }
    }
    Image image = imgIco.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
    label.setIcon(new ImageIcon(image));
}

        //tạo hàm tùy chỉnh màu trong bảng
        public void customTable(JTable table){
            table.setSelectionBackground(new Color(249, 105, 14));
            table.setSelectionForeground(Color.white);
            table.setRowHeight(35);        
            table.setShowGrid(false);
            table.setBackground(new Color(248,248,248));
            table.setShowHorizontalLines(true);
            table.setGridColor(Color.gray);            
        }
        
        //tạo hàm tùy chỉnh hàng tiêu đề trong bảng
        public void customTableHeader(JTable table, Color back_color, Integer fontSize){
            table.getTableHeader().setBackground(back_color); //
            table.getTableHeader().setForeground(Color.white); //
            table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontSize));
            table.getTableHeader().setOpaque(false);
            
        }
        // tạo một chú thích để chọn hình ảnh
        //chú thích sẽ trả về trong image path
        public String selectImage(){
            // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile picture");
        fileChooser.setCurrentDirectory(new File("E:\\project_oop\\EMS\\src\\My_images"));
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image",".png", ".jpg");
        fileChooser.addChoosableFileFilter(extensionFilter);
        int fileState = fileChooser.showSaveDialog(null);
        String path = "";
        if(fileState == JFileChooser.APPROVE_OPTION){
            path = fileChooser.getSelectedFile().getAbsolutePath();          
            
        }
        return path;
        }
        
        // tạo hàm để trả về một kết quả
        //dùng chức năng này để giảm code khi điền danh sách mảng
    public ResultSet getData(String query){
        PreparedStatement ps;
        ResultSet rs = null;
    try{
        ps = (PreparedStatement) DB.getConnection().prepareStatement(query);
        rs = ps.executeQuery();
        
    }catch (SQLException ex) {
        Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
}

    //tạo ra một hàm đếm các dữ liệu
    public int countData(String tableName){
        int total = 0;
        ResultSet rs;
        Statement st;
        try{
        st = DB.getConnection().createStatement();
        rs = st.executeQuery("SELECT COUNT(*) AS total FROM " + tableName);
        if(rs.next()){
            total = rs.getInt("total");
            
        }
        }catch(SQLException ex){
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
        
        
    }
    
}

