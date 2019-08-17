package homeWork;

public class RunMyLife {
    public static void main(String[] args) {

         MyLife myLifeRun = new MyLife();

      System.out.println("Roll Number:" + myLifeRun.rollNum);

      System.out.println("Monthly Salary:" + "$" + myLifeRun.salaryMonthly);

      System.out.println("First letter of name:" + myLifeRun.myNameFirstLetter);

      System.out.println("Home Work done:" + myLifeRun.didHomeWork);

      System.out.println("My name:"+ myLifeRun.myName);

      myLifeRun.classRoom();

      myLifeRun.getMyHeight();
      myLifeRun.myBreakfast();
    }
}
