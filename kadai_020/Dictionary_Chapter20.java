package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	public void fruitsDictionary(String[] words) {

		HashMap<String, String> fruitsMap = new HashMap<String, String>();

		String fruit = "";

		fruitsMap.put("apple", "りんご");
		fruitsMap.put("peach", "桃");
		fruitsMap.put("banana", "バナナ");
		fruitsMap.put("lemon", "レモン");
		fruitsMap.put("pear", "梨");
		fruitsMap.put("kiwi", "キウィ");
		fruitsMap.put("strawberry", "いちご");
		fruitsMap.put("grape", "ぶどう");
		fruitsMap.put("muscat", "マスカット");
		fruitsMap.put("cherry", "さくらんぼ");

		for (int i = 0; i < words.length; i++) {
			fruit = fruitsMap.get(words[i]);
			if (fruit == null) {
				System.out.println(words[i] + "は辞書に存在しません");
			} else {
				System.out.println(words[i] + "の意味は" + fruit);
			}

		}
	}

}
