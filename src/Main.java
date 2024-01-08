import java.util.Scanner;

public class Main {
    public static int calcularFibonacci(int n) {
        if (n <= 0) {
            System.out.println("O valor de 'n' deve ser maior que 0.");
            return -1;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um numero para a sequencia");
        int n = scan.nextInt();
        int resultado = calcularFibonacci(n);
        System.out.println("O numero " + n + " o valor da sequência de Fibonacci é: " + resultado);
    }
}