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
            boolean isNumberValid;
            int number;
            int tries = 0;

            do {
                if(tries == 0){
                    System.out.println("Enter number " + "#" + i);
                }else {
                    System.out.println("Please Enter a valid number " + "#" + i);
                }

                number = validateNumber(scanner.nextLine());
                isNumberValid = number >= 0;
                if(isNumberValid == false){
                    System.out.println("Invalid number !!");
                    tries++;
                }
            } while (!isNumberValid);

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
        int parsedNumber;
        try {
            parsedNumber = Integer.parseInt(number);
        } catch (NumberFormatException badInput) {
            return -1;
        }

        return parsedNumber;

    }
}
