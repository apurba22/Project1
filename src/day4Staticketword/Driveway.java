package day4Staticketword;

public class Driveway {

    //Static method
    public static int driveWaySize;

    //Non-static method
    public void setDriveWaySize(int driveWaySize){
        this.driveWaySize = driveWaySize;

    }
    //Non-static method
    public int getDriveWaySize(){
        return  driveWaySize;
    }
    //Static method
    //You can call static method without creating an object
    public static void  shapeOfDriveWay(){
        System.out.println("Shape of drive way is rectangular");
    }
}

