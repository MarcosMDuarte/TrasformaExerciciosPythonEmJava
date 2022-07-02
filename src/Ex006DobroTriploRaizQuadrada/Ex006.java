// Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.
package Ex006DobroTriploRaizQuadrada;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro para saber seu dobro, seu tripo e sua raiz quadrada: ");
        int numero = ler.nextInt();
        int dobro = numero*2;
        int triplo = numero*3;
        double quadrado = Math.sqrt(numero);

        System.out.println("Seu dobro é " + dobro );
        System.out.println("Seu triplo é " + triplo );
        System.out.println("Sua raiz quadrada é: " + quadrado);


    }
}
