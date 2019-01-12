public class S0 implements IOffenceState {
    private int statenumber ;

    public S0 (){
        this.statenumber = 0;
    }

    @Override
    public int getStatenumber() {
        return statenumber;
    }
}
