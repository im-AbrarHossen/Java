import java.util.Scanner;
public class exercise_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        if(num > 0){
            System.out.println("Number is POSITIVE");
        }
        else if(num < 0){
            System.out.print("Number is NEGATIVE");
        }
        else if(num == 0){
            System.out.print("Number is ZERO");
        }
        else{
            System.exit(0);
        }
    }
}
