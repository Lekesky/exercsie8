package com.company;

public class Business extends Contact{
    private Long phoneNumber;

    public Business(String name, String email, Long phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }


    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Business{name=" + getName() + " email=" + getEmail() + " phonenumber=" + phoneNumber + '}';
    }
}
