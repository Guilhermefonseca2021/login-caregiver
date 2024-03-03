package models;

public class User {
    // long as "int" is type intire but more larger.
    private Long id;
    private String name;
    private String phone;
    private String cpf;
    private String address;
    public User(Long id, String name, String phone, String cpf, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.cpf = cpf;
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
