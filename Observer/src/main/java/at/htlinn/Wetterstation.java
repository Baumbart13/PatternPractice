package at.htlinn;

public class Wetterstation implements Observer {
    @Override
    public void update(Observable o, int warningLevel) {
        var sb = new StringBuilder(o.toString() + " meldet ");
        switch (warningLevel) {
            case 0 -> sb.append("keine Warnung");
            case 1 -> sb.append("Warnung: Unterwasser");
            case 2 -> sb.append("Warnung: Sturm");
            case 3 -> sb.append("Warnung: Sturm und Unterwasser");
            default -> sb.append("Warnung: Störung");
        }
        System.out.println(sb.toString());
    }
}
