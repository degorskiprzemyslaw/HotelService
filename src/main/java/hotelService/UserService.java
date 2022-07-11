package hotelService;

import java.util.Scanner;

public class UserService {
    Hotel hotel = new Hotel();


    public void getRoomNumbers(){
        System.out.println();
        System.out.println(getHotel());

    }

    public void getFreeRoomNumbers(){
        for (Room room : getHotel().getRooms()){
            if(!room.isBooked())
            System.out.println(room.getRoomNumber());
        }
    }

    public void bookARoom(){
        System.out.println("Podaj numer pokoju, ktory chcesz zarezerwowac");
        Scanner scanner = new Scanner(System.in);
        int roomNumber = scanner.nextInt();

        if(hotel.getRooms().get(roomNumber - 1).isBooked()){
            System.out.println("Przykro nam, ten pokoj jest zarezerwowany");
            bookARoom();
        } else {
            System.out.println("Ten pokoj jest dostepny");
            Room room = hotel.getRooms().get(roomNumber - 1);
            room.setBooked(true);

        }
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void vacateARoom(){
        System.out.println("Podaj numer pokoju, ktory chcesz zwolnic");
        Scanner scanner = new Scanner(System.in);
        int roomNumber = scanner.nextInt();

        if(!(hotel.getRooms().get(roomNumber - 1).isBooked())){
            System.out.println("Przykro nam, ten pokoj jest już wolny");
            vacateARoom();
        } else {
            System.out.println("Udało się zwolnić pokoj numer " + roomNumber );
            Room room = hotel.getRooms().get(roomNumber - 1);
            room.setBooked(false);

        }
    }


}
