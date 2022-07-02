// Faça um programa que leia um número Inteiro qualquer e mostre na tela a sua tabuada.
package Ex009Tabuada;

import java.util.Scanner;
import java.util.SortedMap;

public class Ex009 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada de 10: ");
        int num = ler.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.printf(num + " x " + i + " = " + num*i + "\n" );
        }
    }

}
