package mk.ukim.finki.wp.lab.repository.impl;

import mk.ukim.finki.wp.lab.bootsrap.DataHolder;
import mk.ukim.finki.wp.lab.model.BookReservation;
import mk.ukim.finki.wp.lab.repository.BookReservationRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryBookReservationRepository implements BookReservationRepository
{

    @Override
    public BookReservation save(BookReservation reservation) {
        DataHolder.reservations.removeIf(book -> book.getBookTitle().equals(reservation.getBookTitle()));
        DataHolder.reservations.add(reservation);
        return reservation;
    }
}
