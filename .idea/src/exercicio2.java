import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(" é par ");
        } else {
            System.out.println(" é impar ");
        }
    }
}