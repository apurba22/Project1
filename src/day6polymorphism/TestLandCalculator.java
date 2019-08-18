package day6polymorphism;

public class TestLandCalculator {
    public static void main(String[] args) {
        LandCalculator cal = new LandCalculator();
        int resultOfLine = cal.areaOfLand(10,15);
        System.out.println(resultOfLine);
        int resultOfTriangle = cal.areaOfLand(10,15,12);
        System.out.println(resultOfTriangle);

        ModernLandCalculator mCal = new ModernLandCalculator();
        int resultOfModernTriangle = mCal.areaOfLand(10,15,12);
        System.out.println(resultOfModernTriangle);

        int resultOfTriangleAfter = cal.areaOfLand(10,15,12);
        System.out.println(resultOfTriangleAfter);


    }
}
