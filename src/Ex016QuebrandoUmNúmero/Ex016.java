package Ex016QuebrandoUmNúmero;
// Crie um programa que leia um número Real qualquer pelo teclado e mostre na tela a sua porção Inteira.

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float num = ler.nextFloat();
        System.out.printf("O número %f tem a parte inteira %.0f",num,num);
    }
}
