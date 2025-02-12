public class TicketReserver{
public static void main(String[] args) {
TicketReservationSystem system = new TicketReservationSystem();
system.addTicket(1, "Alice", "Inception", 5, "2025-02-12 14:00");
system.addTicket(2, "Bob", "Avatar", 3, "2025-02-12 16:00");
system.addTicket(3, "Charlie", "Titanic", 8, "2025-02-12 18:00");
system.displayTickets();
system.removeTicket(2);
system.displayTickets();
Ticket ticket = system.searchTicketByCustomerName("Charlie");
if (ticket != null) System.out.println("Found ticket: " + ticket.ticketId);
ticket = system.searchTicketByMovieName("Inception");
if (ticket != null) System.out.println("Found ticket: " + ticket.ticketId);
System.out.println("Total tickets booked: " + system.totalTickets());
}
}
class Ticket {
int ticketId;
String customerName;
String movieName;
int seatNumber;
String bookingTime;
Ticket next;
Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
this.ticketId = ticketId;
this.customerName = customerName;
this.movieName = movieName;
this.seatNumber = seatNumber;
this.bookingTime = bookingTime;
this.next = null;
}
}
class TicketReservationSystem {
private Ticket head;
TicketReservationSystem() {
head = null;
}
void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
if (head == null) {
head = newTicket;
newTicket.next = head;
} else {
Ticket temp = head;
while (temp.next != head) {
temp = temp.next;
}
temp.next = newTicket;
newTicket.next = head;
}
}
void removeTicket(int ticketId) {
if (head == null) return;
Ticket temp = head, prev = null;
while (true) {
if (temp.ticketId == ticketId) {
if (prev != null) {
prev.next = temp.next;
} else {
if (temp.next == head) head = null;
else {
Ticket last = head;
while (last.next != head) last = last.next;
head = temp.next;
last.next = head;
}
}
break;
}
prev = temp;
temp = temp.next;
if (temp == head) break;
}
}
void displayTickets() {
if (head == null) {
System.out.println("No tickets booked.");
return;
}
Ticket temp = head;
do {
System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
temp = temp.next;
} while (temp != head);
}
Ticket searchTicketByCustomerName(String customerName) {
Ticket temp = head;
do {
if (temp.customerName.equals(customerName)) return temp;
temp = temp.next;
} while (temp != head);
return null;
}
Ticket searchTicketByMovieName(String movieName) {
Ticket temp = head;
do {
if (temp.movieName.equals(movieName)) return temp;
temp = temp.next;
} while (temp != head);
return null;
}
int totalTickets() {
if (head == null) return 0;
int count = 0;
Ticket temp = head;
do {
count++;
temp = temp.next;
} while (temp != head);
return count;
}
}
