/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalActivity;

/**
 *
 * @author User
 */
public class Q2_TestElectricityBill {
    
    public static void main(String[] args) {

        Q2_ElectricityBill bill1 = new Q2_ElectricityBill(
            "EL-1001",
            "Juan Santos",
            "Residential",
            1250,
            1475
        );

        Q2_ElectricityBill bill2 = new Q2_ElectricityBill(
            "EL-1002",
            "Maria Cruz",
            "Residential",
            2000,
            2080
        );

        Q2_ElectricityBill bill3 = new Q2_ElectricityBill(
            "EL-1003",
            "ABC Corporation",
            "Commercial",
            3500,
            3900
        );

        bill1.displayBill();
        bill2.displayBill();
        bill3.displayBill();
    }
}
    

