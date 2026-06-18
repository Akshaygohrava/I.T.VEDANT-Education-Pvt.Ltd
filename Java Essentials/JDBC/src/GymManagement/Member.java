package GymManagement;

public class Member {

    private int id;
    private String name;
    private String phone;
    private String joinDate;
    private String endDate;
    private String membershipType;
    private String feeStatus;
    
    // Constructor with all fields
    public Member(int id, String name, String phone, String joinDate, 
                  String endDate, String membershipType, String feeStatus) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.joinDate = joinDate;
        this.endDate = endDate;
        this.membershipType = membershipType;
        this.feeStatus = feeStatus;
    }
    
    // Default constructor
    public Member() {
        super();
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getJoinDate() {
        return joinDate;
    }
    
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    
    public String getEndDate() {
        return endDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public String getMembershipType() {
        return membershipType;
    }
    
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
    
    public String getFeeStatus() {
        return feeStatus;
    }
    
    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus;
    }
    
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", phone=" + phone + 
               ", joinDate=" + joinDate + ", endDate=" + endDate + 
               ", membershipType=" + membershipType + ", feeStatus=" + feeStatus + "]";
    }
}