package lab1;

public class Reduce {
    public static int reduce(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return 1 + reduce(n / 2);
        }

        else {
            return 1 + reduce(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(reduce(2));
        System.out.println(reduce(100));
    }
}
