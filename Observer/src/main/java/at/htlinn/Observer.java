package at.htlinn;

public interface Observer {
    public abstract void update(Observable o, int warningLevel);
}
