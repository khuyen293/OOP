
package My_classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String userType;
    
    public Users(){
        
    }
    
    public Users(int id, String firstName, String lastName, String username, String password, String userType) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.username = username;
	this.password = password;
        this.userType = userType;
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
    public String getUserName() {
	return username;
	}
    public void setUserName(String username) {
	this.username = username;
	}
    public String getPassword() {
	return password;
	}
    public void setPassword(String password) {
	this.password = password;
	}
     public String getUserType() {
	return userType;
	}
    public void setUserType(String userType) {
	this.userType = userType;
	}
    My_classes.Func_Class func = new My_classes.Func_Class();
    
public void addUser(int id, String firstName, String lastName, String username, String password, String userType){

    String insertQuery = "INSERT INTO users_table (id, firstName, lastName, username, password, user_type) VALUES (?,?,?,?,?,?)";
    try {
        PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
        ps.setInt(1, id);
        ps.setString(2, firstName);
        ps.setString(3, lastName);
        ps.setString(4, username);
        ps.setString(5, password);   
        ps.setString(6, userType);
        
        if (ps.executeUpdate() != 0) {
            JOptionPane.showMessageDialog(null, "Đã thêm một tài khoản mới", "Thông báo", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Tài khoản hưa được thêm", "Thông báo", 2);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
    }
}
  
    public void editUser(int id, String firstName, String lastName, String username, String password, String userType){
        
        String editQuery = "UPDATE users_table SET firstName=?, lastName=?, username=?, password=?, user_type=? WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, username);
            ps.setString(4, password);   
            ps.setString(5, userType);
            ps.setInt(6, id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã sửa taì khoản", "Thông báo", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Tài khoản chưa được sửa", "Thông báo", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        //xóa 
    public void removeUser(int id){
        String removeQuery = "DELETE FROM users_table WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã xóa tài khoản", "Thông báo", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Tài khoản chưa được xóa", "Thông báo", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      // tạo một hàm kiểm tra nếu người dùng đã tồm tại
public boolean checkUsernameExists(String username) {
    boolean exists = false;
    try {
        ResultSet rs = func.getData("select * from users_table where username = '"+ username + "'");
        if(rs.next()) { 
            exists = true;
        }
    } catch(SQLException ex) {
        Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        // Xử lý lỗi ở đây
    }
    return exists;
}

	
    
        // tạo hàm cho danh sách các tk nguoi dung vào một mảng
  public ArrayList<Users> usersList() {
    ArrayList<Users> uList = new ArrayList<>();
    My_classes.Func_Class func = new My_classes.Func_Class();
    try {
        ResultSet rs = func.getData("SELECT * FROM users_table where user_type <> 'owner'");
        Users user;
        if (rs != null) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String userType = rs.getString("user_type");
                user = new Users(id, firstName, lastName, username, password, userType);
                uList.add(user);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
    }
    return uList;
}
  
  //tạo chú thích cho phép người dùng đăng nhập
  public Users login(String username, String password){
     
        ResultSet rs = func.getData("SELECT * FROM users_table WHERE username = '"+ username +"' and password = '" + password + "'");
        Users user = null;
        try{
        if(rs.next()) { 
                user = new Users(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("username"), rs.getString("password"), rs.getString("user_type"));
        }
        }catch(SQLException ex){
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);    
        }
      return user;
  }


}
