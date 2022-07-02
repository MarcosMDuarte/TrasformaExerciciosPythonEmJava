// Faça um programa que leia um número Inteiro e mostre na tela o seu sucessor e seu antecessor.
package Ex005AntecessorESucessor;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = ler.nextInt();
        System.out.printf("Você digitou o número %d, seu antecessor é %d e seu sucessor é %d.", numero, numero-1, numero+1);
    }
}
