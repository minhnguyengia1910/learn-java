import java.util.Scanner;
public class Video36 {
	public static void main(String[] args) {
		//Tính năng 1
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		int count = 0;
		int sum = 0;
		System.out.print("Nhập điểm (từ 0 đến 10, nhập -1 để dừng): ");
		do {

			score = scanner.nextInt();
			if (score == -1) {
				break;
			} else if (score < 0 || score > 10) {
				System.out.print("Điểm " + score + " không hợp lệ. Nhập lại: ");
				continue;
			} else {
				System.out.print("Nhập điểm (từ 0 đến 10, nhập -1 để dừng): ");
			}
			count++;
			sum += score;

		} while (score != -1);
		System.out.print("Kết thúc nhập, count = " + count + " sum = " + sum);
		scanner.close();

		// Tính năng 2
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		float count = 0;
		float sum = 0;
		System.out.print("Nhập điểm (từ 0 đến 10, nhập -1 để dừng): ");
		do {

			score = scanner.nextInt();
			if (score == -1) {
				break;
			} else if (score < 0 || score > 10) {
				System.out.print("Điểm " + score + " không hợp lệ. Nhập lại: ");
				continue;
			} else {
				System.out.print("Nhập điểm (từ 0 đến 10, nhập -1 để dừng): ");
			}
			count++;
			sum += score;

		} while (score != -1);

		System.out.println("===== MENU =====");
		System.out.println("1. Tính điểm trung bình	");
		System.out.println("2. Phân loại học lực");
		System.out.println("3. Thoát chương trình");
		System.out.println("================");
		System.out.print("Nhập lựa chọn: ");
		int select = scanner.nextInt();
		float diemTB = (float) sum / count;
		switch (select) {
		case 1:
			System.out.printf("Điểm trung bình của bạn là : %.2f\n", diemTB);
			break;
		case 2:
			if (diemTB >= 9 && diemTB <= 10) {
				System.out.print("Xuất sắc\n");
			} else if (diemTB >= 8 && diemTB < 9) {
				System.out.print("Giỏi\n");
			} else if (diemTB >= 6.5 && diemTB < 8) {
				System.out.print("Khá\n");
			} else if (diemTB >= 5 && diemTB < 6.5) {
				System.out.print("Trung bình\n");
			} else if (diemTB >= 0 && diemTB < 5) {
				System.out.print("Yếu\n");
			} else {
				System.out.print("Điểm " + diemTB + " không hợp lệ");
			}
			break;
		case 3:
			break;
		default:
			break;
		}
		System.out.println("Kết thúc chương trình");
		scanner.close();

	}
}
