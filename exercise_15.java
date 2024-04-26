import java.util.Scanner;
public class exercise_15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        if((side1 + side2) > side3){
            if((side2 + side3) > side1){
                if((side1 + side3) > side2){
                    System.out.println("Triangle is valid.");
                }
                else{
                    System.out.println("Triangle is not valid.");
                }
            }
            else{
                System.out.println("Triangle is not valid.");
            }
        }
        else{
            System.out.println("Triangle is not valid.");
        }
    }
}