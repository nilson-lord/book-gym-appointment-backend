package com.book.gym.appointment.book_gym_appointment.service.impl;

import com.book.gym.appointment.book_gym_appointment.entity.Session;
import com.book.gym.appointment.book_gym_appointment.repository.SessionRepository;
import com.book.gym.appointment.book_gym_appointment.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }
}
