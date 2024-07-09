import java.util.Scanner;
public class PrimeRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = (n%10);
        for (int i = 2; i <= 9; i++) {
            if(temp%1 == 0 && temp%temp==0 && temp%i!=0 ) {
                System.out.println("Prime number");
                break;
            }
            else if(temp==2){
                System.out.println("Prime number");
                break;
            }
            else if(temp%i==0) {
                System.out.println("Not Prime number");
                break;
            }
        }
    }
}