public class Video84 {
	public static void main(String[] args) {
		Person[] persons = new Person[] { new Engineer("Alice", 25, "AI"), new Manager("Bob", 40, 10) };
		for (Person p1 : persons) {
			p1.introduce();
			p1.work();

			if (p1 instanceof Trainable) {
				Trainable test = (Trainable) p1;
				if (p1 instanceof Engineer) {
					test.attendTraining("Cloud Computing");
				} else if (p1 instanceof Manager) {
					test.attendTraining("Leadership");
				}
				test.feedback();
				System.out.println("");

			}

		}

	}
}