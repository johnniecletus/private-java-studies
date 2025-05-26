public class PersonalCreation {

    public static void main(String[] args) {

        display();

    }


    public static void display() {

        int numberOfMatches = 0;
        int sumOfMatches = 0;
        int[] Array = new int[0];


        for (int i = 1; i <= 1000; i++) {
           

            boolean valueDividedBy3 = i % 3 == 0;
            boolean valueDividedBy5 = i % 5 == 0;

            if (valueDividedBy3 && valueDividedBy5) {
                Array = new int[]{i};
            }

            if (valueDividedBy3 && valueDividedBy5) {
                numberOfMatches++;
                sumOfMatches += i;
                System.out.println("Number " + i + " is part of the numbers completely divisible by 3 and 5 between 1 and 1000");
            }

            if (numberOfMatches == 3) {
                break;
            }

        }


        System.out.println("Sum of matches is: " + sumOfMatches);

//        for (double rate = 7.5; rate < 10.0; rate += .25) {
//
//            double interest = calculateInterest(10000, rate);
//
//            System.out.println("The calculated interest for $10000 at a rate of " + rate + " is " + "$" + interest);
//        }

    }


    public static double calculateInterest(int amount, double rate) {
        double interest;

        if (amount <= 0) {
            return interest = 0;
        }
        ;

        return interest = (amount * (rate / 100));

    }

}
