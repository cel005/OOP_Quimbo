/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity;

public class Q4_StandardRoom extends Room {

    public Q4_StandardRoom(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Standard", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return 1500 * numberOfNights;
    }
}