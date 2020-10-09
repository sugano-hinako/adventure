
public class Main {

	public static void main(String[] args) {
		Enemy e = new Enemy();
		SuperHero sh = new SuperHero();

		sh.departure();
		sh.encount(e);
		sh.attack(e);
		e.attack(sh);
		sh.fly();
		sh.attack(e);
		sh.land();
		e.run();
		sh.miss(e);
		sh.remaind_hp();
	}

}
