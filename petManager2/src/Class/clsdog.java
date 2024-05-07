/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author SENA
 */
public class clsdog extends clspet {
    
    public String breed;
    public Boolean pedigri;

    public clsdog(String breed, Boolean pedigri, String code, String name, int born_year, String color, String healthStatus) {
        super(code, name, born_year, color, healthStatus);
        this.breed = breed;
        this.pedigri = pedigri;
    }


    
    public clsdog() {
        
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


    public Boolean getPedigri() {
        return pedigri;
    }

    public void setPedigri(Boolean pedigri) {
        this.pedigri = pedigri;
    }

    
    public void Sound(){
        super.Sound();
        System.out.println(" ladra");
    }

    public void walkAround(){
        super.walkAround();
        System.out.println(" caminando");
    }

    
    public void walkAround(int km){
        super.walkAround();
        System.out.println(" caminando "+km+" km");
    }
        
    public void walkAround(boolean dogLeash){
        super.walkAround();
        if(dogLeash){
            System.out.println(" caminando con correa");
            
        }else{
            System.out.println(" caminando sin correa");
        }
        
        
    }

    public String getAnimalType() {
        super.getAnimalType();
        return "Perro";
    }

    public int getNumberOfBones() {
        super.getNumberOfBones(); 
        return  321;
    }
}
