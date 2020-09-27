import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.print("Wage      : ");
        double hourlyWage = in.nextDouble();
        System.out.print("Monday    : ");
        double mondayHours = in.nextDouble();
        System.out.print("Tuesday   : ");
        double tuesdayHours = in.nextDouble();
        System.out.print("Wednesday : ");
        double wednesdayHours = in.nextDouble();
        System.out.print("Thursday  : ");
        double thursdayHours = in.nextDouble();
        System.out.print("Friday    : ");
        double fridayHours = in.nextDouble();
        System.out.print("Saturday  : ");
        double saturdayHours = in.nextDouble();
        System.out.print("Sunday    : ");
        double sundayHours = in.nextDouble();

        double totalHours = mondayHours + tuesdayHours + wednesdayHours
                + thursdayHours + fridayHours + saturdayHours + sundayHours;

        double weeklySalary = totalHours * hourlyWage;
        System.out.print("\n$" + decimalFormat.format(weeklySalary) + ".");
    }
}
