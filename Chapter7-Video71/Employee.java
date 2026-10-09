public class Employee extends Person {
	private String employeeid;
	private double salary;

	public Employee(String name, int age, String employeeid, double salary) {
		super(name, age);
		this.employeeid = employeeid;
		this.salary = salary;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("Employee ID: " + this.employeeid);
		System.out.println("Salary: " + this.salary);

	}

	public double calculateSalary() {
		return this.salary;
	}

	public double calculateSalary(double bonus) {
		return this.salary + bonus;
	}

}
