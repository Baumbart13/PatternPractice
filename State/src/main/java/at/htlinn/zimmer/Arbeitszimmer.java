package at.htlinn.zimmer;

import at.htlinn.Raum;

public class Arbeitszimmer extends Raum {

    public String getDescription() {
        return "Arbeitszimmer";
    }

    @Override
    public int maxVolume() {
        return 20;
    }

    public long lastSongIndex() {
        return 50;
    }

    @Override
    public int minVolume(){
        return 2;
    }
}
