package Ex018SenoCossenoTangente;
//Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o ângulo que você deseja: ");
        float angulo = ler.nextFloat();
        float seno = (float) Math.sin(Math.toRadians(angulo));
        float cosseno = (float) Math.cos(Math.toRadians(angulo));
        double tangente = Math.tan(Math.toRadians(angulo));
        System.out.printf("O ângulo de %.2f tem o SENO de %.2f\n",angulo,seno);
        System.out.printf("O ângulo de %.2f tem o COSSENO de %.2f\n",angulo,cosseno);
        System.out.printf("O ângulo de %.2f tem a TANGENTE de %.2f",angulo,tangente);



    }
}
