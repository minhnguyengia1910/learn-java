public class Video71 {
	public static void main(String[] args) {
		Manager m1 = new Manager("Sales", "hoidanit", 25, "M001", 2000);
		m1.introduce();
		System.out.println("");
		System.out.println("Lương cơ bản: " + m1.calculateSalary());
		System.out.println("Lương sau thưởng: " + m1.calculateSalary(500));
	}
}

