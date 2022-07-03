package Ex015AluguelDeCarros;

import java.util.Scanner;

//Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
// quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro
// custa R$60 por dia e R$0,15 por Km rodado.
public class Ex015 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantos dias alugados? ");
        double dias = ler.nextDouble();
        System.out.print("Quantos Km rodados? ");
        double km = ler.nextDouble();
        double precoDias = dias*60;
        double precoKm = km*0.15;
        double total = precoDias + precoKm;
        System.out.printf("O total a pagar é de R$%.2f",total);
    }

}
