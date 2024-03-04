import java.util.Scanner;

import models.Caregiver;
import repository.CaregiveRepository;

public class App {
    // when i work with type Long need give a letter.
    public static void main(String[] args) {
        //  by Scanner we describe from where the data comes.
        var scanner = new Scanner(System.in);
        var repository = new CaregiveRepository();

        var option = "q";
        // do, while we have sure that program will execute at least once time.
        do {
            showMenu();
            // scanner is the way we can take the inputs from user.
            System.out.print("Please choose a option: ");

            switch(option) {
                case "1" -> SearchAll(repository);
            }
            option = scanner.nextLine();
            System.out.println("Option selected: " + option);
        } while(!option.equals("q"));
        // good practice close Scanner.
        scanner.close();
    }

    public static void searchAll(CaregiveRepository repository) {
        var caregivers = repository.searchAll();

        
    }

    private static void showMenu() {
        System.out.println("1 - SearchAll Caregivers");
        System.out.println("2 - Register Caregiver");
        System.out.println("3 - Find Caregiver");
        System.out.println("4 - Excludes Caregiver");
        System.out.println("q - Exit program.");
    }
}