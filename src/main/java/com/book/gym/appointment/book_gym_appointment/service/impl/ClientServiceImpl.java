package com.book.gym.appointment.book_gym_appointment.service.impl;

import com.book.gym.appointment.book_gym_appointment.entity.Client;
import com.book.gym.appointment.book_gym_appointment.repository.ClientRepository;
import com.book.gym.appointment.book_gym_appointment.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
}
