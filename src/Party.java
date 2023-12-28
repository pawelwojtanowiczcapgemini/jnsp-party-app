import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneNumberToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest () {
        System.out.println("Enter guest name: ");
        String name = scanner.nextLine();

        System.out.println("Enter guest preferred meal: ");
        String meal = scanner.nextLine();

        System.out.println("Enter guest phone number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Is the guest vegan (Y/N): ");
        String isVeganString = scanner.nextLine();

        boolean isVegan = isVeganString.equals("Y") ? true : false;

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        guests.add(guest);
        meals.add(meal);
        phoneNumberToGuest.put(phoneNumber, guest);
    }

    public void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestInfo();
            System.out.println();
        }
    }

    public void displayMeals(){
        for(String meal : meals) {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber(){
        System.out.println("Enter phone number: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneNumberToGuest.get(phoneNumber);
        guest.displayGuestInfo();
    }

}