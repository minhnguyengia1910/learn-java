package chapter9.video93;

public class Order {
	private String id;
	private OrderStatus status;

	public Order(String id, OrderStatus status) {
		this.id = id;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void processOrder() {
		class Logger {
			void log() {
				System.out.println("[LOG] Xử lý đơn hàng ID: " + id + " - Trạng thái: " + status.getDescription());
			}
		}
		Logger log = new Logger();
		log.log();
	}

	class CustomerInfo {
		private String name;
		private String sdt;

		public CustomerInfo(String name, String sdt) {
			this.name = name;
			this.sdt = sdt;
		}

		public void printInfo() {
			System.out.println("Khách hàng: " + name + " - " + sdt);
			System.out.println("Trạng thái đơn hàng: " + status.getDescription());
		}

	}

	public static class DiscountHelper {
		public static double calculateDiscount(OrderStatus status) {
			if (status == OrderStatus.SHIPPED) {
				return 10.0;
			} else if (status == OrderStatus.DELIVERED || status == OrderStatus.CANCELLED) {
				return 0.0;
			} else {
				return 5.0;
			}
		}
	}

}
