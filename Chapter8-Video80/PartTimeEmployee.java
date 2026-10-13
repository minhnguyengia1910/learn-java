public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public PartTimeEmployee(String name, String department, int hoursWorked, double hourlyRate) {
		super(name, department);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	double calculateSalary() {
		return this.hoursWorked * this.hourlyRate;
	}

	@Override
	public void printInfo() {
		System.out
				.println("Name: " + super.getName() + " | Department: " + super.getDepartment() + " | Type: Part-time");
	}

}
