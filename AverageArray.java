import java.util.Scanner;
public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        avg = sum / n;
        System.out.printf("The average of the array is: %.2f", avg);
    }
}