import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;

        Party party = new Party();

        while (shouldContinue) {
            System.out.println();
            System.out.println("Choose the option from list below: ");
            System.out.println();
            System.out.println("1. Display guests.");
            System.out.println("2. Add guest.");
            System.out.println("3. Display meals.");
            System.out.println("4. Find with phone number.");
            System.out.println("5. Exit.");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;
            }
        }

    }
}