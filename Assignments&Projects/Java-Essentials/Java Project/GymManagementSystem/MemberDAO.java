package GymManagement;

import java.sql.*;

public class MemberDAO {

    public void addMember(Member member) {
        Connection connection = DBconnection.getConnection();
        
        String sql = "INSERT INTO members (id, name, phone, join_date, end_date, membership_type, fee_status) VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, member.getId());
            ps.setString(2, member.getName());
            ps.setString(3, member.getPhone());
            ps.setString(4, member.getJoinDate());
            ps.setString(5, member.getEndDate());
            ps.setString(6, member.getMembershipType());
            ps.setString(7, member.getFeeStatus());
            
            int rows = ps.executeUpdate();
            
            System.out.println(rows + " Member Added Successfully!");
            
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void viewMembers() {
        Connection connection = DBconnection.getConnection();
        
        try {
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM members";
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            System.out.println("\n========== ALL MEMBERS ==========");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Phone: " + resultSet.getString("phone"));
                System.out.println("Join Date: " + resultSet.getString("join_date"));
                System.out.println("End Date: " + resultSet.getString("end_date"));
                System.out.println("Membership Type: " + resultSet.getString("membership_type"));
                System.out.println("Fee Status: " + resultSet.getString("fee_status"));
                System.out.println("-----------------------------------");
            }
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateMember(int id, String newPhone, String newMembershipType) {
        Connection connection = DBconnection.getConnection();
        
        String sql = "UPDATE members SET phone = ?, membership_type = ? WHERE id = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, newPhone);
            ps.setString(2, newMembershipType);
            ps.setInt(3, id);
            
            int rows = ps.executeUpdate();
            
            System.out.println(rows + " Member Updated Successfully!");
            
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteMember(int id) {
        Connection connection = DBconnection.getConnection();
        
        String sql = "DELETE FROM members WHERE id = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int rows = ps.executeUpdate();
            
            System.out.println(rows + " Member Deleted Successfully!");
            
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void searchMember(String keyword) {
        Connection connection = DBconnection.getConnection();
        
        String sql = "SELECT * FROM members WHERE name LIKE ? OR id = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, "%" + keyword + "%");
            
            // Try to parse keyword as integer for ID search
            try {
                int id = Integer.parseInt(keyword);
                ps.setInt(2, id);
            } catch (NumberFormatException e) {
                ps.setString(2, keyword);
            }
            
            ResultSet rs = ps.executeQuery();
            
            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.println("\n========== MEMBER FOUND ==========");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("Join Date: " + rs.getDate("join_date"));
                System.out.println("End Date: " + rs.getDate("end_date"));
                System.out.println("Membership Type: " + rs.getString("membership_type"));
                System.out.println("Fee Status: " + rs.getString("fee_status"));
                System.out.println("-----------------------------------");
            }
            
            if (!found) {
                System.out.println("Member not found with name/ID: " + keyword);
            }
            
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void viewExpiredMemberships() {
        Connection connection = DBconnection.getConnection();
        
        String sql = "SELECT * FROM members WHERE end_date < CURDATE()";
        
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            boolean found = false;
            System.out.println("\n========== EXPIRED MEMBERSHIPS ==========");
            while (rs.next()) {
                found = true;
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("End Date: " + rs.getDate("end_date"));
                System.out.println("Membership Type: " + rs.getString("membership_type"));
                System.out.println("-----------------------------------");
            }
            
            if (!found) {
                System.out.println("No expired memberships found!");
            }
            
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}