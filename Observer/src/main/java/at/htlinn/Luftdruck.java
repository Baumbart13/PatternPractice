package at.htlinn;

public class Luftdruck extends Observable {
    private int luftdruck;

    public Luftdruck() {
        super();
    }

    @Override
    public String toString() {
        return "Luftdruck";
    }

    public void setLuftdruck(int luftdruck) {
        this.luftdruck = luftdruck;
        switch (luftdruck) {
            case 0 -> super.notifyAllMyObservers(0);
            case 1,2,3,4 -> super.notifyAllMyObservers(1);
            case 5,6,7 -> super.notifyAllMyObservers(2);
            case 8,9,10 -> super.notifyAllMyObservers(3);
            default -> super.notifyAllMyObservers(-1);
        }
    }

    public int getLuftdruck() {
        return this.luftdruck;
    }
}
