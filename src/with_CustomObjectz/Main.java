package with_CustomObjectz;

import java.util.ArrayList;
import java.util.List;

class Person{
  String name;
  Person(String name){
    this.name = name;
  }
  void someMethod() {
    System.out.println(this.name);
  }
}

public class Main {
  /*
   * Custom Objects:
   * syntax (ClassName:: methodName)
   */

  public static void main(String[] args) {
    
    List<Person> list = new ArrayList<>();
    list.add(new Person("Bob"));
    list.add(new Person("Ali"));
    list.add(new Person("Ahmad"));
    
    list.forEach(Person::someMethod);

  }

}
