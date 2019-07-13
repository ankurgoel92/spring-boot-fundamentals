package app.boot.service;

import app.boot.model.Ticket;

public interface TicketService {

    Iterable<Ticket> listTickets();
}
