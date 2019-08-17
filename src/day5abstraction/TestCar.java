package day5abstraction;

public class TestCar {
    public static void main(String[] args) {
        Car corolla = new Toyota() ;
          corolla.shape();

          Toyota lexus = new Toyota();
          lexus.start();
          lexus.energy();

          MotorCar model3 = new Toyota();
          model3.hybridEngine();
          model3.drive();

        Bus bus = new Toyota();

        }

}
