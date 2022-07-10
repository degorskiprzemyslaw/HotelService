package hotelService;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Room> rooms = new ArrayList<>();

    public Hotel() {
        rooms.add(new Room(1, RoomSize.TRIPLE_ROOM, true, false ));
        rooms.add(new Room(2, RoomSize.TWIN_ROOM, false, true ));
        rooms.add(new Room(3, RoomSize.TRIPLE_ROOM, false, false ));
        rooms.add(new Room(4, RoomSize.FAMILY_ROOM, true, false ));
        rooms.add(new Room(5, RoomSize.SINGLE_ROOM, false, true));
        rooms.add(new Room(6, RoomSize.TWIN_ROOM, true, false ));
        rooms.add(new Room(7, RoomSize.SINGLE_ROOM, true, true ));
        rooms.add(new Room(8, RoomSize.TWIN_ROOM, false, false ));
        rooms.add(new Room(9, RoomSize.SINGLE_ROOM, true, true ));
        rooms.add(new Room(10, RoomSize.SINGLE_ROOM, true, false ));
        rooms.add(new Room(11, RoomSize.FAMILY_ROOM, false, true ));
    }
}
