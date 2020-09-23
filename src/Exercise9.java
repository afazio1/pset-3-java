import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Amount : ");
        double amount = in.nextDouble();

        amount = amount * 100;

        int quarters = (int) amount / 25;
        int leftover = (int) (amount % 25);
        int dimes = leftover / 10;
        leftover = leftover % 10;
        int nickels = leftover / 5;
        leftover = leftover % 5;
        int pennies = leftover;

        System.out.println("\nQuarters : " + quarters);
        System.out.println("Dimes    : " + dimes);
        System.out.println("Nickels  : " + nickels);
        System.out.print("Pennies  : " + pennies);

    }
}
