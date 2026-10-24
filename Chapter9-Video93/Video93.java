package chapter9.video93;

public class Video93 {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				OrderStatus myStatus = OrderStatus.PENDING;
				Order myOrder = new Order("A001", myStatus);
				myOrder.processOrder();
				Order.CustomerInfo data = myOrder.new CustomerInfo("hoidanit", "0901234567");
				data.printInfo();
				Order.DiscountHelper od = new Order.DiscountHelper();
				System.out.println("Chiết khấu áp dụng: " + od.calculateDiscount(myStatus) + "%");
				System.out.println(
						"Đơn hàng " + myOrder.getId() + " đang được xử lý ở trạng thái: " + myStatus.getDescription());
			}
		};
		task.run();

	}
}
