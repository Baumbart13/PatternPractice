package at.htlinn;

public class Zucker implements IKaffee {
    private IKaffee k;

    public Zucker(IKaffee k){
        super();
        this.k = k;
    }

    @Override
    public int koffeinGehalt() {
        return 0;
    }

    @Override
    public String getDescription() {
        return k.getDescription() + " mit Zucker";
    }
}
