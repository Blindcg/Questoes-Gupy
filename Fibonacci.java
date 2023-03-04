package Curso.Devdojo.Exercicios.GupyQuestoes;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numinfo;
        int num1 = 0;
        int num2 = 1;
        int cont = 0;

        System.out.println("Digite um número de 1 a 100 para verificar se pertence na seqenucia de Fibonacci:");
        numinfo = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            if (numinfo == num1) {
                cont++;}
                if (i == 0) {
                System.out.println(num1);}
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
        if (cont > 0) {
            System.out.println("O número informado pertence a sequência");
        } else {
            System.out.println("O número informado não pertence a sequência");
        }
    }
}
