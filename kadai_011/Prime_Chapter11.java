package kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] args) {
		
		boolean[] primeNumber = new boolean[101];
		
		for( int i = 1; i < primeNumber.length ; i++ ) {
			primeNumber[i] = true;
		}
		
		int divideNumber = 2;
		
		while( divideNumber < primeNumber.length ) {
			for( int i = divideNumber + 1; i < primeNumber.length; i++ ) {
				if( i % divideNumber == 0 ) {
					primeNumber[i] = false;
					continue;
				}
			}
			divideNumber += 1;
		}
		
		for( int i = 2; i < primeNumber.length ; i++ ) {
			if( primeNumber[i] ) {
				System.out.println(i);
			}
		}

	}

}
