/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petManager;
import Class.*;

/**
 *
 * @author SENA
 */
public class AbstractClass {
    
    public static void main(String[] args) {
        clsdoctor doctor = new clsdoctor("Julián Montefrío", "GU54234");
        clsveterinary veterinary = new clsveterinary("Huellitas", "036 ", "Cll 65 26 10", doctor);
        
        veterinary.setData(veterinary.getName() + " " + veterinary.getAddress());
        
        String data = veterinary.getHospitalInformation();
        String type = veterinary.getPacientType();
        String surgery = veterinary.Surgery();
        
        System.out.println("data: " + data);
        System.out.println("Type: "+ type);
        System.out.println("Surgery: "+ surgery);
        
    }
    
}
