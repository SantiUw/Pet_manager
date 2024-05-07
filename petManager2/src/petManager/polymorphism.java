/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petManager;

import Class.clscat;
import Class.clsdoctor;
import Class.clsdog;
import Class.clsveterinary;

/**
 *
 * @author SENA
 */
public class polymorphism {
    
    public static void main(String[] args){
        clsdog dog = new clsdog("Pastor Alemán", true, "001", "Pulgas", 2020, "Amarillo", "Buena salud");
        clscat cat = new clscat("criollo", "002", "Nieves", 2020, "Blanco", "Buena salud");
        
        clsdoctor doctor = new clsdoctor("Jose Antonio", "MMC123");
        clsveterinary veterinary = new clsveterinary("Huellita", "06478446", "calle 85 km 5", doctor); 
        
        String careDog = veterinary.petCare(dog);
            System.out.println("El estado de salud de "+dog.getName()+" es "+careDog);
            
        String careCat = veterinary.petCare(cat);
            System.out.println("El estado de salud de "+cat.getName()+" es: "+careCat);
    }
    
}
