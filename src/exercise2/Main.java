package exercise2;

@FunctionalInterface
interface CarFactory {
  Car create(String make, String model, int year);
}

class Car {
  String make;
  String model;
  int year;

  public Car(String make, String model, int year) {
    super();
    this.make = make;
    this.model = model;
    this.year = year;
  }

  @Override
  public String toString() {
    return "Car make = " + make + ", model = " + model + ", year = " + year;
  }

}

public class Main {
  public static Car createCar(CarFactory factory, String make, String model, int year) {
    return factory.create(make, model, year);
    
  }

  public static void main(String[] args) {
    
    CarFactory carFactory = Car::new;
    Car car = Main.createCar(carFactory, "BMW", "2022LM", 2023);
    System.out.println(car + "\n ");
    Car car1 = Main.createCar(carFactory, "VW", "LB2020", 2022);
    System.out.println(car1);

  }

}
