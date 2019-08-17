package day4;


import java.util.Scanner;

public class quiz3NumbberBigOrSmall {

    public static void compare(int x, int y) {
        if (x == y) {
            System.out.println(x + " Equals to = " + y);
        } else {
            System.out.println(x + " Compare (!=) " + y);
            if (x > y) {
                System.out.println(x + " is greater than > " + y);
            } else {
                System.out.println(x + " is less than < " + y);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number:");
        int x = input.nextInt();
        input.nextLine();
        System.out.print("Input second number:");
        int y = input.nextInt();
        input.nextLine();
        compare(x,y);
    }
}

