public class ReadingDevice {
    private IEncoding encoding;


    public boolean checkTicket (String driverName, Ticket ticket, String gebiet){
        if (ticket == null)return false;
        int[][] matrix = encoding.encode(ticket.getMatrix());
        if (!driverName.equals(matrix))return false;
        if (!gebiet.equals(matrix))return false;
        return true;
    }
}
