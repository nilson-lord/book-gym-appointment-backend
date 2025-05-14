package com.book.gym.appointment.book_gym_appointment.service.impl;

import com.book.gym.appointment.book_gym_appointment.entity.Trainer;
import com.book.gym.appointment.book_gym_appointment.repository.TrainerRepository;
import com.book.gym.appointment.book_gym_appointment.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    @Override
    public List<Trainer> getAllTrainers(){
        return trainerRepository.findAll();
    }

}
