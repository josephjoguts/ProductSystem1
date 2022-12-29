public class Main {

    public static void main(String[] args) {
        System.out.println(factorialUsingForLoop(5));
    }

    public static long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
