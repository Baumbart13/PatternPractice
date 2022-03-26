package at.htlinn.zimmer;

import at.htlinn.Raum;

public class Schlafzimmer extends Raum {
    public long lastSongIndex() {
        return 30;
    }

    public int minVolume() {
        return 0;
    }

    public int maxVolume() {
        return 20;
    }

    public String getDescription() {
        return "Schlafzimmer";
    }
}
