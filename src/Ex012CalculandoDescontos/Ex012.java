package Ex012CalculandoDescontos;

import java.util.Scanner;

// Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto.
public class Ex012 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual o preço do produto? R$");
        double preco = ler.nextDouble();
        double desconto = preco-preco*0.05;
        System.out.printf("O produto que custava R$%.2f, na promoção com desconto de 5 por cento vai custar R$%.2f",preco,desconto);

    }
}
