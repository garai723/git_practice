public class Monster{
	int hp = 100;
	String name;

  Monster(String name){
	this.name = name;
 }

  void attack(Hero h){
	System.out.println("モンスター" + name + "の攻撃");
	int damage = new java.util.Random().nextInt(101);
	System.out.println
		(h.name + "は、" + damage + "ポイントのダメージを受けた" );
	h.hp -= damage;
 }
}
