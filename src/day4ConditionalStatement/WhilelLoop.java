package day4ConditionalStatement;

import org.w3c.dom.ls.LSOutput;

public class WhilelLoop {
    public static void main(String[] args) {
        double accountBalance = 550.75;
        double threshold = 50.00;
        double fee = 100.00;
        String message = "Your account is low";
        while (accountBalance >threshold){
            System.out.println("User current balance = " + accountBalance);

            accountBalance = accountBalance - fee;
        }
        System.out.println(message);
    }


}
