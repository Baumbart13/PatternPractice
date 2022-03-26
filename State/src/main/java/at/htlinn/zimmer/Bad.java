package at.htlinn.zimmer;

import at.htlinn.Raum;

public class Bad extends Raum {
    public long lastSongIndex() {
        return 100;
    }

    public int minVolume() {
        return 0;
    }

    public int maxVolume() {
        return 50;
    }

    public String getDescription() {
        return "Badezimmer";
    }
}
