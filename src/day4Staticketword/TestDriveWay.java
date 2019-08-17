package day4Staticketword;

public class TestDriveWay {
    public static void main(String[] args) {

        // Non Static method
        // have to call with Object
        Driveway tasfiDriveway = new Driveway();
        tasfiDriveway.setDriveWaySize(10);
        System.out.println("Tasfi drive way size : " +
                tasfiDriveway.getDriveWaySize() );

        Driveway dionDriveway = new Driveway();
        dionDriveway.setDriveWaySize(12);
        System.out.println("Dion driveway size : " +dionDriveway.getDriveWaySize());

        // because of static the value of tasfi changed to
        // (12) when you creat dion value (12)
        System.out.println("Tasfi drive way size : " +
                tasfiDriveway.getDriveWaySize());

        //   Static method
        // can be called without crearting an object
        Driveway.shapeOfDriveWay();
    }
}
