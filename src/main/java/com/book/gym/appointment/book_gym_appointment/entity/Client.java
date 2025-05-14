package com.book.gym.appointment.book_gym_appointment.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String dni;
    private String email;
    private String phone;
    private LocalDate birth_date;

    public Client(int id, LocalDate birth_date, String phone, String email, String dni, String last_name, String first_name) {
        this.id = id;
        this.birth_date = birth_date;
        this.phone = phone;
        this.email = email;
        this.dni = dni;
        this.last_name = last_name;
        this.first_name = first_name;
    }

    public Client() {}

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birth_date = birthDate;
    }

}
