package at.htlinn;

public class Kaffeesatz implements IKaffee{
    private IKaffee kaffee;

    public Kaffeesatz(IKaffee kaffee) {
        super();
        this.kaffee = kaffee;
    }

    public Kaffeesatz() {
        this(null);
    }

    @Override
    public int koffeinGehalt() {
        return 20;
    }

    @Override
    public String getDescription() {
        return this.kaffee == null ? "Kaffeesatz" : this.kaffee.getDescription() + " mit Kaffeesatz";
    }
}
