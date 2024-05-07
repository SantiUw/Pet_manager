package hibernate;
import Class.clsdog;
import persistencia.*;
import maping.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
  


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class cat{

    public cat() {
    }
    
    public void create(Pet p, Cat c){
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        try {
            
        session.save(p);
        session.save(c);        
        t.commit();
          
        sessionFactory.close();
        
        System.out.println("creado");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
        
    
    
    public void mostrar(String id){
        try {
            SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
          
        Pet s=(Pet)session.get(Pet.class, id );
        Cat s1=(Cat)session.get(Cat.class, id );
        System.out.println("Id : "+s.getPetCode());
        System.out.println("Name : "+s.getPetName());
        System.out.println("HealthStatus : "+s.getPetHealthStatus());
        System.out.println("Color : "+s.getPetColor());
        System.out.println("born year : "+s.getPetBornYear());
        
        System.out.println("breed : "+s1.getCatBreed());
          
        sessionFactory.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void Actulizar(String id, int year){
        try {
             SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        
        
          
        Pet s=(Pet)session.get(Pet.class, id );
        s.setPetBornYear(year);
        session.save(s);
        t.commit();
        
         System.out.println("actualizado");
          
        sessionFactory.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
    
    public void eliminar(String id){
        try {
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        
        Cat s1=(Cat)session.get(Cat.class, id );
        
         
          
        Pet s=(Pet)session.get(Pet.class, id );

 
        
        session.delete(s);
        


        t.commit();
          
        sessionFactory.close();
        
        System.out.println("eliminado");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}


    

    

       
    

