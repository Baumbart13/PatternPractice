package at.htlinn;

import at.htlinn.zimmer.Arbeitszimmer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        var control = new Fernbedienungsapp();
        control.connectToRoom(new Arbeitszimmer());
        control.increaseRoomsVolume();
    }
}
