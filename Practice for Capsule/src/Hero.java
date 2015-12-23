
public class Hero {
	private String name;
	int hp;
	static int money;

	Hero(String name){
		this.hp = 100;
		this.money = 1000;
	}

	public String getName(){
		return this.name;
	}

	public void bye(){
		System.out.println("He said Bye");
	}

	private void die(){
		System.out.println("He is dead");
		System.out.println("Game Over");
	}
}
