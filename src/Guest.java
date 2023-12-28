public class Guest {
    private String name;
    private String mael;
    private int phoneNumber;
    private boolean isVegan;

    public Guest() {
    }

    public Guest(String name, String mael, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.mael = mael;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMael() {
        return mael;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInfo(){
        System.out.println("Name: " + name);
        System.out.println("Meal: " + mael);
        System.out.println("Phone number: " + phoneNumber);
        String isVeganString = isVegan ? "Yes" : "No";
        System.out.println("Vegan?: " + isVeganString);

    }
}