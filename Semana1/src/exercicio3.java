import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double num = sc.nextInt();
        System.out.println("Digite a segunda nota: ");
        double num2 = sc.nextInt();
        System.out.println("Digite a terceira nota: ");
        double num3 = sc.nextInt();

        double media = (num + num2 + num3) / 3;

        if (media >= 7) {
            System.out.println(" esta aprovado");
        }else if (media <= 4) {
            System.out.println(" esta de reprovado");
        }else if (media <= 6) {
            System.out.println(" esta recuperaçao");
        }
    }
}
