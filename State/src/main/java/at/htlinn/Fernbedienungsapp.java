package at.htlinn;

public class Fernbedienungsapp {
    private Raum currentRoom;

    public void playNextSong() {
        currentRoom.nextSong();
    }

    public void playPrevSong() {
        currentRoom.prevSong();
    }

    public void increaseRoomsVolume() {
        currentRoom.increaseVolume();
    }

    public void decreaseRoomsVolume() {
        currentRoom.decreaseVolume();
    }

    public void connectToRoom(Raum room) {
        if (room.equals(currentRoom)) {
            return;
        }
        currentRoom = room;
    }

    public void disconnectRoom() {
        currentRoom = null;
    }

    public void currentRoom() {
        if (currentRoom == null) {
            System.out.println("Du bist mit keinem Raum verbunden");
            return;
        }
        System.out.printf("Du bist gerade im %s\n", currentRoom.getDescription());
    }
}
