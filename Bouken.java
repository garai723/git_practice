public class Bouken{
  public static void main(String[]args){
                //make hero
        Hero h = new Hero();
                //set status
        h.name = "勇者";
        h.hp = 100;
        System.out.println(h.name + "を生み出しました！");
                //use methods of Hero
        h.sit(25);
        h.slip();
        h.sleep();
        h.slip();
        h.run();
 }
}

                                                                                    
