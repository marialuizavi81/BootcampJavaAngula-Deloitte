package dia1;
import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int Num = sc.nextInt();

        if (Num % 2 == 0) {
            System.out.println("o numero "+Num+" é par ");
        } else {
            System.out.println("o numero "+Num+" é impar");
        }
    }
}