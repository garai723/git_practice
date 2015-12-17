public class Main{
 public static void main(String[]args){
	Man m = new Man("太郎");
	Woman w = new Woman("花子");

	m.present(w);
	w.present(m);
 }
}
