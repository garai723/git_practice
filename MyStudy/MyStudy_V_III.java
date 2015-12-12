public class MyStudy_V_III { 
  public static void main(String[] args){
    double TriangleArea = calcTriangleArea(10.0, 5.0);
	System.out.println("三角形の面積" + TriangleArea + "平方cm");
    double CircleArea = calcCircleArea(5.0);
	System.out.println("円の面積" + CircleArea + "平方cm");
  }
  public static double calcTriangleArea(double bottom, double height){
	double area = bottom * height / 2;
	return area;
 }
  public static double calcCircleArea(double radius){
	double area = radius * radius * 3.14;
	return area;
 }
}