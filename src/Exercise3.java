import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3 {
    public static void main(String[] args) {
        final double INCH_TO_MILLIMETER = 25.4;

        Scanner in = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.print("Height : ");
        float height = (float) (in.nextFloat() * INCH_TO_MILLIMETER);
        System.out.print("Width  : ");
        float width = (float) (in.nextFloat() * INCH_TO_MILLIMETER);

        float area = height * width;

        System.out.println("\n" + decimalFormat.format(area) + " square millimeters.");
        in.close();
    }
}
