import java.util.Arrays;

public class PrimeNumber {
    private boolean flag = false;

    public void isPrimeNumber(int number) {
        if (number < 2) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int i = 2; i <= number / 2; i++) {

                System.out.println(number + " / " + i + " = " + ((double) number / i));
                if (number % i == 0) {
                    this.flag = true;
                    break;
                }
            }

            if (!this.flag) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }

    public void primeNumberArray(int[] numbers) {

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 2) {
                System.out.println(numbers[i] + " is not a prime number");
                continue;
            }

            for (int j = 2; j < numbers[i] / 2; j++) {
                if (numbers[i] % j == 0) {
                    this.flag = true;
                    break;
                }
                this.flag = false;
            }

            if (!this.flag) {
                System.out.println(numbers[i] + " is a prime number");
            } else {
                System.out.println(numbers[i] + " is not a prime number");
            }

        }
    }
}