package dev.spectrProfil;

public class Order {
    private String name;
    private String email;
    private String city;
    private String number;
    private String message;

    public Order() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getNumber() {
        return number;
    }
}
