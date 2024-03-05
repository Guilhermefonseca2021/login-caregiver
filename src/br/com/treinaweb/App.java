import java.util.Scanner;

import models.Caregiver;
import repository.CaregiveRepository;

public class App {
    // when i work with type Long need give a letter.
    public static void main(String[] args) {
        //  by Scanner we describe from where the data comes.
        // scanner is the way we can take the inputs from user
        var scanner = new Scanner(System.in);
        var repositoryCaregiver = new CaregiveRepository();

        var option = "q";
        // do, while we have sure that program will execute at least once time.
        do {
            showMenu();
            System.out.print("Please choose a option: ");
            System.out.println();
            switch(option) {
                case "1" -> searchAll(repositoryCaregiver);
                case "2" -> register(scanner, repositoryCaregiver);
                case "3" -> searchById(scanner, repositoryCaregiver);
                case "4" -> excludesById(scanner, repositoryCaregiver);
                case "q" -> System.out.println("exiting...");
                default -> System.out.println("Invalid Option.");
            }

            option = scanner.nextLine();
        } while(!option.equals("q"));
        // good practice close Scanner.
        scanner.close();
    }

    public static void register(Scanner scanner, CaregiveRepository repository) {
        System.out.println("Nome: ");
        var name = scanner.nextLine();
        System.out.println("Phone: ");
        var phone = scanner.nextLine();
        System.out.println("CPF: ");
        var cpf = scanner.nextLine();
        System.out.println("Address: ");
        var address = scanner.nextLine();

        var caregiver = new Caregiver(name, phone, cpf, address);
        repository.register(caregiver);

        System.out.println("Caregiver register successfully!");

    }

    public static void searchAll(CaregiveRepository repository) {
        var caregivers = repository.searchAll();
        for (Caregiver caregiver : caregivers) {
            System.out.println(caregiver.getId() + " - " + caregiver.getName() + " - " + caregiver.getId());
        }
    }

    public static void searchById(Scanner scanner, CaregiveRepository repository) {
        System.out.print("id: ");
        // nextLine return string and want a data type Long.
        var id = scanner.nextLong();
        // to dont give erro when i click "tab" to send.
        var caregiver = repository.searchById(id);
        if(caregiver != null) {
            System.out.println(caregiver.getId() + " - " + caregiver.getName());
        } else {
            System.out.println("Caregiver not found.");
        }
    }

    public static void excludesById(Scanner scanner, CaregiveRepository repository) {
        System.out.print("id: ");
        var id = scanner.nextLong();

        var wasExcluded = repository.excludesById(id);
        if(wasExcluded) {
            System.out.println("Caregiver was ecluded with successfully! ");
        } else {
            System.out.println("Caregiver not found.");
        }
    }

    private static void showMenu() {
        System.out.println("1 - SearchAll Caregivers");
        System.out.println("2 - Register Caregiver");
        System.out.println("3 - Find Caregiver");
        System.out.println("4 - Excludes Caregiver");
        System.out.println("q - Exit program.");
    }
}