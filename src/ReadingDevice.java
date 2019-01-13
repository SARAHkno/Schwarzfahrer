import java.util.Date;

public class ReadingDevice {
    private IEncoding encoding;



    public boolean checkTicket (String driverName, Ticket ticket, String gebiet){
        if (ticket == null)return false;
        if (ticket.getVerschlüsselung() == "RSA") this.encoding = new EncodingRSA();
        else this.encoding = new EncodingAES();
        Date today = new Date();
        int [][] matrix = ticket.getMatrix();
        if (!driverName.equals(encoding.encodeName(matrix)))return false;
        if (!gebiet.equals(encoding.encodeGebiet(matrix)))return false;
//        if(! today.equals(encoding.encodeDate(matrix)))return false;
        return true;
    }
}
