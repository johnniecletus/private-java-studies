public class readingInputs {
    public static void main(String[] args) {
        int currentYear = 2025;

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int userAge) {
        String name = System.console().readLine("Please enter your name: ");
        System.out.println("Hi " + name + " thank you for joining us today!");

        return "";
    }


    public static String getInputFromScanner(int userAge) {
        return "";
    }
}
