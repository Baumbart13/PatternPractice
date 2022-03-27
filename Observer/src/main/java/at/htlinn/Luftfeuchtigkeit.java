package at.htlinn;

public class Luftfeuchtigkeit extends Observable {
    private int luftfeuchtigkeit;

    public Luftfeuchtigkeit(){
        super();
    }

    @Override
    public String toString() {
        return "Luftfeuchtigkeit";
    }

    public void setLuftfeuchtigkeit(int luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        switch (luftfeuchtigkeit) {
            case 0 -> super.notifyAllMyObservers(0);
            case 1,2,3,4 -> super.notifyAllMyObservers(1);
            case 5,6,7 -> super.notifyAllMyObservers(2);
            case 8,9,10 -> super.notifyAllMyObservers(3);
            default -> super.notifyAllMyObservers(-1);
        }
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }
}
