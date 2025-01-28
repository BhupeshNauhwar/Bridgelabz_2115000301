import java.util.*;

class NumberChecker2 {

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumDigits(int number) {
        int sum = 0;
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double sumOfSquaresOfDigits(int number) {
        double sum = 0;
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = sumDigits(number);
        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        System.out.println("Sum of digits: " + sumDigits(number));

        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));

        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        int[][] frequency = findDigitFrequency(number);
        System.out.println("Frequency of digits: ");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " appears " + frequency[i][1] + " times");
            }
        }
    }
}