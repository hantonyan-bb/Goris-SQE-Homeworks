import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = input.nextInt();
        number=number*number*(number%2);
        System.out.println(number);
    }
}
