package Ex023SeparandoDigitosDeUmNúmero;

import java.util.Scanner;

//Faça um programa que leia um número de 0 a 9999 e mostre na tela cada um dos dígitos separados.
public class Ex023 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = ler.nextInt();
        int u = num % 10;
        int d = num/10 % 10;
        int c = num / 100 % 10;
        int m = num / 1000 % 10;
        System.out.println("Analisando o número " + num);
        System.out.println("Unidade: " + u);
        System.out.println("Dezena: " + d);
        System.out.println("Centena: "+ c);
        System.out.println("Milhar: " + m);


    }
}
