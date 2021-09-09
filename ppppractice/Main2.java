package code8_1;

public class Main2 {
	public static void main(String[]ager) {
	//1.勇者を生成
		Hero h=new Hero();
	//2.フィールドに初期値をセット
		h.name="ミナト";
		System.out.println("勇者"+h.name+"を生み出しました!");
		System.out.println("勇者のHP "+h.hp);
	//3.勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		Matango m1=new Matango();
		m1.hp=50;
		m1.suffix='A';
		
		Matango m2=new Matango();
		m2.hp=48;
		m2.suffix='B';
				
		//冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
	}
}
