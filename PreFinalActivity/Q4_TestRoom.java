/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity;

public class Q4_TestRoom {

    public static void main(String[] args) {

        Room[] rooms = {
            new Q4_StandardRoom(101, "Pedro Cruz", 3),
            new Deluxe_Room(202, "Ana Reyes", 2),
            new Q4_SuiteRoom(301, "Carlo Santos", 2)
        };

        System.out.println("===== HOTEL BOOKING =====");
        System.out.println();

        for (Room room : rooms) {
            room.displayRoomInfo();
        }
    }
}
