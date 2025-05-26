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
        System.out.println("Please enter your year of birth: ");
        String yearOfBirth = scanner.nextLine();

       int validatedYearOfBirth = checkDate(currentYear, yearOfBirth);

        if(validatedYearOfBirth == -1) {
          System.out.println("You have entered an invalid year!");
          return null;
        }
       
        int userAge = currentYear - validatedYearOfBirth;


        return "So you are " + userAge + " years old!";
    }

    public static int checkDate(int currentYear, String yearOfBirth) {
        int dob = Integer.parseInt(yearOfBirth);
        int minimumYearOfBirth = currentYear - 125;

        if((dob < minimumYearOfBirth) || (dob > currentYear)) {
            return -1;
        }

        return currentYear - dob;
    }
}
