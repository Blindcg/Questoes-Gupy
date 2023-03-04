package Curso.Devdojo.Exercicios.GupyQuestoes;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite um nome para ser invertido:");
        nome = scanner.nextLine();

        for (int i = nome.length() - 1; i >= 0; i--){
            System.out.print(nome.charAt(i));
        }
    }
}
