package GymManagement;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        MemberDAO memberdao = new MemberDAO();
        
        while(true) {
            
            System.out.println("\n====================================");
            System.out.println("     GYM MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("--- MEMBER MANAGEMENT ---");
            System.out.println("1. Add New Member");
            System.out.println("2. View All Members");
            System.out.println("3. Search Member (by name/id)");
            System.out.println("4. Update Member Details");
            System.out.println("5. Delete Member");
            System.out.println("6. View Expired Memberships");
            System.out.println("0. Exit");
            System.out.println("====================================");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("\n========== ADD NEW MEMBER ==========");
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    
                    System.out.print("Enter Phone: ");
                    String phone = sc.next();
                    
                    // Current date as join date
                    LocalDate today = LocalDate.now();
                    String joinDate = today.toString();
                    
                    // Select membership type and calculate end date
                    System.out.print("Membership Type (Monthly/Quarterly/Yearly): ");
                    String membershipType = sc.next();
                    
                    LocalDate endDate = today;
                    if(membershipType.equalsIgnoreCase("Monthly")) {
                        endDate = today.plusMonths(1);
                    } else if(membershipType.equalsIgnoreCase("Quarterly")) {
                        endDate = today.plusMonths(3);
                    } else if(membershipType.equalsIgnoreCase("Yearly")) {
                        endDate = today.plusYears(1);
                    }
                    String endDateStr = endDate.toString();
                    
                    String feeStatus = "Pending";
                    
                    Member member = new Member(id, name, phone, joinDate, endDateStr, membershipType, feeStatus);
                    memberdao.addMember(member);
                    break;
                    
                case 2:
                    memberdao.viewMembers();
                    break;
                    
                case 3:
                    System.out.print("\nEnter Name or ID to search: ");
                    String keyword = sc.next();
                    memberdao.searchMember(keyword);
                    break;
                    
                case 4:
                    System.out.println("\n========== UPDATE MEMBER ==========");
                    System.out.print("Enter ID to Update: ");
                    int sId = sc.nextInt();
                    
                    System.out.print("Enter new Phone Number: ");
                    String newPhone = sc.next();
                    
                    System.out.print("Enter new Membership Type (Monthly/Quarterly/Yearly): ");
                    String newMembershipType = sc.next();
                    
                    MemberDAO.updateMember(sId, newPhone, newMembershipType);
                    break;
                    
                case 5:
                    System.out.println("\n========== DELETE MEMBER ==========");
                    System.out.print("Enter ID to Delete: ");
                    int idToDelete = sc.nextInt();
                    memberdao.deleteMember(idToDelete);
                    break;
                    
                case 6:
                    memberdao.viewExpiredMemberships();
                    break;
                    
                case 0:
                    System.out.println("\nThank You for using Gym Management System!");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}