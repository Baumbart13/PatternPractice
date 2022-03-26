package at.htlinn.zimmer;

import at.htlinn.Raum;

public class Wohnzimmer extends Raum {
    public long lastSongIndex() {
        return 250;
    }

    public int minVolume() {
        return 0;
    }

    public int maxVolume() {
        return 80;
    }

    public String getDescription() {
        return "Wohnzimmer";
    }
}
