public class Video82 {
	public static void main(String[] args) {
		Song s1 = new Song("Shape of You", "Ed Sheeran");
		Video v1 = new Video("Inception", 148);
		Playable[] play = { s1, v1 };
		for (Playable p : play) {
			p.play();
			p.pause();
		}
	}
}