package com.book.gym.appointment.book_gym_appointment.controllers;

import com.book.gym.appointment.book_gym_appointment.entity.Trainer;
import com.book.gym.appointment.book_gym_appointment.service.TrainerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Trainer>> getAllTrainers() {
        return new ResponseEntity<List<Trainer>>(trainerService.getAllTrainers(), HttpStatus.OK);
    }
}
