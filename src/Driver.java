public class Driver {
    private String name;
    private Ticket ticket;
    private IOffenceState state;

    public Driver (String name, Ticket ticket, IOffenceState state){
        this.name = name;
        this.ticket = ticket;
        this.state = state;
    }

    public void setState(IOffenceState state) {
        this.state = state;
    }

    public String getName() {

        return name;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public IOffenceState getState() {
        return state;
    }
}
