package at.htlinn;

public class Temperatur extends Observable {
    private int temperatur;

    public Temperatur(){
        super();
    }

    @Override
    public String toString() {
        return "Temperatur";
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
        switch (temperatur) {
            case 0 -> super.notifyAllMyObservers(0);
            case 1,2,3,4 -> super.notifyAllMyObservers(1);
            case 5,6,7 -> super.notifyAllMyObservers(2);
            case 8,9,10 -> super.notifyAllMyObservers(3);
            default -> super.notifyAllMyObservers(-1);
        }
    }

    public int getTemperatur() {
        return temperatur;
    }
}
