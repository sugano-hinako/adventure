
public class Hero {
	String name = "スラリン";  //名前の宣言
	int hp = 100;       //体力の宣言

	/*public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}*/
	public void departure() {
		System.out.println(name +"は冒険に出発した！");
	}
	public void encount(Enemy e) {
		System.out.println(name + "は" + e.name + "に遭遇した！");
	}
	public void attack(Enemy e) {
		System.out.print(this.name + "の攻撃！");
	    e.hp -= 5;
	    System.out.println("5ダメージをあたえた!");
	}
	public final void slip() {
	    this.hp -= 5;
	    System.out.println(this.name + "は転んだ!");
	    System.out.println("5ダメージ");
	  }
	public void run() {
	    System.out.println(this.name + "は逃げ出した！");
	}
	public void miss(Enemy e) {
		System.out.println("▼" + name + "は" + e.name + "に逃げられた…");
	}
	public void remaind_hp() {
		System.out.println("▼" + name + "の残り体力は" + hp);
	}

}
