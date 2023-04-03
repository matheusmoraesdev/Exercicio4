package lista04_04.src;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
    // Declaração das variáveis
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double total;
        double media;

    // Passo 1: fazer a entrada dos dados
    Scanner reader = new Scanner(System.in);
        System.out.print("Qual foi sua nota em Português ? ");
            nota1 = reader.nextInt();
        System.out.print("Qual foi sua nota em Matemática ? ");    
            nota2 = reader.nextInt();
        System.out.print("Qual foi sua nota em Geografia ? ");
            nota3 = reader.nextInt();
        System.out.print("Qual foi sua nota em Filosofia ? ");
            nota4 = reader.nextInt();    
    // Passo 2: Calcular
    total = nota1 + nota2 + nota3 + nota4;
    media = total / 4;  

    // Passo 3: exibir a resposta para o usuário

    System.out.println("O total de suas notas é: " + total);
    System.out.println("A média de suas notas é: " + media);






    }
}
