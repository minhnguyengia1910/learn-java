public abstract class Employee {
	private String name;
	private String department;

	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	abstract double calculateSalary();

	public void printInfo() {
		System.out.println("Name: " + this.name + " | Department: " + this.department);
	}
}
