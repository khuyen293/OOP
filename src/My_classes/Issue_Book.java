package My_classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Issue_Book {
    private int book_id;
    private int member_id;
    private String status;
    private String issue_date;
    private String return_date;
    private String note;
    public Issue_Book(){
        
    }
    
public Issue_Book(int book_id, int member_id, String status, String issue_date, String return_date, String note) {
        this.book_id = book_id;
	this.member_id = member_id;
	this.status = status;
	this.issue_date = issue_date;
	this.return_date = return_date;
	this.note = note;
	}

	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
    
    Book book = new Book();
    // thêm 1 issue mới
    public void AddIssue(int book_id, int member_id, String status, String issue_date, String return_date, String note){
          String insertQuery = "insert into issue_book (book_id, member_id, status, issue_date, return_date, note) value (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, book_id);
            ps.setInt(2, member_id);
            ps.setString(3, status);
            ps.setString(4, issue_date);
            ps.setString(5, return_date);
            ps.setString(6, note);

          
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Đã chuyển đến","", 1);                 
            }else{
                JOptionPane.showMessageDialog(null, "Chưa chuyển đến","", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void updateIssue(int book_id, int member_id, String status,String issue_date, String return_date, String note){
          String updateQuery = "update issue_book set status=?, return_date=?, note=? where book_id=? and member_id=? and issue_date=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
            
            ps.setString(1, status);
            ps.setString(2, return_date);
            ps.setString(3, note);
            ps.setInt(4, book_id);
            ps.setInt(5, member_id);
            ps.setString(6, issue_date);

          
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "trạng thái cập nhật","Mượn sách", 1);                 
            }else{
                JOptionPane.showMessageDialog(null, "trạng thái chưa cập nhật","Mượn sách", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //kiem tra neu sach co san
    //lấy số lượng sách từ sách trong bảng và so sánh nó với số lượng sách được cấp trong bảng phát hành sách
    public boolean checkBookAvailability(int book_id){
        boolean availability = false;
        try {
            // bước đầu lấy số lượng sách
            Book selectedBook = book.getBookById(book_id);
            int quantity = selectedBook.getQuantity();
            //lấy số sách đã phát hành (sách giống nhau)
            int issued_book_count = countData(book_id);
            if(quantity > issued_book_count){
                availability = true;
            }else{
                availability = false;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return availability;               
    }
    //tạo nêm 1 hàm đếm các sách phát hành
    public int countData(int book_id){
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        try{
        ps= (PreparedStatement) DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM issue_book WHERE book_id=? and status = 'issued'");
        ps.setInt(1, book_id);
        rs = ps.executeQuery();
        
        if(rs.next()){
            total = rs.getInt("total");
            
        }
        }catch(SQLException ex){
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;     
    }
    
    
    public ArrayList<Issue_Book> issueBooksList(String status) {
    ArrayList<Issue_Book> issBList = new ArrayList<>();
    My_classes.Func_Class func = new My_classes.Func_Class();
    String query = "";
    
    if(status.equals("")){  // neu status trống hiênr thị tất cả dữ liệu
        query = "SELECT * FROM issue_book";
    }else{ // hiển thị dữ liệu dựa trên status
        query = "SELECT * FROM issue_book WHERE status = '"+status+"'";
    }
    
    try {
        //query = "SELECT * FROM issue_book";
        ResultSet rs = func.getData(query);
        Issue_Book issBook;
        if (rs != null) {
            while (rs.next()) {               
                issBook = new Issue_Book(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                issBList.add(issBook);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }
    return issBList;
}
    
    //xóa sách nhà phát hành bằng book_id, member_id hoặc issue_date
    //bạn có thể thêm cộtid (đặt nó làm khóa) vào bảng và xóa bằng cách sử dụng nó
    
        public void removeFromIssuedBook(int book_id, int member_id, String issue_date){
        String removeQuery = "delete from issue_book where book_id=? and member_id=? and issue_date=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, book_id);
            ps.setInt(2, member_id);
            ps.setString(3, issue_date);
           
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Xóa thành công", "xóa", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Chưa xóa thành công", "xóa", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
