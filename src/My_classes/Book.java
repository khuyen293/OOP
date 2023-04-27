
package My_classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;



public class Book {
    private int id;
    private String isbn;
    private String name;
    private Integer author_id;
    private Integer genre_id;
    private Integer quantity;
    private String publisher;
    private double price;
    private String date_received;
    private String description;
    private byte[] cover;
    public Book(){
        
    }
    public Book(int id, String isbn, String name, Integer author_id, Integer genre_id, Integer quantity, String publisher,double price, String date_received, String description, byte[] cover) {
		this.id = id;
                this.isbn = isbn;
		this.name = name;
		this.author_id = author_id;
		this.genre_id = genre_id;
		this.quantity = quantity;
		this.publisher = publisher;
		this.price = price;
		this.date_received = date_received;
		this.description = description;
		this.cover = cover;
	}
        public int getID(){
            return id;
        }
        public void setID(){
            this.id = id;
        }    
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}
	public Integer getGenre_id() {
		return genre_id;
	}
	public void setGenre_id(Integer genre_id) {
		this.genre_id = genre_id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDate_received() {
		return date_received;
	}
	public void setDate_received(String date_received) {
		this.date_received = date_received;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getCover() {
		return cover;
	}
	public void setCover(byte[] cover) {
		this.cover = cover;
	}
    
         Func_Class func = new Func_Class();  
                           	
        public Book getBook(int id) {
        // Check if the user already exists
        Book book = null;
    String selectQuery = "SELECT * FROM books WHERE id=?";
    try {
        PreparedStatement ps = DB.getConnection().prepareStatement(selectQuery);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
           book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4), rs.getInt(5), rs.getInt(6),
               rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getBytes(11));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }
    return book;
}
         
    public void addBook(int id, String isbn, String name, Integer author_id, Integer genre_id, Integer quantity, String publisher,double price, String date_received, String description, byte[] cover){
                if (getBook(id) != null) {
                    JOptionPane.showMessageDialog(null, "ID sách đã tồn tại", "", 2);
                    return;
                }
        String insertQuery = "INSERT INTO books (id, isbn, name,author_id, genre_id, quantity, publisher, price, date_received, description, cover_image) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, id);
            ps.setString(2, isbn);
            ps.setString(3, name);
            ps.setInt(4, author_id);
            ps.setInt(5, genre_id);
            ps.setInt(6, quantity);
            ps.setString(7, publisher);
            ps.setDouble(8, price);
            ps.setString(9, date_received);
            ps.setString(10, description);
            ps.setBytes(11, cover);

          
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã thêm sách mới","", 1);                 
            }else{
                JOptionPane.showMessageDialog(null, "Sách mới chưa được thêm chưa được thêm","", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //sửa
    public void editBook(int id, String name, Integer author_id, Integer genre_id, Integer quantity, String publisher,double price, String date_received, String description, byte[] cover){
        String updateQuery ;
        PreparedStatement ps;
        try{
        if(cover != null){
            
              updateQuery = "UPDATE books SET name=?, author_id=?, genre_id=?, quantity=?, publisher=?, price=?, date_received=?, description=?, cover=? WHERE id=?";
              ps= DB.getConnection().prepareStatement(updateQuery);
                  ps.setString(1, name);
                  ps.setInt(2, author_id);
                  ps.setInt(3, genre_id);
                  ps.setInt(4, quantity);
                  ps.setString(5, publisher);
                  ps.setDouble(6, price);
                  ps.setString(7, date_received);
                  ps.setString(8, description);
                  ps.setBytes(9, cover);
                  ps.setInt(10,id);
        }
        else{
            updateQuery = "UPDATE books SET name=?, author_id=?, genre_id=?, quantity=?, publisher=?, price=?, date_received=?, description=? WHERE id=?";
            ps = DB.getConnection().prepareStatement(updateQuery);
            ps.setString(1, name);
            ps.setInt(2, author_id);
            ps.setInt(3, genre_id);
            ps.setInt(4, quantity);
            ps.setString(5, publisher);
            ps.setDouble(6, price);
            ps.setString(7, date_received);
            ps.setString(8, description);           
            ps.setInt(9,id);
        
        }                  
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã sửa thông tin sách","", 1);                 
            }else{
                JOptionPane.showMessageDialog(null, "Thông tin sách chưa được sửa","", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void removeBook(int id){
        String removeQuery = "DELETE FROM books WHERE id=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã xóa thông tin sách", "", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Thông tin sách chưa được xóa", "", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // tạo một chú thích để kiểm tra xem isbn đã tồn tại chưa
    
    public boolean isISBNexists(String isbn){
        String query = "select * from books where isbn = '"+isbn+"'";
            
        ResultSet rs =  func.getData(query);
        try {
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public Book searchBookbyId_Isbn(int id, String isbn){
        String query = "select * from books where id = "+id+" or isbn = '"+isbn+"'";
         
        Func_Class func = new Func_Class();
        ResultSet rs =  func.getData(query);
        Book book = null;
        try {
            if(rs.next()){
               book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4), rs.getInt(5), rs.getInt(6),
               rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getBytes(11));
            }else{
               return book;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return book;
        
    }
    
    public ArrayList<Book> booksList(String query) {
    ArrayList<Book> bList = new ArrayList<>();
    My_classes.Func_Class func = new My_classes.Func_Class();
    try {
         if(query.equals("")){
            query = "SELECT * FROM books";
        }
        ResultSet rs = func.getData(query);
        Book book;
        if (rs != null) {
            while (rs.next()) {               
                book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4), rs.getInt(5), rs.getInt(6),
               rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getBytes(11));
                bList.add(book);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }
    return bList;
}

    
    // lấy thông tin sách bởi dữ liệu
    public Book getBookById(Integer id) throws SQLException{
             Func_Class func = new Func_Class();
             String query = "SELECT * FROM books WHERE id="+id;
        ResultSet rs = func.getData(query);
        
            try {
                if(rs.next()){
                    return new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4), rs.getInt(5), rs.getInt(6),
               rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getBytes(11));
                }
                else{
                    return null;
                }   } catch (SQLException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
            return (Book) rs;
        
    }
    
    // tạo ra một hàm hiển thị ra 5 quyển sách
    public void displayBooksCover(JLabel[] labels_tab){
        ResultSet rs;
        Statement st;
        try{
        st = DB.getConnection().createStatement();
        rs = st.executeQuery("SELECT cover_image from books order by id desc limit 5");
        byte[] image;
        int i = 0; //gán các mục hình ảnh bắt đâuf từ 0
        while(rs.next()){ // truy xuat vào từng dữ liệu
            image = rs.getBytes("cover_image");
            func.displayImage(labels_tab[i].getWidth(), labels_tab[i].getHeight(), image, name, labels_tab[i]);
            i++;
        }
        }catch(SQLException ex){
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }             
    }
    
    public void setQuantity_Minus_One(int book_id, int quantity){
        String updatequantityQuery ;
        PreparedStatement ps;
        try{
              updatequantityQuery = "UPDATE books SET quantity=? WHERE id=?";
              ps= DB.getConnection().prepareStatement(updatequantityQuery);
              
                  ps.setInt(1, quantity);           
                  ps.setInt(2, book_id);                   
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã thay đổi số lượng sách sau khi sách này bị mất","Thông báo", 1);                 
            }else{
                JOptionPane.showMessageDialog(null, "Chưa thay đổi số lượng","Thông báo", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
      //tạo ra một hàm đếm các dữ liệu
    public int countData(){
        int total = 0;
        ResultSet rs;
        Statement st;
        try{
        st = DB.getConnection().createStatement();
        rs = st.executeQuery("SELECT SUM(quantity) AS total FROM books");
        if(rs.next()){
            total = rs.getInt("total");           
        }
        }catch(SQLException ex){
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
        
        
    }
}
