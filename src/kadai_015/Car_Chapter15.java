package kadai_015;

public class Car_Chapter15 {

	// フィールド
	private int gear = 1;
	private int speed = 10;
	
	// コンストラクタ
	public Car_Chapter15( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
	}
	
	// ギアチェンジメソッド
	public void changeGear( final int afterGear ) {
		
		int beforeGear = this.gear;
		this.gear = afterGear;
		
		this.speed = switch( afterGear ) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		 };
		 
		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
	}
	
	// 速度表示メソッド
	public void  run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
}