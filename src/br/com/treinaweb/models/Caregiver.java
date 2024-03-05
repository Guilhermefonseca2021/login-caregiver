package models;

public class Caregiver extends User {
    public Caregiver(String name, String phone, String cpf, String address) {
        super(null, name, phone, cpf, address); 
    }

    public Caregiver(Long id, String name, String phone, String cpf, String address) {
        super(id, name, phone, cpf, address); 
    }
}
