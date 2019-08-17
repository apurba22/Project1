package day3ClassNobjects;

import org.w3c.dom.ls.LSOutput;

public class RunCar {
    public static void main(String[] args) {

        Car runCar = new Car();

        System.out.println(runCar.carBrand);
        System.out.println(runCar.carModel);
        System.out.println(runCar.yearOfModel);
        System.out.println(runCar.carPrice);
        System.out.println(runCar.carIsUsed);

    Car apurbasCar = new Car("Toyota",
            "RAV 4 ",2020);
        System.out.println(apurbasCar.carBrand);
        System.out.println(apurbasCar.carModel);
        System.out.println(apurbasCar.yearOfModel);

        //getter and setter function
        Car mercedes = new Car("Mercedes","G55",2020,50000,false);

        String mercedesModel = mercedes.getCarModel();
        System.out.println("The mercedes model is" + mercedesModel);

        mercedes.setCarModel("AGM");
        System.out.println(mercedes.getCarModel());




    }
    }
