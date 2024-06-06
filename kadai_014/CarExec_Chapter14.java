package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		// 車クラスのインスタンスを作成
		Car_Chapter14 car = new Car_Chapter14(1, 10);

		// 車クラスのgearChangeメソッドを実行
		car.gearChange(3);

		// 車クラスのrunメソッドを実行
		car.run();

	}

}
