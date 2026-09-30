import java.util.Scanner;

public class Video28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập điểm của bạn: ");
		float score = scanner.nextFloat();
		if (score >= 9 && score <= 10) {
			System.out.println("Bạn đạt xuất sắc");
		} else if (score >= 8 && score < 9) {
			System.out.println("Bạn đạt giỏi");
		} else if (score >= 6.5 && score < 8) {
			System.out.println("Bạn đạt khá");
		} else if (score >= 5 && score < 6.5) {
			System.out.println("Bạn đạt trung bình");
		} else if (score >= 0 && score < 5) {
			System.out.println("Bạn đạt Yếu");
		} else {
			System.out.println("Ngoài khoảng giá trị");
		}
	}
}