public class Ticket {
    private int[][] matrix = new int[50][100];
    private String verschlüsselung;

    public Ticket(int[][] matrix, String verschlüsselung) {
        this.matrix = matrix;
        this.verschlüsselung = verschlüsselung;
    }

    public String getVerschlüsselung() {

        return verschlüsselung;
    }

    public int[][] getMatrix() {
        return matrix;
    }
    public Ticket (int[][] matrix){
        this.matrix = matrix;
    }
}
