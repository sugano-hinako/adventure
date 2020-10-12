
public class Hero {
	String name;
	int hp;

	public void departure() {
		System.out.println(name +"は冒険に出発した！");
	}
	public void encount() {
		System.out.println(name + "は敵に遭遇した！");
	}
	public void attack(Enemy e) {
		System.out.print(this.name + "の攻撃！");
	    e.hp -= 5;
	    System.out.println(e.name + "に5ダメージをあたえた!");
	}
	public void run() {
	    System.out.println(this.name + "は逃げ出した！");
	}
	public void miss(Enemy e) {
		System.out.println(name + "は" + e.name + "に逃げられた…");
	}
	public void remaind_hp() {
		System.out.println(name + "の残り体力は" + hp);
	}

}
