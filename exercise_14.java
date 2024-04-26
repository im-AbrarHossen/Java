import java.util.Scanner;
public class exercise_14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three angles of triangle: ");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();
        int sum = angle1 + angle2 + angle3;
        if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("Triangle is valid.");
        }
        else{
            System.out.println("Triangle is not valid.");
        }
    }
}