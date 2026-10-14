public interface Trainable {
	void attendTraining(String topic);

	default void feedback() {
		System.out.println("Thanks for the training session.");
	}
}
