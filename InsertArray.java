import java.util.Scanner;
public class InsertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int position = sc.nextInt();
        int element = sc.nextInt();
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < n; i++) {
            if(i == position){
                newArr[i] = element;
            }
        }
    }
}