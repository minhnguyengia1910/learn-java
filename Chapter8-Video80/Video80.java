public class Video80 {
	public static void main(String[] args) {
		FullTimeEmployee f1 = new FullTimeEmployee("Hoidanit", "IT", 3000);
		PartTimeEmployee p1 = new PartTimeEmployee("Eric", "HR", 12, 600);
		Employee[] ep1 = { f1, p1 };
		for (Employee e : ep1) {
			e.printInfo();
			System.out.println("Salary: " + e.calculateSalary());
		}
	}
}
