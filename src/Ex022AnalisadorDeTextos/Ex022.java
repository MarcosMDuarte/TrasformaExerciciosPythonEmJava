package Ex022AnalisadorDeTextos;

import java.util.Scanner;

//Crie um programa que leia o nome completo de uma pessoa e mostre:
// – O nome com todas as letras maiúsculas e minúsculas.
//– Quantas letras ao t odo (sem considerar espaços).
// – Quantas letras tem o primeiro nome.
public class Ex022 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Ansalisando seu nome...");
        String nomeMaiuscula = nome.toUpperCase();
        String nomeMinuscula = nome.toLowerCase();
        String nomeSemEspaco = nome.replace(" ","");
        String primeiroNome = "";
        for (int i = 0; i<= nome.length(); i++){
            String letra = nome.substring(i, i+1);
            if (!letra.equals(" ")){
                primeiroNome = primeiroNome + letra;
            } else {

                break;
            }
        }

        System.out.println("Seu nome em maiúsculas é " + nomeMaiuscula );
        System.out.println("Seu nome em minúsculas é " + nomeMinuscula);
        System.out.println("Seu nome tem ao todo " + nomeSemEspaco.length());
        System.out.println("Seu primeiro nome é" + primeiroNome + " e ele tem " + primeiroNome.length() + " letras.");

    }

}
