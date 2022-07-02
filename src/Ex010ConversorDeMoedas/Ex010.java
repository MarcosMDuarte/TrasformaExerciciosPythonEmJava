// Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.
// dolar valendo 5.33
package Ex010ConversorDeMoedas;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quanto dinheiro você tem na carteira? R$");
        double reais = ler.nextDouble();
        double dolar = reais/5.33;
        System.out.printf("Com R$%.2f você pode comprar US$%.2f.",reais,dolar);

    }

}
