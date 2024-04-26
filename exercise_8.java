import java.util.Scanner;
public class exercise_8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double result=0.0f;
        System.out.println("WELCOME TO SIMPLE CALCULATOR");
        System.out.println("----------------------------");
        System.out.println("Enter [number 1] [+ - * /] [number 2]");
        double num1 = input.nextDouble();
        char op = input.next().charAt(0);
        double num2 = input.nextDouble();
        switch(op)
        {
            case '+': 
                result = num1 + num2;
                break;
    
            case '-': 
                result = num1 - num2;
                break;
    
            case '*': 
                result = num1 * num2;
                break;
    
            case '/': 
                result = num1 / num2;
                break;
    
            default: 
                System.out.println("Invalid operator");
        }
        System.out.printf("%.2f %c %.2f = %.2f", num1, op, num2, result);
    }
}

