
package My_classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Member {
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String gender;
        
        public Member(){
            
        }
	public Member(int id, String firstName, String lastName, String phone, String email, String gender){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
        My_classes.Func_Class func = new My_classes.Func_Class();
        
        public Member getMember(int id) {
        // Check if the user already exists
        Member member = null;
    String selectQuery = "SELECT * FROM members WHERE id=?";
    try {
        PreparedStatement ps = DB.getConnection().prepareStatement(selectQuery);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
           return new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
    }
    return member;
}

	public void addMember(int id, String firstName, String lastName, String phone, String email, String gender){
                if (getMember(id) != null) {
                JOptionPane.showMessageDialog(null, "ID thành viên đã tồn tại", "", 2);
                 return;
                }
        String insertQuery = "INSERT INTO members (id, firstName, lastName, phone, email, gender) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, id);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setString(4, phone);
            ps.setString(5, email);
            ps.setString(6, gender);
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã thêm thành viên mới","", 1);                 
            }else{
                JOptionPane.showMessageDialog(null, "Thành viên chưa được thêm","", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
     //sửa tác giả bằng id
    public void editMember(int id, String firstName, String lastName, String phone, String email, String gender){
        String editQuery = "UPDATE members SET firstName=?, lastName=?, phone=?, email=?, gender=? WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setInt(6, id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã sửa thông tin thành viên", "", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Thông tin thành viên chưa được sửa", "", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     //xóa 
    public void removeMember(int id){
        String removeQuery = "DELETE FROM members WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã xóa thành công thành viên", "", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Thành viên chưa được xóa", "", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // lấy thông tin thành viên bởi dữ liệu
    public Member getMemberById(Integer id){
        
        Func_Class func = new Func_Class();
        String query = "SELECT * FROM members WHERE id="+id;
        ResultSet rs = func.getData(query);
        
            try {
                if(rs.next()){
                    return new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                }
                else{
                    return null;
                }   } catch (SQLException ex) {
                Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
            }
            return (Member) rs;
        
    }
    
     // tạo hàm cho danh sách các thanh vien vào một mảng
   public ArrayList<Member> membersList(String query) {
    ArrayList<Member> mList = new ArrayList<>();
    My_classes.Func_Class func = new My_classes.Func_Class();
    try {
        
        if(query.equals("")){
            query = "SELECT * FROM members";
        }
        ResultSet rs = func.getData(query);
        Member member;
        while (rs.next()) {               
            int id = rs.getInt("id");
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String phone = rs.getString("phone");
            String email = rs.getString("email");
            String gender = rs.getString("gender");
            
            member = new Member(id, firstName, lastName, phone, email, gender);
            mList.add(member);                
        }
    } catch (SQLException ex) {
        Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
    }
    return mList;
}
              // tạo một hàm kiểm tra nếu người dùng đã tồm tại
    public boolean checkMemberIdExists(int id) {
    boolean exists = false;
    try {
        ResultSet rs = func.getData("select * from members where id = '"+ id+ "'");
        if(rs.next()) { 
            exists = true;
        }
    } catch(SQLException ex) {
        Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        // Xử lý lỗi ở đây
    }
    return exists;
    }

}
