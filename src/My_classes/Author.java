package My_classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String field_Of_Expertise;
    private String about;
    
    public Author(){
        
    }
    
    public Author(int id, String firstName, String lastName, String field_Of_Expertise, String about) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.field_Of_Expertise = field_Of_Expertise;
	this.about = about;		
	}

    public Author(int _id, String firstName, String lastName) {
        this.id = _id;
	this.firstName = firstName;
	this.lastName = lastName;
    }
    public int getId() {
	return id;
	}
    public void setId(int id) {
	this.id = id;
	}
    public String getFirstName() {
	return firstName;
	}
    public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
    public String getLastName() {
	return lastName;
	}
    public void setLastName(String lastName) {
	this.lastName = lastName;
	}
    public String getField_Of_Expertise() {
	return field_Of_Expertise;
	}
    public void setField_Of_Expertise(String field_Of_Expertise) {
	this.field_Of_Expertise = field_Of_Expertise;
	}
    public String getAbout() {
	return about;
	}
    public void setAbout(String about) {
	this.about = about;
	}
    
    My_classes.Func_Class func = new My_classes.Func_Class();
    // thêm một tác giả mới
    public void addAuthor(int id, String firstName, String lastName, String field_Of_Expertise, String about){
        String insertQuery = "INSERT INTO authors (id, firstName, lastName, expertise, about) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, id);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setString(4, field_Of_Expertise);
            ps.setString(5,about);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã thêm tác giả mới","", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Tác giả chưa được thêm","", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     //sửa tác giả bằng id
    public void editAuthor(int id, String firstName, String lastName, String field_Of_Expertise, String about){
        String editQuery = "UPDATE authors SET firstName=?, lastName=?, expertise=?, about=? WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, field_Of_Expertise);
            ps.setString(4,about);
            ps.setInt(5, id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã sửa thông tin tác giả", "", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Thông tin tác giả chưa được sửa", "", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //xóa 
    public void removeAuthor(int id){
        String removeQuery = "DELETE FROM authors WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã xóa thông tin tác giả", "", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Thông tin tác giả chưa được xóa", "", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // tạo hàm cho danh sách các thể loại vào một mảng
  public ArrayList<Author> authorsList(String query) {
    ArrayList<Author> aList = new ArrayList<>();
    My_classes.Func_Class func = new My_classes.Func_Class();
    try {
         if(query.equals("")){
            query = "SELECT * FROM authors";
        }
        ResultSet rs = func.getData(query);
        Author author;
        if (rs != null) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String expertise = rs.getString("expertise");
                String about = rs.getString("about");
                author = new Author(id, firstName, lastName, expertise, about);
                aList.add(author);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
    }
    return aList;
}

   
  public Author getAuthorById(Integer id) {
         Func_Class func = new Func_Class();
        ResultSet rs = func.getData("SELECT * FROM authors WHERE id = '" + id + "'");
        Author author = null;
        try{
        if(rs.next()) { 
                author = new Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"));
        }
        }catch(SQLException ex){
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);    
        }
   
        return author;
   }
  
}
