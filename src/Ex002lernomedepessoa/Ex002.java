//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.

package Ex002lernomedepessoa;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: " );
        String nome = ler.next();
        System.out.println("Seja bem vindo(a) " + nome);
        ler.close();

    }
}
