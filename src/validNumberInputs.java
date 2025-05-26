import java.util.Scanner;

public class validNumberInputs {
    public static void main(String[] args) {
        System.out.println("The sum of the numbers are: " + readInputtedNumber());
    }


    public static int readInputtedNumber() {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;

        for (int i = 1; i <= 5; i++) {
            boolean validnumber = false;
            int number = 0;

            do {
                System.out.print("Enter number " + "#" + i);
                number = validateNumber(scanner.nextLine());
                validnumber = number >= 0;
            } while (!validnumber);

            switch (i) {
                case 1:
                    number1 = number;
                    break;
                case 2:
                    number2 = number;
                    break;
                case 3:
                    number3 = number;
                    break;
                case 4:
                    number4 = number;
                    break;
                default:
                    number5 = number;
            }


        }


        return number1 + number2 + number3 + number4 + number5;
    }

    public static int validateNumber(String number) {
        int parsedNumber = 0;
        try {
            parsedNumber = Integer.parseInt(number);
        } catch (NumberFormatException badInput) {
            return -1;
        }

        return parsedNumber;

    }
}
