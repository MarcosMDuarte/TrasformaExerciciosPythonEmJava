//Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.

package Ex007MediaAritmetica;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = ler.next();
        System.out.print("Quanto você tirou no primeiro trimestre? ");
        double nota1 = ler.nextDouble();
        System.out.print("Quanto você tirou no segundo trimestre? ");
        double nota2 = ler.nextDouble();
        double media = (nota1+nota2)/2;
        System.out.printf("%s, você tirou %.2f no primeiro trimestre e %.2f no segundo. Sua média é %.2f.\n" +
                "",nome, nota1,nota2,media);
        if(media>6){
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Está em recuperção!!!");
        }
    }
}
