import java.util.Scanner;
import java.text.DecimalFormat;


public class Exercise4 {
    public static void main(String[] args) {
        final double INCH_TO_CENTIMETER = 2.54;

        Scanner in = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.print("Height : ");
        float height = (float) (in.nextFloat() * INCH_TO_CENTIMETER);
        System.out.print("Width  : ");
        float width = (float) (in.nextFloat() * INCH_TO_CENTIMETER);

        float perimeter = (2 * height) + (2 * width);

        System.out.println("\n" + decimalFormat.format(perimeter) + " centimeters.");
        in.close();
    }
}
