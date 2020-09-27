import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0");


        System.out.print("Students : ");
        int students = in.nextInt();
        System.out.print("Teachers : ");
        int teachers = in.nextInt();
        System.out.print("Capacity : ");
        int capacity = in.nextInt();

        int totalPassengers = students + teachers;
        int buses = totalPassengers / capacity;

        int overflow = totalPassengers % capacity;

        System.out.println("\n" + "Buses required      : " + decimalFormat.format(buses + 1));
        System.out.print("Overflow passengers : " + overflow);
    }
}
