package day4Staticketword;

public class Driveway {

    // Static Mothod
    public static int driveWaySize;

    //Non Static Method
    public void setDriveWaySize(int driveWaySize){
        this.driveWaySize = driveWaySize;

    }
    //Non Static Method
    public int getDriveWaySize(){
        return  driveWaySize;
    }
    //Static Method
    //You can call stATIC method without creating an object
    public static void  shapeOfDriveWay(){
        System.out.println("Shape of drive way is rectangular");
    }
}

