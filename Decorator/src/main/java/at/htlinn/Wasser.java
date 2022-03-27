package at.htlinn;

public class Wasser implements IKaffee{
    private IKaffee k;

    public Wasser(IKaffee k){
        super();
        this.k = k;
    }

    @Override
    public int koffeinGehalt() {
        return 0;
    }

    @Override
    public String getDescription() {
        return k.getDescription() + " mit Wasser";
    }
}
