package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public boolean isAdult() {
    return age >= 18;
  }
  @Override
  public String toString() {
    return "Person name = " + name + ", age = " + age;
  }
  

}

public class Main {
  public static List<Person> filterAdult(List<Person> person, Predicate<Person> predicate){
    /*
     * List<Person> list = new ArrayList<>(); person.forEach(persons ->{ if
     * (predicate.test(persons)) { list.add(persons); } }); return list;
     */
    
    return person.stream()
        .filter(predicate)
        .collect(Collectors.toList());
    
  }
  public static void main(String[] args) {
    
    List<Person> newList = new ArrayList<>();
    newList.add(new Person("Kamya", 15));
    newList.add(new Person("Fried", 31));
    newList.add(new Person("Danyal", 15));
    newList.add(new Person("Katya", 22));
    newList.add(new Person("Alia", 25));
    
    
    
    
    System.out.println("Original list: \n");
    newList.forEach(System.out::println);
    System.out.println("\nFiltered list: ");
    
    List<Person> result = filterAdult(newList, Person::isAdult);
    result.forEach(p -> System.out.println("Name = "+p.getName()+ ", age = " + p.age));

  }

}
