package Ex013ReajusteSalarial;

import java.util.Scanner;
//Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento.
public class Ex013 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual o Salário do Funcionário? R$");
        double salario = ler.nextDouble();
        double aumento = salario+salario*0.15;
        System.out.printf("Um funcionário que ganhava R$%.2f, com 15 por cento de aumento, passa a receber R$%.2f.",salario,aumento);
    }
}
