package com.ines.microreservation.service;
import com.ines.microreservation.entity.Reservation;

import java.util.List;
import java.sql.Date;
public interface IReservationService {
    List<Reservation> getAllReservations();
    Reservation getReservationById (int id);
    void addReservation(Reservation reservation);

    void deleteReservation(int id);
    boolean isValidReservationDates(Reservation reservation);
    int calculateNumberOfDays(Date startDate, Date endDate);


}
