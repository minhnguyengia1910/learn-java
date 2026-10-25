package chapter5.video40;
import java.util.Scanner;
public class Video40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] listNumber = new int[5];
		for (int i = 1; i <= 5; i++) {
			System.out.print("Nhập phần tử " + i + ":");
			int input = sc.nextInt();
			listNumber[i-1] = input; 
		}
		int tong = 0;
		int max = listNumber[0];
		for (int j = 0; j < listNumber.length; j++) {
			tong += listNumber[j];
			if (listNumber[j] > max) {
				max = listNumber[j];
			}
		}
		System.out.println("Tổng các số là: " + tong);
		System.out.println("Số lớn nhất là: " + max);
	}
}
