
public class Enemy {
	int hp;
	final int LEVEL = 10;
	char suffix;
	public void run() {
		System.out.println("ももんじゃ" + this.suffix + "は逃げ出した！");
	}
	public void bound() {
		System.out.println("ももんじゃ"+ this.suffix + "は驚いて飛び跳ねた！");
	}
	public void sing() {
		System.out.println("ももんじゃ"+ this.suffix + "は歌っている");
	}
	public void sleep() {
		System.out.println("ももんじゃ"+ this.suffix + "は鼻ちょうちんを作って寝ているzzZ");
	}

}
