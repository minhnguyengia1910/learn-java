package chapter9.video90;

public enum OrderStatus {
	PENDING("Chờ xác nhận"), SHIPPED("Đang giao hàng"), DELIVERED("Đã giao"), CANCELLED("Đã hủy");

	private final String description;

	private OrderStatus(String description) {
		this.description = description;

	}

	public String getDescription() {
		return this.description;
	}

	public boolean hasFinal() {
		if (this == DELIVERED || this == CANCELLED) {
			return true;
		} else {
			return false;
		}
	}
}
