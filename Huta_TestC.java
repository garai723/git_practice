public class Huta_TestC { 
  public static void main(String[] args){
	System.out.println("名前を入力してください");
	String name = new java.util.Scanner(System.in).nextLine();
	System.out.println("進捗率を入力してください");
	double a = new java.util.Scanner(System.in).nextInt();
	System.out.println(name + "の現在の進捗率：" + sintyoku(a));
	
  }

  public static double sintyoku(double a){
	double genki = 100.0 - a;
	return genki;
 }
}