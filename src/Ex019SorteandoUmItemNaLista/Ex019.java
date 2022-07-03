package Ex019SorteandoUmItemNaLista;

import java.util.*;

// Um professor quer sortear um dos seus quatro alunos para apagar o quadro.
// Faça um programa que ajude ele, lendo o nome dos alunos e escrevendo na tela o nome do escolhido.
public class Ex019 {

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
        Random random = new Random();
        int sorteador = random.nextInt(4);
        System.out.println("O(a) Aluno(a) sorteada foi: " + alunos.get(sorteador));
    }


}
