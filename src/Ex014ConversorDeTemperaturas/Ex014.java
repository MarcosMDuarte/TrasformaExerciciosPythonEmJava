package Ex014ConversorDeTemperaturas;

import java.util.Scanner;
//Escreva um programa que converta uma temperatura digitando em graus Celsius e converta para graus Fahrenheit.
public class Ex014 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a temperatura em ºC: ");
        double temperaturaEmC = ler.nextDouble();
        double fahrenheit =  (temperaturaEmC* 9/5) + 32;
        System.out.printf("A temperatura de %.2fºC corresponde a %.2fºF!",temperaturaEmC,fahrenheit);

    }
}
