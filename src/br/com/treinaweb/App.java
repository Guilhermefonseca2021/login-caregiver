import models.Caregiver;

public class App {
    // when i work with type Long need give a letter.
    public static void main(String[] args) {
        var caregiver = new Caregiver(43l, "Name123", "(11) 43243-43244", "123.123.123-45", "R. Alecrin Dourado.");
        System.out.println(caregiver.getId());
        System.out.println(caregiver.getName());
        System.out.println(caregiver.getPhone());
        System.out.println(caregiver.getCpf());
        System.out.println(caregiver.getAddress());

        System.out.println(caregiver);
    }
}