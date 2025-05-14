package com.book.gym.appointment.book_gym_appointment.controllers;

import com.book.gym.appointment.book_gym_appointment.entity.Clientes;
import com.book.gym.appointment.book_gym_appointment.service.ClientesService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients") // Ruta base para todos los endpoints
@CrossOrigin("http://localhost:4200")
public class ClientController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping
    public ResponseEntity<Clientes> saveClientes(@Valid @RequestBody Clientes clientes) {
        Clientes savedClientes = clientesService.saveClientes(clientes);
        return new ResponseEntity<>(savedClientes, HttpStatus.CREATED);  // Usa CREATED en lugar de OK
    }

    @PutMapping
    public ResponseEntity<Clientes> updateClientes(@Valid @RequestBody Clientes clientes) {
        Clientes updatedClientes = clientesService.updateClientes(clientes);
        return new ResponseEntity<>(updatedClientes, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Clientes>> getAllClientes() {
        return new ResponseEntity<>(clientesService.getClientes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> getClientesById(@PathVariable Long id) {
        Optional<Clientes> clientes = clientesService.getClientesById(id);
        return clientes.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClientes(@PathVariable Long id) {
        if (clientesService.getClientesById(id).isPresent()) {
            clientesService.deleteClientes(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);  // Usa NO_CONTENT para DELETE
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
