public class Video35 {
	public static void main(String[] args) {
		// Yêu cầu 1
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count = count + 1;
				if (count == 3) {
					System.out.println("i lần thứ 3 = " + i);
					break;
				}

			}
		}
		// Yêu cầu 2
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println("i = " + i);
		}
	}
}
