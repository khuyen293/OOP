
package My_classes;

//import com.mysql.cj.xdevapi.PreparableStatement;
//import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.HashMap;

public class Genre {
    private int id;
    private String name;
    public Genre(){
        
    }
    
    public Genre(int _id, String _name){
        this.id = _id;
        this.name = _name;        
    }
    
    public void setId(int _id){
        this.id = _id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setName(String _name){
        this.name = _name;
    }
    
    public String getName(){
        return name;
    }
     My_classes.Func_Class func = new My_classes.Func_Class();
    // thêm một thể loại mới
    public void addGenre(int _id, String _name){
        String insertQuery = "INSERT INTO book_genres(id,name) VALUES (?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, _id);
            ps.setString(2, _name);
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã thêm một thể loại", "Thông báo", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Thể loại chưa được thêm", "Thông báo", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //sửa thể loại bằng id
    public void editGenre(int _id, String _name){
        String editQuery = "UPDATE book_genres SET name=? WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
             ps.setString(1, _name);
            ps.setInt(2, _id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã sửa một thể loại", "Thông báo", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Thể loại chưa được sửa", "Thông báo", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //xóa 
    public void removeGenre(int _id){
        String removeQuery = "DELETE FROM book_genres WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, _id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã xóa một thể loại", "Thông báo", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Thể loại chưa được xóa", "Thông báo", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return false;
    }
    
    // tạo hàm cho danh sách các thể loại vào một mảng
   public ArrayList<Genre> genreList() {
    ArrayList<Genre> gList = new ArrayList<>();
     //cach 2
    try{
        ResultSet rs = func.getData("SELECT * FROM book_genres");
        Genre genre;
    while (rs.next()) {               
            int id = rs.getInt("id");
            String name = rs.getString("name");
            genre = new Genre(id, name);
            gList.add(genre);                
        }
    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
    }
    return gList;
}
   
   //hiển thị 1 hàn trả về 1 hashmap
   //String is the key
   // integer is the value
   public HashMap<String, Integer> getGenresMap(){
       HashMap<String, Integer> map = new HashMap<>();
       
       try{
        ResultSet rs = func.getData("SELECT * FROM book_genres");
        Genre genre;
    while (rs.next()) {               
            int id = rs.getInt("id");
            String name = rs.getString("name");
            genre = new Genre(id, name);
            map.put(genre.getName(), genre.getId());
        }
    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
    }
       return map;
   }
   
   // in ra một hàm tác giả bởi id
   public Genre getGenreById(Integer id){
       ResultSet rs = func.getData("SELECT * FROM book_genres WHERE id = '" + id + "'");
       Genre genre = null;
        try{
        if(rs.next()) { 
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
        }
        }catch(SQLException ex){
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);    
        }
   
        return genre;
   }	
    
   
         // tạo một hàm kiểm tra nếu người dùng đã tồm tại
    public boolean checkGenreIdExists(String name, int id) {
    boolean exists = false;
    try {
        ResultSet rs = func.getData("select * from book_genres where id = '"+ id +"' or name = '"+ name +"'");
        if(rs.next()) { 
            exists = true;
        }
    } catch(SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        // Xử lý lỗi ở đây
    }
    return exists;
    }

}
