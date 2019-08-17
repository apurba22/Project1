package day3ClassNobjects;

public class Car {
    public String carBrand;
    public String carModel;
    public int yearOfModel;
    public double carPrice;
    public boolean carIsUsed;

    public Car() {

        this.carBrand = "Honda";
        this.carModel = "CRV";
        this.yearOfModel = 2016;
        this.carPrice = 2800.85;
        this.carIsUsed = false;
    }

    public Car(String carBrand, String carModel,
               int yearOfModel) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfModel = yearOfModel;
    }

    public Car(String carBrand, String carModel,
               int yearOfModel, double carPrice,
               boolean carIsUsed) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfModel = yearOfModel;
        this.carPrice = carPrice;
        this.carIsUsed = carIsUsed;
    }
    public String getCarBrand(){
        return this.carBrand;
    }
    public  void setCarBrand(String CarBrand){
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public boolean isCarIsUsed() {
        return carIsUsed;
    }

    public void setCarIsUsed(boolean carIsUsed) {
        this.carIsUsed = carIsUsed;
    }
}

