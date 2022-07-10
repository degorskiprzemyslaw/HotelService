package hotelService;

public enum RoomSize {
    SINGLE_ROOM(1), TWIN_ROOM(2), TRIPLE_ROOM(3), FAMILY_ROOM(4);
    private int guestNumber;


    RoomSize(int guestNumber) {
        this.guestNumber = guestNumber;
    }
}
