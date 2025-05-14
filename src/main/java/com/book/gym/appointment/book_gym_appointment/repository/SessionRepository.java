package com.book.gym.appointment.book_gym_appointment.repository;

import com.book.gym.appointment.book_gym_appointment.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
