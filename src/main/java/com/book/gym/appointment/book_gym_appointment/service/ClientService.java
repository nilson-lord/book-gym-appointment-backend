package com.book.gym.appointment.book_gym_appointment.service;

import com.book.gym.appointment.book_gym_appointment.entity.Client;

import java.util.List;

public interface ClientService {
    Client addClient(Client client);
    List<Client> getAllClients();
}
