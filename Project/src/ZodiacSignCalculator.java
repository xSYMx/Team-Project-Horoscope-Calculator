import java.util.Scanner;

public class ZodiacSignCalculator {

    private Scanner input = new Scanner(System.in);
    private Store store;

    public static void main(String[] args) {
        System.out.println("ZodiacSign Calculator V1.0");
        ZodiacSignCalculator calculator = new ZodiacSignCalculator();
        calculator.run();
    }

    public ZodiacSignCalculator(){
        this.store = new Store(1);
    }

    private void printUsers(){
        System.out.println(store.listUsers());
    }

    private void printCurrentUsersZodiacSigns() {
        System.out.println("Current Users Zodiac Signs:");
        for (int i = 0; i < store.totalUsers; i++) {
            Userinput user = store.users[i];
            if (user.isInCurrentUser()) {
                System.out.println(user.getName() + "'s Zodiac Sign: " + getZodiacSign(user.getBirthMonth(), user.getBirthDate()));
            }
        }
    }

    private void displayMenu() {
        System.out.println("\nOptions:");
        System.out.println("1. Add User");
        System.out.println("2. List Users");
        System.out.println("3. Find User");
        System.out.println("4. Update User");
        System.out.println("5. Delete User");
        System.out.println("6. Show Current Users Zodiac Signs");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    public void run() {

        displayMenu();

        while (true) {
            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    addUser();
                    printCurrentUsersZodiacSigns();
                    displayMenu();
                    break;
                case "2":
                    printUsers();
                    displayMenu();
                    break;
                case "3":
                    findUser();
                    displayMenu();
                    break;
                case "4":
                    updateUser();
                    displayMenu();
                    break;
                case "5":
                    deleteUser();
                    displayMenu();
                    break;
                case "6":
                    printCurrentUsersZodiacSigns();
                    displayMenu();
                    break;
                case "7":
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    displayMenu(); // Display menu again for the invalid choice
                    break;
            }
        }
    }



    private void addUser() {
        System.out.println("Enter user information:");
        System.out.println("Enter name:");
        String name = input.nextLine();

        System.out.println("Enter birth month (MM):");
        int birthMonth = Integer.parseInt(input.nextLine());

        System.out.println("Enter birth date (DD):");
        int birthDate = Integer.parseInt(input.nextLine());

        // Set all users' inCurrentUser to false
        for (int i = 0; i < store.totalUsers; i++) {
            store.users[i] = new Userinput(store.users[i].getName(), store.users[i].getBirthMonth(), store.users[i].getBirthDate(), false);
        }

        // Add new user with inCurrentUser set to true
        Userinput newUser = new Userinput(name, birthMonth, birthDate, true);
        String zodiacSign = getZodiacSign(birthMonth, birthDate);


        if (!store.add(newUser)) {
            System.out.println("Store is full. Cannot add more users.");
        } else {
            System.out.println("User added successfully.");
            System.out.println("Your zodiac sign is: " + zodiacSign);
        }

    }

    private void findUser() {
        System.out.println("Enter the name of the user to find:");
        String name = input.nextLine();

        for (int i = 0; i < store.totalUsers; i++) {
            Userinput user = store.users[i];
            if (user.getName().equals(name)) {
                System.out.println("User found: " + user);
                return;
            }
        }
        System.out.println("User not found.");
    }

    private void updateUser() {
        System.out.println("Enter the name of the user to update:");
        String name = input.nextLine();

        for (int i = 0; i < store.totalUsers; i++) {
            Userinput user = store.users[i];
            if (user.getName().equals(name)) {
                System.out.println("Enter new birth month (MM):");
                int birthMonth = Integer.parseInt(input.nextLine());
                System.out.println("Enter new birth date (DD):");
                int birthDate = Integer.parseInt(input.nextLine());
                store.users[i] = new Userinput(user.getName(), birthMonth, birthDate, user.isInCurrentUser());
                System.out.println("User updated successfully.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    private void deleteUser() {
        System.out.println("Enter the name of the user to delete:");
        String name = input.nextLine();

        for (int i = 0; i < store.totalUsers; i++) {
            Userinput user = store.users[i];
            if (user.getName().equals(name)) {
                for (int j = i; j < store.totalUsers - 1; j++) {
                    store.users[j] = store.users[j + 1];
                }
                store.totalUsers--;
                System.out.println("User deleted successfully.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    public static String getZodiacSign(int birthMonth, int birthDate) {
        String zodiacSign;

        if (birthMonth == 1) {
            if (birthDate >= 20) {
                zodiacSign = "Capricorn摩羯座";
            } else {
                zodiacSign = "Sagittarius射手座";
            }
        } else if (birthMonth == 2) {
            if (birthDate >= 19) {
                zodiacSign = "Pisces双鱼座";
            } else {
                zodiacSign = "Aquarius水瓶座";
            }
        } else if (birthMonth == 3) {
            if (birthDate >= 21) {
                zodiacSign = "Aries白羊座";
            } else {
                zodiacSign = "Pisces双鱼座";
            }
        } else if (birthMonth == 4) {
            if (birthDate >= 20) {
                zodiacSign = "Taurus金牛座";
            } else {
                zodiacSign = "Aries白羊座";
            }
        } else if (birthMonth == 5) {
            if (birthDate >= 21) {
                zodiacSign = "Gemini双子座";
            } else {
                zodiacSign = "Taurus金牛座";
            }
        } else if (birthMonth == 6) {
            if (birthDate >= 21) {
                zodiacSign = "Cancer巨蟹座";
            } else {
                zodiacSign = "Gemini双子座";
            }
        } else if (birthMonth == 7) {
            if (birthDate >= 23) {
                zodiacSign = "Leo狮子座";
            } else {
                zodiacSign = "Cancer巨蟹座";
            }
        } else if (birthMonth == 8) {
            if (birthDate >= 23) {
                zodiacSign = "Virgo处女座";
            } else {
                zodiacSign = "Leo狮子座";
            }
        } else if (birthMonth == 9) {
            if (birthDate >= 23) {
                zodiacSign = "Libra天秤座";
            } else {
                zodiacSign = "Virgo处女座";
            }
        } else if (birthMonth == 10) {
            if (birthDate >= 23) {
                zodiacSign = "Scorpio天蝎座";
            } else {
                zodiacSign = "Libra天秤座";
            }
        } else if (birthMonth == 11) {
            if (birthDate >= 22) {
                zodiacSign = "Sagittarius射手座";
            } else {
                zodiacSign = "Scorpio天蝎座";
            }
        } else if (birthMonth == 12) {
            if (birthDate >= 22) {
                zodiacSign = "Capricorn摩羯座";
            } else {
                zodiacSign = "Sagittarius射手座";
            }
        } else {
            zodiacSign = "Unknown未知";
        }

        return zodiacSign;
    }
}