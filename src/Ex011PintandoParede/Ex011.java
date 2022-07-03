package Ex011PintandoParede;
// Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a
// quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta pinta uma
// área de 2 metros quadrados.

import java.util.Arrays;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual a altura da parede? ");
        double altura = ler.nextDouble();
        System.out.print("Qual a largura da parede? ");
        double largura = ler.nextDouble();
        double metrosQuadrados = altura*largura;
        double coberturaTinta = metrosQuadrados/2;
        System.out.printf("Sua parede tem a dimensão de %.2fX%.2f e sua área é de %.2f\n",altura,largura,metrosQuadrados);
        System.out.printf("Para pintar uma parede %.2fm² é necessário %.2f litros de tinta",metrosQuadrados, coberturaTinta);
    }
}
