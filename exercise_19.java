import java.util.Scanner;
public class exercise_19{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five subjects marks: ");
        int phy = input.nextInt();
        int chem = input.nextInt();
        int bio = input.nextInt();
        int math = input.nextInt();
        int comp = input.nextInt();
        double per = (phy + chem + bio + math + comp) / 5.0;
        System.out.printf("Percentage = %.2f\n", per);
        if(per >= 90){
            System.out.println("Grade A");
        }
        else if(per >= 80){
            System.out.println("Grade B");
        }
        else if(per >= 70){
            System.out.println("Grade C");
        }
        else if(per >= 60){
            System.out.println("Grade D");
        }
        else if(per >= 40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
