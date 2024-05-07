/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petManager;

import Class.clscat;
import Class.clsdog;

/**
 *
 * @author SENA
 */
public class polymorphism2 {
    
    
    
    public static void main(String[] args){
        
        clscat cat;
        clsdog dog;
        
        dog = new clsdog("pitbull", true, "001", "toby", 2005, "Cafe", "Buena salud");
        cat = new clscat("criollo", "002", "misifu", 2004, "Atigrado", "Enfermo");
        
        cat.Sound();
        dog.Sound();
        
        
        
    }
    
    
    
    
    
    
}
