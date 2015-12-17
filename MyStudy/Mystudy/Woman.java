public class Woman{
	String name;
	int jp;

 Woman(String name){
	this.jp = 100;
}

 void present(Man m){
	if(m.p == 1){
		System.out.println(m.name + "君、ありがとう！！");
		m.koukando += 10;
	}else if(m.p == 2){
		System.out.println("いらないわ");
		m.koukando -= 10;
	}else if(m.p != 1 && m.p != 2){
		System.out.println("ぴーや");
	 }
	}
}
