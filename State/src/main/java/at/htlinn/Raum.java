package at.htlinn;

public abstract class Raum {
    protected int volume = 0;
    protected long songIndex = 0;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Raum state = (Raum) o;
        return this.getDescription().equals(state.getDescription());
    }

    public abstract long lastSongIndex();

    public abstract int minVolume();

    public abstract int maxVolume();

    public abstract String getDescription();

    public void nextSong() {
        this.songIndex = (this.songIndex + 1 < this.lastSongIndex())
                ? this.songIndex + 1
                : 0;
        System.out.print("Now playing next song. ");
    }

    public void prevSong(){
        this.songIndex = (this.songIndex - 1 < 0)
                ? this.lastSongIndex()
                : this.songIndex - 1;
        System.out.print("Now playing previous song. ");
    }

    public void printCurrentSongIndex(){
        System.out.printf("Song #%d is getting played now", this.songIndex);
    }

    public void increaseVolume(){
        this.volume = (this.volume+1 < this.maxVolume())
                ? this.volume + 1
                : this.volume;
        System.out.print("Increased volume. ");
        this.printCurrentVolume();
    }

    public void decreaseVolume(){
        this.volume = (this.volume - 1 > this.minVolume())
                ? this.volume-1
                : this.volume;
        System.out.print("Decreased volume. ");
        this.printCurrentVolume();
    }

    public void printCurrentVolume(){
        System.out.printf("Now playing at volume %d", this.volume);
    }
}
