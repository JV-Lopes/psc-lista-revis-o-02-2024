package Lr2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();
        
        double imposto = 0;
        if (salario > 2000) {
            imposto = salario * 0.1;
        }
        
        System.out.println("O imposto de renda é: " + imposto);
        
        scanner.close();
    }
}
