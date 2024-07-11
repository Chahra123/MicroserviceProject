package com.ines.microreservation.repository;

import com.ines.microreservation.entity.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {


}
