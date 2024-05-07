/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petManager;

import Class.clscat;
import Class.clsdog;
import Class.clspet;
import Class.clsveterinary;
import java.util.Date;


/**
 *
 * @author SENA
 */
public class petManager {

    public static void main(String[] args) {
        // TODO code application logic here
        clsdog pet1;
        clscat pet2;
        clsveterinary huellita;
        
        
        
        pet1 = new clsdog();
        pet1.setCode("001");
        pet1.setName("Pulgas");
        pet1.setBreed("Golden Retriever");
        pet1.setBorn_year(2021);
        pet1.setPedigri(true);
        pet1.setColor("Amarillo");
        pet1.setHealthStatus("Buena salud");
        
        pet2 = new clscat("criollo","002","Nieves", 2020, "Blanco", "Buena salud");
        
        
        huellita = new clsveterinary();
        /*
        huellita.mascotas = new clspet[2];
        clspet p1 = pet1;
        clspet p2 = pet2;
        huellita.mascotas[0] = p1;
        huellita.mascotas[1] = p2;
        
        */
        
        System.out.println("Mascota "+pet1.getCode()+"\n Nombre: "+pet1.getName()+" \n Especie:"+pet1.getBreed()+" \n Pedigri:"+pet1.getPedigri()+"\n Año Nacimiento: "+pet1.getBorn_year()+" \n Color:"+pet1.getColor()+"\n Estado Salud: "+pet1.getHealthStatus());
        pet1.walkAround();
        pet1.Eat();
        pet1.Move();
        pet1.Sound();
        System.out.println("Mascota "+pet2.getCode()+"\n Nombre: "+pet2.getName()+" \n Especie:"+pet2.getBreed()+"\n Año Nacimiento: "+pet2.getBorn_year()+" \n Color:"+pet2.getColor()+"\n Estado Salud: "+pet2.getHealthStatus());
        pet2.selfCleaning();
        pet2.Eat();
        pet2.Move();
        pet2.Sound();
        Date(pet1, pet2);
        
        huellita.petCare(pet1);

    }
        
    public static void Date( clspet PET1, clspet PET2){
        Date current_date = new Date();
        int current_year = current_date.getYear();
        
        int PT1 = current_year - PET1.getBorn_year();
        int PT2 = current_year - PET2.getBorn_year();
        
        if(PT1>PT2){
            System.out.println("♥La mascota "+PET1.getName()+" es menor que la mascota "+PET2.getName()); 
        } else if (PT1<PT2){
            System.out.println("♥La mascota "+PET1.getName()+" es mayor que la mascota "+PET2.getName());
        } else {
            System.out.println("♥Ambas mascotas son de la misma edad.");
        }
    }
    
    

    
}
