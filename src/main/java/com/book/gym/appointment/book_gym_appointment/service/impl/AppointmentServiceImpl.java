package com.book.gym.appointment.book_gym_appointment.service.impl;

import com.book.gym.appointment.book_gym_appointment.entity.Appointment;
import com.book.gym.appointment.book_gym_appointment.repository.AppointmentRepository;
import com.book.gym.appointment.book_gym_appointment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }
}
