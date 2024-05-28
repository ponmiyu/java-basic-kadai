package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		int userAge = 30;
		int serviceCost = 0;
		
		serviceCost = switch(userAge) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30 -> 3000;
		case 40 -> 4000;
		case 50 -> 5000;
		case 60 -> 6000;
		case 70 -> 7000;
		case 80 -> 8000;
		default -> 500;
		};
		
		System.out.print(userAge + "代の料金は" + serviceCost + "円");

	}

}
