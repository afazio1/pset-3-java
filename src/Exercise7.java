import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.print("Salary  : ");
        double salary = in.nextDouble();
        System.out.print("401(k)  : ");
        double tax401k = in.nextDouble() / 100;
        System.out.print("Federal : ");
        double federal = in.nextDouble() / 100;
        System.out.print("State   : ");
        double state = in.nextDouble() / 100;
        double finalSalary = salary - (salary * tax401k);
        finalSalary = finalSalary - (finalSalary * (federal + state));

        double biWeeklySalary = finalSalary / 24;

        System.out.println("\n$" + decimalFormat.format(biWeeklySalary) + ".");
        in.close();

    }
}
