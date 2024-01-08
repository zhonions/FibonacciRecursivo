public class MaiorFactorEntre2N {
    public static int calcularMFC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMFC(b, a % b);
        }
    }
}
