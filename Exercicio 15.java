package Lr2;

public class Exercicio 15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();
        
        double imposto = 0;
        if (salario > 2000) {
            imposto = salario * 0.1; // 10% de imposto
        }
        
        System.out.println("O imposto de renda é: " + imposto);
        
        scanner.close();
    }
}
