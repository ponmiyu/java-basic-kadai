package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		Jyanken_Chapter24 janken = new Jyanken_Chapter24();

		String myChoice = janken.getMyChoice();
		String pcChoice = janken.getRandom();
		janken.playGame(myChoice, pcChoice);

	}

}
