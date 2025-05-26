import java.util.Scanner;

public class readingInputs {
    public static void main(String[] args) {
        int currentYear = 2025;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }


    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Please enter your name: ");
        String yearOfBirth = System.console().readLine("Please enter your year of birth: ");
        System.out.println("Hi " + name + " thank you for joining us today!");

        int parsedYearOfBirth = Integer.parseInt(yearOfBirth);

        int userAge = currentYear - parsedYearOfBirth;


        return "So you are " + userAge + " years old!";
    }


    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        boolean validDob = false;
        int age;
        int numberOfAttempts = 0;

        do {

            if (numberOfAttempts == 0) {
                System.out.println("Please enter your year of birth: ");
            } else {
                System.out.println("Enter a year of birth greater or equal to " + (currentYear - 125) + " and less than or equal to " + (currentYear));
            }

            String yearOfBirth = scanner.nextLine();
            numberOfAttempts++;
            int validatedYearOfBirth = checkDate(currentYear, yearOfBirth);

            if (validatedYearOfBirth != -1) {
                validDob = true;
            }

            age = validatedYearOfBirth;
        } while (!validDob);


        return "So you are " + age + " years old!";
    }

    public static int checkDate(int currentYear, String yearOfBirth) {
        int dob = Integer.parseInt(yearOfBirth);
        int minimumYearOfBirth = currentYear - 125;

        if ((dob < minimumYearOfBirth) || (dob > currentYear)) {
            return -1;
        }

        return currentYear - dob;
    }
}
