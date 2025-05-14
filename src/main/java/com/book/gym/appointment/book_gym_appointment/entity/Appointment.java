package com.book.gym.appointment.book_gym_appointment.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id",nullable = true)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "trainer_id",nullable = true)
    private Trainer trainer;

    @ManyToOne
    @JoinColumn(name = "service_id",nullable = true)
    private Session service;

    private LocalDate appointmentDate;
    private byte status;
    private String notes;

    public Appointment() {}

    public Appointment(int id, Client client, Trainer trainer, Session service, LocalDate appointmentDate, byte status, String notes) {
        this.id = id;
        this.client = client;
        this.trainer = trainer;
        this.service = service;
        this.appointmentDate = appointmentDate;
        this.status = status;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Session getService() {
        return service;
    }

    public void setService(Session service) {
        this.service = service;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
