import java.util.Scanner;

public class exercise_17{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values of a, b, c of quadratic equation (aX^2 + bX + c): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double root1,root2;
        double discriminant = (b * b) - (4 * a * c);
        if(discriminant > 0){
            root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.printf("Two distinct and real roots exists: %.5f and %.5f", root1, root2);
        }
        else if(discriminant == 0){
            root1 = root2 = -b / (2 * a);
            System.out.printf("Two equal and real roots exists: %.5f and %.5f", root1, root2);
        }
        else if(discriminant < 0){
            root1 = root2 = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Two distinct complex roots exists: %.2f + i%.2f and %.2f - i%.2f", root1, imaginary, root2, imaginary);
        }

    }
}
