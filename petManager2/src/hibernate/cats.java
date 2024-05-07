/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Scanner;
import maping.Cat;
import maping.Pet;


/**
 *
 * @author USUARIO
 */
public class cats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int tipo;
        String sino;
        
        cat model = new cat();

        
        Pet p = new Pet("002","Nieves", 2020, "Blanco", "Buena salud");
          
        Cat c=new Cat(p, "criollo");
        
    
        
            System.out.println("¿Que desea hacer?:");
            System.out.println("1. crear");
            System.out.println("2. eliminar");
            System.out.println("3. Actualizar");
            System.out.println("4.mostrar");
        
            tipo= teclado.nextInt();

            switch(tipo){
                case 1->model.create(p, c);
                case 2->{System.out.println("ingrese el code");
                        String code= teclado.next();
                        if(code!=null){
                            model.eliminar(code);
                            
                        }
                        
                        }
                case 3->{System.out.println("ingrese el code");
                        String code= teclado.next();
                        System.out.println("ingrese el año a actualizar");
                        int año= teclado.nextInt();
                        model.Actulizar(code, año);
                        }
                case 4->{System.out.println("ingrese el code");
                        String code= teclado.next();
                        model.mostrar(code);
                        }
            }
            
            System.out.println("¿desea realizar alg8una otra opcion?: S/N");
        
        

    }
}
