public class Video78 {
	public static void main(String[] args) {
		Car myCar = new Car("Mercerdes");
		Bus myBus = new Bus("Vinfast");
		Motorbike myMotorbike = new Motorbike("Honda");
//		Vehicle[] phuongTien = new Vehicle[3];
//		phuongTien[0] = myCar;
//		phuongTien[1] = myBus;
//		phuongTien[2] = myMotorbike;
		Vehicle[] phuongTien = { myCar, myBus, myMotorbike };
		for (Vehicle vehicle : phuongTien) {
			vehicle.start();
		}
	}
}
