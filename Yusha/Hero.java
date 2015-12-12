public class Hero{
	String name;
	int hp;
	int mp;
	final int Max_HP = 200;
	final int MAX_MP = 50;

 Hero(String name){
	this.hp = 200;
	this.mp = 50;
	this.name = name;
 }

 void attack(Monster m, Sword s){
	System.out.println(name + "の攻撃");
	int r = new java.util.Random().nextInt(100);
	int damage = s.attack + r;
	System.out.println(m.name + "は、" + damage + "のダメージを受けた");
	m.hp -= damage;
	
 }
 void Heal(){
	System.out.println
		(this.name + "はヒールを唱えた。HPが50ポイント回復！");
	this.hp += 50;
 }
}
