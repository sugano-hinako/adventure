
public class SuperHero extends Hero{
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println(name +"は飛び跳ねた！");
	}
	public void land() {
		this.flying = false;
		System.out.println(name +"は着地した！");
	}
	public void run() {
		System.out.println(this.name + "は撤退した!");
	}
	public void attack(Enemy e) {
		super.attack(e);
		if(this.flying) {
			super.attack(e);
		}
	}

}
