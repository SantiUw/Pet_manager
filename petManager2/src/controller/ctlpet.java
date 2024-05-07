/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Class.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import model.*;

/**
 *
 * @author SENA
 */
public class ctlpet {
    
    private modelDog modeDog;
    private modelCat modeCat;
    
    
    public ctlpet(){
        this.modeDog= new modelDog();
        this.modeCat= new modelCat();
    }
    
    public String CreatePet(clspet pet) {           
        try{
            switch(pet.getAnimalType()){
                
                case "Gato" ->{
                    String s= this.modeCat.Createpet((clscat)pet);
                    return s;
                }
                case "Perro"->{
                    String s=this.modeDog.Createpet((clsdog)pet);
                    return s;
                }
            }
        }catch(Exception e){
            return e.getMessage();
        }
        return null;
    }
    
    public String DelatePet(clspet pet) {            
        try{
            switch(pet.getAnimalType()){
                case "Gato" ->{
                    return this.modeCat.Deletepet((clscat)pet);
                }
                case "Perro"->{
                    return this.modeDog.Deletepet((clsdog)pet);
                }
            }
        }catch(Exception e){
            return e.getMessage();
        }
        return null;
    }
    
    public clspet SearchPet(String code, String type) {  
        clspet pet=null;
        try{
            switch(type){
                case "Gato" ->{
                    return this.modeCat.SearchPet(code);
                }
                case "Perro"->{
                    return this.modeDog.SearchPet(code);
                }
            }
        }catch(Exception e){
            return pet; 
        }
        return null;
    }
    
    public String EditPet(clspet pet) {            
        try{
            switch(pet.getAnimalType()){
                case "Gato" ->{
                    return this.modeCat.Editpet((clscat)pet);
                }
                case "Perro"->{
                    return this.modeDog.Editpet((clsdog)pet);
                }
            }
        }catch(Exception e){
            return e.getMessage();
        }
        return null;
    }
    
    public LinkedList listar() { 
            LinkedList lista= null;
            LinkedList lista2= null;

        
        try{
            lista= new LinkedList<clspet>();
            lista2= new LinkedList<clspet>();
            LinkedList listac=this.modeCat.ListarPet();
            LinkedList listap=this.modeDog.ListarPet();
            
            
            lista2.addAll(listac);
            lista2.addAll(listap);
            Iterator iter= lista2.iterator();
            Iterator iter3= lista2.iterator();
            int code1= 0;
            int a= 0;
            
            while(iter3.hasNext()){
                clspet pet= (clspet)iter3.next();
                a= Integer.parseInt(pet.getCode());
                if(code1<a){
                    code1=a;
                    
                }
                

            }
            

            
                      
            for(int i= 0; i<code1; i++){
                clspet pet= new clspet();
                lista.add(pet);
            }
  
            while(iter.hasNext()){
                clspet pet= (clspet)iter.next();
                int code= Integer.parseInt(pet.getCode());
                
                lista.set(code-1, pet);

            }
            Iterator iter2= lista.iterator();
            
            while(iter2.hasNext()){
                clspet pet2= (clspet)iter2.next();
                

            }

            
            return lista;

        }catch(Exception e){
            System.out.println(e.getMessage());
            return lista;
        }
    }
    
    public clspet MostrarPet(String code, String type) {  
        clspet pet=null;
        try{
            switch(type){
                case "Gato" ->{
                    return this.modeCat.MostrarPet(code);
                }
                case "Perro"->{
                    return this.modeDog.MostrarPet(code);
                }
            }
        }catch(Exception e){
            return pet; 
        }
        return null;
    }
    

    
}
