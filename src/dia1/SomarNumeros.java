import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.println(" digite um segundo numero");
        int numero2 = sc.nextInt();

        int soma = numero + numero2;

        System.out.println(soma);
    }

}