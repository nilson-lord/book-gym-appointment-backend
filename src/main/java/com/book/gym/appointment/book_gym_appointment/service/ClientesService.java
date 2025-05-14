package com.book.gym.appointment.book_gym_appointment.service;


import com.book.gym.appointment.book_gym_appointment.entity.Clientes;

import java.util.List;
import java.util.Optional;

public interface ClientesService {
    Clientes saveClientes(Clientes clientes);
    Clientes updateClientes(Clientes clientes);
    List<Clientes> getClientes();
    Optional<Clientes> getClientesById(Long id);
    void deleteClientes(Long id);
}
