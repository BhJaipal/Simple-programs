import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        System.out.print("Enter limit: ");
        primeNums(new Scanner(System.in).nextInt());
    }
    static void primeNums(int num) {
        int zeros;
        for (int i=2; i<= num; i++) {
            zeros= 0;
            for (int j = 2; j<=i/2; j++) {
                if (i%j == 0) {
                    zeros++;
                }
            }
            if (zeros == 0) {
                System.out.println(i);
            }
        }
    }
}
