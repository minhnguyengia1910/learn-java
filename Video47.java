package chapter5.video43;
import java.util.Scanner;
public class Video43 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		double[] scores = new double[3];
		for (int i = 1; i <= 3; i++) {
			System.out.print("Nhập tên học sinh " + i + ": ");
			String name = sc.nextLine();
			names[i-1] = name;
			System.out.print("Nhập điểm: ");
			double score = sc.nextDouble();
			scores[i-1] = score;
			sc.nextLine();
		}
		System.out.println("");
		System.out.println("Danh sách học sinh:");
		for (int i = 1; i <=3; i++) {
			System.out.println(names[i-1] + "-" + scores[i-1]);
		}
		double tong = 0;
		for (int k = 0; k < scores.length; k++) {
			tong += scores[k];
		}
		float trungbinh = (float) tong/scores.length;
		System.out.println("");
		System.out.printf("Điểm trung bình: %.2f\n\n", trungbinh);
		System.out.println("Học sinh có điểm >= 8:");
		for (int k = 0; k < scores.length; k++) {
			if (scores[k] >= 8) {
				System.out.println(names[k] + "-" + scores[k]);
			}	
		}
		
		sc.close();
	}
}
