public class Main{
 public static void main(String[]args){
	Hero h = new Hero("勇者");
	Sword s = new Sword("鉄の剣");
	Monster m = new Monster("スライム");

	System.out.println("勇者は" + s.name + "を装備した");
	System.out.println("勇者はスライムと遭遇した");

	while(m.hp >= 0){
		if(h.hp >= 100){
			h.attack(m,s);
			m.attack(h);
		}else if(h.hp <= 100){
			h.Heal();
			m.attack(h);
	}
	}
	System.out.println("勇者のHP：" + h.hp + "スライムのHP：" + m.hp);
 }
}
