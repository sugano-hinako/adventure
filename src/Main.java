
public class Main {

	public static void main(String[] args) {
		//勇者を生成
		Hero h = new Hero();
		h.name = "スラリン";
		h.hp = 100;

		 //敵を生成
		Enemy m1 = new Enemy();
		m1.hp = 50;
		m1.suffix = 'A';
		Enemy m2 = new Enemy();
		m2.hp = 48;
		m2.suffix = 'B';

		//冒険スタート
		m1.sing();
		m2.sleep();
		h.slip();
		m2.bound();
		m1.run();
		m2.run();
		h.run();

	}

}
