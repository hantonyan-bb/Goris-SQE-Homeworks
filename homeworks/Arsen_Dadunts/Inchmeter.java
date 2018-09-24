import java.util.Scanner;


public class Inchmeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the inch");
        double inch = input.nextDouble();
        double meter = inch * 0.0254;
        System.out.println("The " + inch + "inch = " + meter + " meter");
    }
}
