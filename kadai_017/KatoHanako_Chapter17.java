package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	//givenNameフィールドに値をセット
	public void setGivenName(String name) {
		givenName = "花子";
	}

	//eachIntroduceを実装(抽象メソッド)
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
