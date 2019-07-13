package app.boot.repository;

import org.springframework.data.repository.CrudRepository;

import app.boot.model.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
