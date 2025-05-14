package com.book.gym.appointment.book_gym_appointment.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;


    private String surname;


    private String email;


    private Integer phoneNumber;


    private String message;


    private String fechaRegistro;

    /*@NotBlank
    private String activo;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Reservas> reservas;*/

}
