package day5abstraction;

public class Toyota extends MotorCar implements Car {

    public void shape(){
        System.out.println("Car shape must be small");
    }

    public void start(){
        System.out.println("Car must have start method");
    }

    public void stop(){
        System.out.println("Car must have break system");
    }
 public void energy(){
     System.out.println("Car run by ");

 }
  public  void hybridEngine(){
      System.out.println("Car consume less fuel");
  }
}
