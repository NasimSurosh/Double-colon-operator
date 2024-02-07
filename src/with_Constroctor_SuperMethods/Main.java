package with_Constroctor_SuperMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Test {
  String print(String s) {
    return ("Hello " + s + "\n");
  }
}

public class Main extends Test {

  @Override
  String print(String s) {
    
    
    Function<String, String> fun = super::print;
    
    String newValue = fun.apply(s);
    newValue +="Bye " + s +"\n";
    System.out.println(newValue);
    return newValue;
  
  }
  public static void main(String[] args) {
    
   List<String> list = new ArrayList<>();
   list.add("Bob!");
   list.add("Alica");
   list.add("Charlie");
   list.forEach(new Main()::print);
   

  }

}
