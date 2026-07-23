package StudentManagement;
import java.sql.*;

public class StudentDAO {

	public void addStudent(Student student) {
		Connection connection = DBconnection.getConnection();
		
		String sql = "INSERT INTO student VALUES (?,?,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getCity());
			
			int rows = ps.executeUpdate();
			
			System.out.println("Student Added !");
			
			connection.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void viewStudents() {
		
		Connection connection = DBconnection.getConnection();
		
		try {
			Statement statement = connection.createStatement();
			
			String sql = "SELECT * FROM student";
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				System.out.println(" id "  + resultSet.getInt("id"));
				System.out.println(" name " + resultSet.getString("name"));
				System.out.println(" city " + resultSet.getString("city"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void updateStudent(int id, String city) {
		
        Connection connection = DBconnection.getConnection();
		
		String sql = "UPDATE student SET city = ? WHERE id = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, city);
			ps.setInt(2, id);
			
			int rows = ps.executeUpdate();
			
			System.out.println(rows + " Student Updated !");
			
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteStudent(int id) {
		Connection connection = DBconnection.getConnection();
		
		String sql = "DELETE FROM student WHERE id = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			int rows = ps.executeUpdate();
			
			System.out.println(rows + " Student Deleted !");
			
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void searchStudent(int id) {
		
        Connection connection = DBconnection.getConnection();
		
		String sql = "SELECT * FROM student WHERE id = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("Student Details");
				System.out.println(" id "  + rs.getInt("id"));
				System.out.println(" name " + rs.getString("name"));
				System.out.println(" city " + rs.getString("city"));
			} else {
				System.out.println("Student not found with ID: " + id);
			}
			
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}