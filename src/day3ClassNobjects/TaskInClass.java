package day3ClassNobjects;

public class TaskInClass {

    int age=5;
    public void squareValueOfAge(){
        System.out.println("Square value of age =" + Math.pow(age, 2));

    }

    public int getSquaredAge (int age1) {
        int squaredAge = age1 * age1;

        return squaredAge;

    }
}
