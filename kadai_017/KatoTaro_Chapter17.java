package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	//givenNameフィールドに値をセット
	public void setGivenName(String name) {
		givenName = "太郎";
	}

	//eachIntroduceを実装(抽象メソッド)
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}

}
