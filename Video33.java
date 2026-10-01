import java.util.Scanner;

public class Video33 {
	public static void main(String[] args) {
		// Yêu cầu 1
		int tong = 0;
		for (int i = 1; i <= 100; i++) {
			tong = tong + i;
		}
		System.out.println("Tổng từ 1 đến 100 là: " + tong);
		// Yêu cầu 2
		int j = 2;
		while (j <= 20) {
			if (j % 2 == 0) {
				System.out.println(j + ": Là số chẵn");
			}
			j++;
		}
		// Yêu cầu 3
		String password = "hoidanit";
		Scanner scanner = new Scanner(System.in);
		String input = "";
		do {
			System.out.print("Nhập mật khẩu của bạn: ");
			input = scanner.nextLine();
		} while (!password.equals(input));
		System.out.println("Đã nhập đúng, kết thúc chương trình");
		scanner.close();

	}
}