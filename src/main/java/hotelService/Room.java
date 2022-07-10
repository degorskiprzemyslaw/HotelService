package hotelService;

public class Room {

    private int roomNumber;
    private RoomSize roomSize;
    private boolean doesHaveBathroom;
    private boolean booked;

    public Room(int roomNumber, RoomSize roomSize, boolean doesHaveBathroom, boolean booked) {
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.doesHaveBathroom = doesHaveBathroom;
        this.booked = booked;
    }
}





/* Dodaj klasę Room reprezentującą pojedynczy pokój (nr pokoju, ilu osobowy, czy w pokoju jest
        łazienka - true/false oraz czy pokój jest dostępny - true/false).

        5. Dodaj klasę Hotel która będzie zawierała listę pokoi.

        6. W konstruktorze klasy Hotel utwórz kilka obiektów klasy Room i dodaj je do listy (np. 10-15),
        dzięki temu podczas tworzenia instancji obiektu hotel, automatycznie generowana będzie lista
        pokoi.

        7. Dodaj klasę UserService która będzie służyć do obsługi hotelu. Na początek dodaj
        funkcjonalności:

        1. Pobierz listę wszystkich pokoi.

        2. Pobierz listę wszystkich dostępnych pokoi.

        3. Rezerwuj pokój (podaj nr pokoju i jeśli jest dostępny to go zarezerwuj).

        4. Zwolnij pokój (podaj nr pokoju i jeśli jest zajęty to go zwolnij)*/