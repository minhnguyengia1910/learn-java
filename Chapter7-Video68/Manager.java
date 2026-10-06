public class Manager extends Employee {
	private String department;

	public Manager(String department, String name, int id, double salary) {
		super(name, id, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	double calculateSalary() {
		double curentsalary = super.calculateSalary();
		return curentsalary * 1.1;
	}
}
