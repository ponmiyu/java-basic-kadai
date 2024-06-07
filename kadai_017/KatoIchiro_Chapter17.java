package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	//givenNameフィールドに値をセット
	public void setGivenName(String name) {
		givenName = "一郎";
	}

	//eachIntroduceを実装(抽象メソッド)
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
