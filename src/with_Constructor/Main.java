package with_Constructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
  /*
   * Class constructor
   * 
   */
  public Main(String s) {
    System.out.println("Hello " + s);
  }

  public static void main(String[] args) {
   
    List<String> list = new ArrayList<>();
    list.add("Ali");
    list.add("Maya");
    list.add("David");
    
    list.forEach(Main::new );
    

  }

}
