public class Man{
	String name;
	int koukando;
	int p;	

 Man(String name){
	this.koukando = 100;
}
 
 void present(Woman w){
	System.out.println(w.name + "へのプレゼントを選んでください");
	System.out.println("1：花束 2：ムチ");
	int p = new java.util.Scanner(System.in).nextInt();
	if(p == 1){
		System.out.println(w.name + "に花を贈ろう！");
		w.jp += 10;
	}else if(p == 2){
		System.out.println(w.name + "には鞭がお似合いさ");
		w.jp -= 10;
	}else if(p != 1 && p != 2){
		System.out.println("ぴーや");
 	 }
	}

}
