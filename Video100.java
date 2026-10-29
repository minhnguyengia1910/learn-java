package chapter10.video100;
import java.util.Scanner;
public class Video100 {
	public static void checkScore(int score) {
		if (score < 0 || score > 10) {
			throw new IllegalArgumentException("Điểm không hợp lệ: phải từ 0 đến 10");
		}
		else {
			System.out.println("Điểm của bạn là: " + score);
		}
	}
	public static void main(String[] args) {
		//Cách 1:
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập vào số nguyên: ");
//		int n = sc.nextInt();
//		try {
//			checkScore(n);
//		}catch(IllegalArgumentException e) {
//			System.out.println("Error: "+ e.getMessage());
//		}
//		finally {
//			System.out.println("Kết thúc chương trình");
//		}
//		sc.close();
		//Cách 2: try with resouces
		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("Nhập vào số nguyên: ");
			int n = sc.nextInt();
			checkScore(n);
		}catch(IllegalArgumentException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		finally {
			System.out.println("Kết thúc chương trình");
		}
	}
}
