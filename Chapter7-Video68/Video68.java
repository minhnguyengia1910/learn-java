public class Video68 {
	public static void main(String[] args) {
		Manager boss = new Manager("IT", "Eric", 123, 1000);
		Programmer dev = new Programmer("hoidanit", 456, 1000);
		System.out.println("boss salary: " + boss.calculateSalary());
		System.out.println("programmer salary: " + dev.calculateSalary());
	}
}
