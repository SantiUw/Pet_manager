/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;


/**
 *
 * @author SENA
 */
public class clscat extends clspet {
    
    public String breed;

    public clscat(String breed,String code, String name, int born_year, String color, String healthStatus) {
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
    }
 
    public clscat() {
        
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    

    public void selfCleaning(){
        System.out.println(" el "+breed+" se limpia solo");
              
    }
    
            
    public void Sound(){
        super.Sound();
        System.out.println(" maulla");
    }
    
    public String getAnimalType() {
        super.getAnimalType();
        return "Gato";
    }

    public int getNumberOfBones() {
        super.getNumberOfBones(); 
        return  230;
    }
    
    
    
         
    
}
