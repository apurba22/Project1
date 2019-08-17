package day5abstraction;

public abstract class MotorCar implements Bus {
    public void drive(){
        System.out.println("Car must be able to drive");
    }
    public  abstract void hybridEngine();

}
