//Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo e
// todas as informações possíveis sobre ele.

package Ex004DissecandoUmaVariável;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma variável: ");
        String var = ler.next();
        System.out.println("Sua classe é: " + var.getClass());
        System.out.println("Seu tamanho é: " + var.length());
        ler.close();

    }
}
