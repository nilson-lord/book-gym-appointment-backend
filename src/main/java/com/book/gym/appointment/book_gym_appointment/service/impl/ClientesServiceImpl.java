package com.book.gym.appointment.book_gym_appointment.service.impl;


import com.book.gym.appointment.book_gym_appointment.entity.Clientes;
import com.book.gym.appointment.book_gym_appointment.repository.ClientesRepository;
import com.book.gym.appointment.book_gym_appointment.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServiceImpl implements ClientesService {
    @Autowired
    ClientesRepository clientesRepository;
    @Override
    public Clientes saveClientes(Clientes clientes){
        return clientesRepository.save(clientes);
    }
    @Override
    public Clientes updateClientes(Clientes clientes){
        return clientesRepository.save(clientes);
    }
    @Override
    public List<Clientes> getClientes(){
        return clientesRepository.findAll();
    }
    @Override
    public Optional<Clientes> getClientesById(Long id){
        return clientesRepository.findById(id);
    }
    @Override
    public void deleteClientes(Long id){
        clientesRepository.deleteById(id);
    }
}
