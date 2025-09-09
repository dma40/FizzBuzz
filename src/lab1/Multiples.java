package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    public static int multiples(int n, int a, int b) {
        int lcm = (a * b) / gcd(a, b);

        return (n - 1) / a + (n - 1) / b - (n - 1) / lcm;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }
}
