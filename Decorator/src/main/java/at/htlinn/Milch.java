package at.htlinn;

public class Milch implements IKaffee {
    private IKaffee k;

    public Milch(IKaffee k){
        super();
        this.k = k;
    }

    @Override
    public int koffeinGehalt() {
        return 10;
    }

    @Override
    public String getDescription() {
        return k.getDescription() + " mit Milch";
    }
}
