public class Fibonacci {
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
}
