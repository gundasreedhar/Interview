package java8Questions;

public class Employee {
	private String userName;
	private String emailId;
	private double salary;
	private String department;
	private boolean active;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Employee(String userName, String emailId, double salary, String department, boolean active) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.salary = salary;
		this.department = department;
		this.active = active;
	}
	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", emailId=" + emailId + ", salary=" + salary + ", department="
				+ department + ", active=" + active + "]";
	}
	

	

	
	
	
	
	
	
}
