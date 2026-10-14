public class Engineer extends Person implements Trainable {
	private String specialty;

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Engineer(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
	}

	@Override
	public void work() {
		System.out.println("Engineer " + getName() + " is working on " + this.specialty + " project.");
	}

	@Override
	public void attendTraining(String topic) {
		System.out.println("Engineer " + getName() + " is attending traning on " + topic);
	}
}