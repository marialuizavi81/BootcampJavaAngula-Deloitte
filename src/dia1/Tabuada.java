package dia1;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            int tabuada = numero1 * i;
            System.out.println(  numero1 +" X " + i +" = " +tabuada);

        }
    }
}
