package models;

public class Caregiver extends User {
    public Caregiver(Long id, String name, String phone, String cpf, String address) {
        super(id, name, phone, cpf, address); 
    }

    @Override
    public String toString() { 
        return "Caregiver: " + this.getName();
    }
}
