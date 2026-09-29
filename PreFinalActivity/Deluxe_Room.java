/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity;

/**
 *
 * @author User
 */
public class Deluxe_Room extends Room {
    
    public Deluxe_Room(int roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Deluxe", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        return (2500 * numberOfNights) + (300 * numberOfNights);
    }
    
}
