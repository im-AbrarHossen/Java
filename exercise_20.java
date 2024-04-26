import java.util.Scanner;
public class exercise_20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary of an employee: ");
        double basic = input.nextDouble();
        double gross, da, hra;
        if(basic <= 10000){
            da  = basic * 0.8;
            hra = basic * 0.2;
        }
        else if(basic <= 20000){
            da  = basic * 0.9;
            hra = basic * 0.25;
        }
        else{
            da  = basic * 0.95;
            hra = basic * 0.3;
        }
        gross = basic + hra + da;
        System.out.printf("GROSS SALARY OF EMPLOYEE = %.2f", gross);
    }
}
