package chapter9.video90;

import java.util.Scanner;

public class Video90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập trạng thái đơn hàng: ");
		String status = sc.nextLine().toUpperCase();
		try {
			OrderStatus input = OrderStatus.valueOf(status);
			System.out.println("Trạng thái: " + input.getDescription());
			System.out.println("Trạng thái cuối cùng: " + input.hasFinal());
		} catch (Exception e) {
			System.out.println("Trạng thái không hợp lệ!");
		}

	}
}
