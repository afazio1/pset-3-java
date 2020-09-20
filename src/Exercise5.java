import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        final double HOMEWORK_WEIGHT = 0.15;
        final double QUIZ_WEIGHT = 0.35;
        final double TEST_WEIGHT = 0.5;

        System.out.print("Homework 1 : ");
        double homework_one = in.nextDouble();
        System.out.print("Homework 2 : ");
        double homework_two = in.nextDouble();
        System.out.print("Homework 3 : ");
        double homework_three = in.nextDouble();
        System.out.print("Quiz 1     : ");
        double quiz_one = in.nextDouble();
        System.out.print("Quiz 2     : ");
        double quiz_two = in.nextDouble();
        System.out.print("Test 1     : ");
        double test_one = in.nextDouble();

        double homework_grade = ((homework_one + homework_two + homework_three) / 3) * HOMEWORK_WEIGHT;
        double quiz_grade = ((quiz_one + quiz_two) / 2) * QUIZ_WEIGHT;
        double test_grade = test_one * TEST_WEIGHT;

        double final_grade = homework_grade + quiz_grade + test_grade;

        System.out.print("\n" + decimalFormat.format(final_grade) + "%.");
    }
}
