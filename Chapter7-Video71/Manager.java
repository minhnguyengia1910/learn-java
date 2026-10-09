public class Manager extends Employee {
	private String department;

	public Manager(String department, String name, int age, String employeeid, double salary) {
		super(name, age, employeeid, salary);
		this.department = department;

	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("Department: " + this.department);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}