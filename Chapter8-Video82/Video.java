public class Video implements Playable {
	private String title;
	private int duration;

	public Video(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}

	@Override
	public void play() {
		System.out.println("Playing video: " + this.title + " (" + this.duration + " mins)");
	}

	@Override
	public void pause() {
		System.out.println("Pausing video: " + this.title);
	}
}