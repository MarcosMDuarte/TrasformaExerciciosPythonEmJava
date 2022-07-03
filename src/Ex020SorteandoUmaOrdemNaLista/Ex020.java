package Ex020SorteandoUmaOrdemNaLista;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> alunos = new LinkedList<>();
        System.out.print("Primeiro aluno: ");
        String aluno1 = ler.next();
        System.out.print("Segundo aluno: ");
        String aluno2 = ler.next();
        System.out.print("Terceiro aluno: ");
        String aluno3 = ler.next();
        System.out.print("Quarto aluno: ");
        String aluno4 = ler.next();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        System.out.println(alunos);
        Collections.shuffle(alunos);
        System.out.println("A ordem de apresentação será: ");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
