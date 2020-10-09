
public class Enemy {
	String name ="ももんじゃ";
	int hp = 50;
	final int LEVEL = 10;
	char suffix;

	public void attack(SuperHero sh) {
		System.out.print(this.name + "の攻撃！");
		sh.hp -= 5;
		System.out.println("5ダメージをうけた!");
	}
	public void remaind_hp() {
		System.out.println("▼" + name + "の残り体力は" + hp);
	}
	public void run() {
		System.out.println(name + this.suffix + "は逃げ出した！");
	}

}