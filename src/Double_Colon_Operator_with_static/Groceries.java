package Double_Colon_Operator_with_static;

import java.util.ArrayList;
import java.util.List;

public class Groceries {

  /*
   * The double colon (::) operator is a special lambda expression.
   * This operator is also known as method reference operator.
   * 
   * Where can we use the double colon operator?
   * - static methods,
   * - instance methods,
   * - constractors.
   * 
   * - syntax: (className:: mthodName) 
   */
  public static void items(String s) {
    System.out.print(s +" ");
  }
  
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Milk");
    list.add("Rice");
    list.forEach(Groceries::items);
   

  }
  

}
