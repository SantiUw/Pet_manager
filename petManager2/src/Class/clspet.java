/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Class;
import interfaces.IAnimal;
import interfaces.IVertebrate;
import java.util.Date;

/**
 *
 * @author SENA
 */
public class clspet implements IAnimal, IVertebrate{
        private String code;
        private String name;
        private int born_year;
        private String color;
        private String healthStatus;
        private String sound;
        
        public clspet (String code, String name,int born_year, String color, String healthStatus){
            this.code = code;
            this.name= name;
            this.born_year= born_year;
            this.color= color;
            this.healthStatus= healthStatus;
        } 
         
        public clspet (){} 
        
        public void Eat(){
            System.out.println(" La Mascota "+this.name+" está comiendo");             
        }
        
        public void Move(){
            System.out.println(" La Mascota "+this.name+" se está moviendo");              
        }
        
        public void Sound(){
            System.out.print("La Mascota "+this.name);     
        }
        public void walkAround(){
            System.out.print("La mascota "+this.name+" está");
        }
        
        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public int getBorn_year() {
            return born_year;
        }

        public String getColor() {
            return color;
        }

        public String getHealthStatus() {
            return healthStatus;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBorn_year(int born_year) {
            this.born_year = born_year;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
        }

    
    public String getAnimalType() {
        return "Domestico";
        
    }

    
    public int getNumberOfBones() {
        return 0;       
    }

        
        
}

