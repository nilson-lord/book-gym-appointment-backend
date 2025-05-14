package com.book.gym.appointment.book_gym_appointment.controllers;

import com.book.gym.appointment.book_gym_appointment.entity.Session;
import com.book.gym.appointment.book_gym_appointment.service.SessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Session>> getAllSessions(){
        return new ResponseEntity<List<Session>>(sessionService.getAllSessions(), HttpStatus.OK);
    }
}
