package kadai_017;

abstract public class Kato_Chapter17 {
	//フィールド
	public String familyName = "加藤"; //姓
	public String givenName = ""; //名
	public String address = "東京都中野区○×"; //住所

	//メソッド
	public void commonlntroduce() {
		System.out.println(familyName);
		System.out.println(address);
	}

	abstract public void eachIntroduce();

	public void execlntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		eachIntroduce();
	}

}
