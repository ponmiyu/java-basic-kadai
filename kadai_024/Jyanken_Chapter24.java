package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = scanner.next();

			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();
				return input;
			} else {
				System.out.println("入力エラー　再度入力してください。");
			}
		}

	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] hand = { "r", "s", "p" };
		String pcHand = hand[(int) Math.floor(Math.random() * 3)];
		return pcHand;
	}

	//じゃんけんを行う
	public void playGame(String myChoice, String pcChoice) {
		HashMap<String, String> playMap = new HashMap<String, String>();

		playMap.put("r", "グー");
		playMap.put("s", "チョキ");
		playMap.put("p", "パー");

		System.out.println("自分の手は" + playMap.get(myChoice) + ",対戦相手の手は" + playMap.get(pcChoice));

		if (myChoice.equals(pcChoice)) {
			System.out.println("あいこです");
		}

		else if ((myChoice.equals("r") && pcChoice.equals("s")) || (myChoice.equals("s") && pcChoice.equals("p"))
				|| (myChoice.equals("p") && pcChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		}

		else {
			System.out.println("自分の負けです");
		}

	}

}
