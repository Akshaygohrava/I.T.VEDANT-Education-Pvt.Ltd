package FinalExamples;

public class Employee {
	
    private int id;
    private String name;
    private Status status;
    
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
    
    public Status getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", status=" + status + "]";
    }
    
    public Employee(int id, String name, Status status) {
        super();
        this.id = id;
        this.name = name;
        this.status = status;
    }
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void setStatus(Status status) {
        this.status = status;
    }
}