package lab04.video60;

import lab04.model.Employee;

public class Video60 {
	public static void main(String[] args) {
		Employee nv1 = new Employee("hoidanit", 25, "Sales", 8000);
		Employee nv2 = new Employee("eric", 30, "IT", 10000);
		System.out.println("== BEFORE RAISE ==");
		nv1.showInfo();
		nv2.showInfo();
		System.out.println("== AFTER RAISE ==");
		nv1.raiseSalary(0);
		nv1.showInfo();
		nv2.raiseSalary(1);
		nv2.showInfo();

	}
}
