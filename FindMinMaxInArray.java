import java.util.Random;
public class FindMinMaxInArray{
    public static void main(String[] args){
        int[] numbers = generateRandomArray(100);
        int minValue = findMinValue(numbers);
        int minIndex = findMinIndex(numbers);
        int maxValue = findMaxValue(numbers);
        int maxIndex = findMaxIndex(numbers);
        System.out.println("Generated Array:");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Minimum Value: " + minValue);
        System.out.println("Minimum Value Index: " + minIndex);
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Maximum Value Index: " + maxIndex);
    }
    public static int[] generateRandomArray(int size){
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++){
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }
    public static int findMinValue(int[] arr){
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static int findMinIndex(int[] arr){
        int minIndex = 0;
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMaxValue(int[] arr){
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static int findMaxIndex(int[] arr){
        int maxIndex = 0;
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}