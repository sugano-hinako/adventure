//test
public class Main {

	public static void main(String[] args) {
		//敵を生成
		Enemy e = new Enemy("▼ももんじゃ", 50);
		Enemy aniki = new Enemy("▼アニキ", 80);
		Enemy buka = new Enemy("▼ブッカ", 30);
		//主人公を生成
		SuperHero sh = new SuperHero("▽スラリン", 100);

		sh.departure();
		sh.encount();
		aniki.attack(sh);
		sh.attack(e);
		sh.attack(aniki);
		sh.attack(buka);
	}

}
