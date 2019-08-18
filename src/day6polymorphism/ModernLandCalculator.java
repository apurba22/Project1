package day6polymorphism;

public class ModernLandCalculator extends LandCalculator {

    @Override
    public int areaOfLand(int a, int b, int c){
        int total = a+b+c-1;
        return total;
    }
}
