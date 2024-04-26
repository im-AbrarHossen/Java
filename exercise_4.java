import java.util.Scanner;
public class exercise_4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        if((num % 5 == 0) && (num % 11 == 0)){
            System.out.print("Number is divisible by 5 and 11");
        }
        else{
            System.out.print("Number is not divisible by 5 and 11");
        }
    }
}
