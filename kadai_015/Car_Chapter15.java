package kadai_015;

public class Car_Chapter15 {
	private int gear	= 1;
	private int speed	= 10;
	
	public Car_Chapter15(int gear, int speed) {
		this.gear 	= gear;
		this.speed 	= speed;
//		System.out.println("現在のギア：" + this.gear);
//		System.out.println("現在のスピード：" + this.speed);
	}
	
	public void changeGear(int afterGear) {
		switch(afterGear) {
		case 1:
			this.speed	= 10;
			break;
		case 2:
			this.speed	= 20;
			break;
		case 3:
			this.speed	= 30;
			break;
		case 4:
			this.speed	= 40;
			break;
		case 5:
			this.speed	= 50;
			break;
		default:
			this.speed	= 10;
		}
		
	}
	
	public void run() {
		System.out.println("現在のギアは：" + this.gear + "速");
		System.out.println("現在の速度は：" + this.speed + "km/h");
	}
}
