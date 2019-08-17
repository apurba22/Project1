package day3ClassNobjects;

public class RunTaskInClass {
    public static void main(String[] args) {
        TaskInClass taskRun = new TaskInClass();

        taskRun.squareValueOfAge();

        int finalage=taskRun.getSquaredAge(2);
        System.out.println("Square value of age1 =" + finalage);
    }
}
