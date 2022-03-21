package at.htlinn;

public class Sortierung {
    private Sortierungstyp sortierungstyp;

    public Sortierung(Sortierungstyp sortierungstyp) {
        this.sortierungstyp = sortierungstyp;
    }

    public Sortierungstyp getSortierungstyp() {
        return sortierungstyp;
    }

    public void setSortierungstyp(Sortierungstyp sortierungstyp) {
        this.sortierungstyp = sortierungstyp;
    }
    public int[] sortarr(int[] arr)
    {
        return sortierungstyp.sortierungsverfahren(arr);
    }
}
