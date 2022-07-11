package hotelService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();


    }

    public static void menu() {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        int input = 0;


        do {

            System.out.println("\n\n\t\t Obsługa komputerowa pokoi hotelowych");
            System.out.println("\t\t--------------------------------------\n");
            System.out.println("1 - Wyświetl listę pokoi");
            System.out.println("2 - Wyświetl listę dostępnych pokoi");
            System.out.println("3 - Zwolnij pokój");
            System.out.println("4 - Zwolnij zarezerwowany pokój");
            System.out.println("0 - Wyjdź z programu");
            System.out.print("\nWybierz opcję: ");

            try {
                input = scanner.nextInt();
                if(input < 0 || input > 4 ){
                    throw new InputMismatchIntegerValueException();
                }

                switch (input) {
                    case 1:
                        userService.getRoomNumbers();
                        break;
                    case 2:
                        userService.getFreeRoomNumbers();
                        break;
                    case 3:
                        System.out.println("Rezerwacja pokoju");
                        userService.bookARoom();
                        break;
                    case 4:
                        System.out.println("Zwalnianie pokoju");
                        userService.vacateARoom();
                        break;
                    case 0:
                        System.out.println("Koniec");
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException | InputMismatchIntegerValueException e){
                System.out.println("Wybrano niepoprawną opcję");
                menu();
            }

        } while (input != 0);
    }
}



























       /* Hotel hotel = new Hotel();

        UserService userService = new UserService();
        System.out.println(userService.getHotel());
        userService.getRoomNumbers();
        userService.getFreeRoomNumbers();
        userService.bookARoom();
        userService.getFreeRoomNumbers(); //tutaj mi sie wyswietlaja zapisane zmiany w stanie booked
        for (Room room : userService.getHotel().getRooms()) {//tutaj mi sie nie wyswietlaja zapisane zmiany w stanie booked
            System.out.println(room);
        }
        userService.getFreeRoomNumbers();
        userService.vacateARoom();
        userService.getFreeRoomNumbers();// ten sam problem ze zwalnianiem pokoju
        System.out.println(userService.getHotel());
    }*/



