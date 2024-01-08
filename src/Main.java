import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resultado = 1;
        int resultadoFactor = 1;

        while (resultado !=0 && resultadoFactor !=0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Fibonacci");
            System.out.println("Insira um numero para a sequencia");
            int n = scan.nextInt();
            resultado = Fibonacci.calcularFibonacci(n);
            System.out.println("O numero " + n + " o valor da sequência de Fibonacci é: " + resultado);
            System.out.println();
            System.out.println("Maior factor comum entre 2 nnumeros");
            System.out.println("Insira primeiro numero");
            int num1 = scan.nextInt();
            System.out.println("Insira segundo numero");
            int num2 = scan.nextInt();
            resultadoFactor = MaiorFactorEntre2N.calcularMFC(num1, num2);
            System.out.println("O Maior Factor Comum entre o " + num1 + " e o " + num2 + " é: " + resultadoFactor);
        }
    }
}
