import java.util.Scanner;
import java.util.Arrays;
public class SortStudentsByScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        String[] studentNames = new String[numStudents];
        double[] studentScores = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = input.next();
            System.out.print("Enter the score of student " + (i + 1) + ": ");
            studentScores[i] = input.nextDouble();
        }
        sortStudentsByScore(studentNames, studentScores);
        System.out.println("\nStudents in decreasing order of scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentNames[i] + ": " + studentScores[i]);
        }
        input.close();
    }
    public static void sortStudentsByScore(String[] names, double[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] < scores[j]) {
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
    }
}