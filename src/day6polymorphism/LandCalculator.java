package day6polymorphism;

public class LandCalculator {
    public int areaOfLand(int a, int b){
        int total = a+b;
        return total;
    }
    // OverLoad
    public  int areaOfLand(String a, int b){
        int total = b;
        return total;
    }
    public int areaOfLand(int a, int b, int c){
        int total = a+b+c;
        return total;
    }
    public int areaOfLand (int a, int b, int c, int d){
        int total = a+b+c+d;
        return total;
    }
}
