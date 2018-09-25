public class QuadraticEquations {
    public static void main (String[] args) {
        int a = 1, b = -8, c = 12; // a cant be 0
        int discriminant = (b * b) - (4 * a * c);
        int divisor = (2 * a);
        if (discriminant > 0) {
            double firstX = (-b + Math.sqrt(discriminant)) / divisor;
            double secondX = (-b - Math.sqrt(discriminant)) / divisor;
            System.out.println("first x = " + firstX + "  second x = " + secondX);
        } else if (discriminant == 0) {
            double valueOfX = (-b + Math.sqrt(discriminant)) / divisor;
            System.out.println(valueOfX);
        } else {
            System.out.println("There is no x value");
        }
    }
}