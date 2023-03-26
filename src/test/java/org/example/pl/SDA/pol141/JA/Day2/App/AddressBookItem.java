package org.example.pl.SDA.pol141.JA.Day2.App;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class AddressBookItem {
    private String email;
    private String phone;
    private LocalDate birth;

    private AddressBookItem(String email, String phone, LocalDate birth) {
        this.email = email;
        this.phone = phone;
        this.birth = birth;
    }
    public static AddressBookItem of(String email, String phone, LocalDate date){
        if (email == null || phone == null || date == null){
            throw new IllegalArgumentException("Któraś z wartości jest pusta");
        }
        return new AddressBookItem(email,phone,date);
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "AddressBookItem{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birth=" + birth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBookItem that = (AddressBookItem) o;
        return email.equals(that.email) && phone.equals(that.phone) && birth.equals(that.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phone, birth);
    }
}
