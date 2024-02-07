package with_InstanceMethod;

import java.util.ArrayList;
import java.util.List;

/*
 * Instance method:
 * syntax(objectOfClass::methodName
 */

public class Car {
  void brands(String s) {
    System.out.println(s + " ");
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Valvo");
    list.add("BMW");
    list.add("Mercedes");

    list.forEach(new Car()::brands);

  }

}
