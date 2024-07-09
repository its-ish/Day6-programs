import java.util.Scanner;
public class ThirdArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr2[j]) {
                    arr3[j] = arr[i];
                    System.out.println(arr3[j]);
                }
            }
        }
    }
}