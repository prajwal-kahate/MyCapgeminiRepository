package com.ticket;

public class Ticket {
	private int ticketid;

	private int price;

	static int availableTickets;
	public int totalamount;
	
	public void calculateTicketCost(int nooftickets) {
		if (nooftickets<availableTickets) {
			availableTickets=availableTickets-nooftickets;
		} else {
			System.out.println("Not Available");
		}
		totalamount = nooftickets*price;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	

}
