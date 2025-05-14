package com.book.gym.appointment.book_gym_appointment.repository;

import com.book.gym.appointment.book_gym_appointment.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
