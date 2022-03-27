package at.htlinn;

public class Sahne implements IKaffee{
    private IKaffee k;

    public Sahne(IKaffee k){
        super();
        this.k = k;
    }

    @Override
    public int koffeinGehalt() {
        return 2;
    }

    @Override
    public String getDescription() {
        return k.getDescription() + " mit Sahne";
    }
}
