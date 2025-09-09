package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;

        while (i < 100) {
            fizzbuzz(i);
            i++;
        }
    }

    private static void fizzbuzz(int i) {
        boolean isDivisibleBy3 = (i % 3 == 0);
        boolean isDivisibleBy5 = (i % 5 == 0);
        boolean isDivisibleBy15 = (i % 15 == 0);

        if (isDivisibleBy15) {
            System.out.println("Fizz Buzz");
        }

        else if (isDivisibleBy3) {
            System.out.println("Fizz");
        }

        else if (isDivisibleBy5) {
            System.out.println("Buzz");
        }

        else {
            System.out.println(i);
        }
    }
}
