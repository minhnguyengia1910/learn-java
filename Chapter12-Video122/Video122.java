public class Video122 {
	public static void main(String[] args) {
		MyTransaction<Integer, Integer, String> t1 = new MyTransaction<>(1, 1000, "Success");
		MyTransaction<String, Double, TransactionStatus> t2 = new MyTransaction<>("A00001", 1000.05,
				TransactionStatus.PENDING);
		System.out.println(t1);
		System.out.println(t2);
	}
}
