import java.util.Scanner;
public class Homework {
public static void main(String args[]) {
Scanner input  = new Scanner(System.in);
System.out.print("Input numbers");
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();
double D =  Math.pow(b, 2) - 4 * a * c;
if (D>0) {
double x1 = (- b + Math.pow(D , 0.5)) / (2 * a);
double x2 = (- b - Math.pow(D , 0.5)) / (2 * a);
System.out.println("Havasarumn uni erku armat x1 ev x2 "  + x1 +  " and "  + x2);
}
else if (D == 0.0) {
double x1 = (-b) / (2 * a);
System.out.println("Havasarumn uni mek armat: " + x1);
}
else 
System.out.println("Havasarumn armat chuni");
}
}
