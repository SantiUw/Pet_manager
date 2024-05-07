/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
  
/**
 *
 * @author USUARIO
 */
public class session {
        public static SessionFactory provideSessionFactory()
    {
        Configuration config=new Configuration();
        config.configure();
        return config.buildSessionFactory();
    }
    
    
}
