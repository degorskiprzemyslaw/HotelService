package hotelService;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println(hotel);
        UserService userService = new UserService();
        userService.getRoomNumbers();
        userService.getFreeRoomNumbers();
        userService.bookARoom();
        userService.getFreeRoomNumbers(); //tutaj mi sie wyswietlaja zapisane zmiany w stanie booked
        for (Room room : hotel.getRooms()) {//tutaj mi sie nie wyswietlaja zapisane zmiany w stanie booked
            System.out.println(room);
        }
        userService.getFreeRoomNumbers();
        userService.vacateARoom();
        userService.getFreeRoomNumbers(); // ten sam problem ze zwalnianiem pokoju
    }


}
