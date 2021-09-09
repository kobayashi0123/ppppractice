package code9_1;

public class Hero {
	String name;
	int hp;//属性
	Sword sword;
	
	public Hero(String name) {
		this.hp=100;
		this.name=name;
		this.sword.name="剣";
	}
	public Hero() {
		this("ダミー");
		this.hp=100;
	}
	
	public void attack() {
		System.out.println(this.name+"は、攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	public void sleep() {//操作
		this.hp=100;
		System.out.println(this.name+"は、眠って回復した！");
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip() {
		this.hp-=5;
		System.out.println(this.name+"は、転んだあ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name+"は、逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}
}
