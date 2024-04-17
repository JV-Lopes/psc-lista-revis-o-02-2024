package Lr2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha: pedra, papel ou tesoura?");
        String escolhaUsuario = scanner.next().toLowerCase();
        
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int indiceAleatorio = (int) (Math.random() * opcoes.length);
        String escolhaComputador = opcoes[indiceAleatorio];
        
        System.out.println("O computador escolheu: " + escolhaComputador);
        
        if (escolhaUsuario.equals(escolhaComputador)) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario.equals("pedra") && escolhaComputador.equals("tesoura")) ||
                   (escolhaUsuario.equals("papel") && escolhaComputador.equals("pedra")) ||
                   (escolhaUsuario.equals("tesoura") && escolhaComputador.equals("papel"))) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }
        
        scanner.close();
    }
}
