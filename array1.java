import java.util.Arrays;
public class array1 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 29;
        a[1] = 96;
        a[2] = 92;
        System.out.println(a[2]);
        System.out.println(a.length);
        Arrays.sort(a);
        System.out.println(a[2]);
        int[][] final_marks = {{12,85,80},{85,76,91}};  //2D Array
        System.out.println(final_marks[1][2]);
    }
}
