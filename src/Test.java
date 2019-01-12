public class Test {
    public void main (String[]args){
        IOffenceState state = new S0();
        int[][] matrix = new int[50][100];
        Ticket ticket = new Ticket(matrix);
        Driver driver1 = new Driver("Jörgen", ticket, new S0());
        System.out.println("Der Fahrer hat den Status " + driver1.getState().getStatenumber());
    }
}
