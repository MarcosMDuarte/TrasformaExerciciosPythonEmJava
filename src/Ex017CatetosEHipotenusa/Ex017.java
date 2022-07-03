package Ex017CatetosEHipotenusa;

import java.util.Scanner;

//Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo.
// Calcule e mostre o comprimento da hipotenusa.
public class Ex017 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Comprimento do cateto oposto: ");
        float oposto = ler.nextFloat();
        System.out.print("Comprimento do cateto adjacente: ");
        float adjacente = ler.nextFloat();
        double hipotenusa = Math.sqrt(((Math.pow(oposto,2)) + (adjacente*adjacente)));
        System.out.printf("A hipotenusa vai medir %.2f.",hipotenusa);
    }
}
