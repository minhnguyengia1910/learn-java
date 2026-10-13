public class FullTimeEmployee extends Employee {
	private double monthlySalary;

	public FullTimeEmployee(String name, String department, double monthlySalary) {
		super(name, department);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return this.monthlySalary;
	}

	@Override
	public void printInfo() {
		System.out
				.println("Name: " + super.getName() + " | Department: " + super.getDepartment() + " | Type: Full-time");
	}

}
