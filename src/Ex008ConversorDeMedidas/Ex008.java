//Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros.
package Ex008ConversorDeMedidas;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um valor em métros: ");
        double metros = ler.nextDouble();
        double centimeros = metros*100;
        double milimetros = metros*1000;
        System.out.printf("%.0fm corresponde a: %.0fcm e %.0fmm",metros, centimeros,milimetros);

    }
}
