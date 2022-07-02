//Exercício Python 3: Crie um programa que leia dois números e mostre a soma entre eles.

package Ex003SomandoDoisNúmeros;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n1 = ler.nextInt();
        System.out.print("Digite um número outro inteiro: ");
        int n2 = ler.nextInt();
        int soma = n1 + n2;
        System.out.printf("Os número digitados foram %d e %d. A soma tem o resultado %d.",n1,n2,soma);


    }
}
