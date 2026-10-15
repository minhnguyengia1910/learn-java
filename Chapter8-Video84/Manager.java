public class Manager extends Person implements Trainable {
	private int teamSize;

	public Manager(String name, int age, int teamSize) {
		super(name, age);
		this.teamSize = teamSize;
	}

	@Override
	public void work() {
		System.out.println("Manager " + getName() + " is managing a team of " + this.teamSize + " people.");
	}

	public void attendTraining(String topic) {
		System.out.println("Manager " + getName() + " is attending management traning on " + topic);
	}

}
