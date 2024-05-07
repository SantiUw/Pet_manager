/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Class.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author SENA
 */
public class modelDog {
    
    DbData dbdata;
    
    public modelDog(){
        this.dbdata = new DbData();
    }
    
    public String Createpet(clsdog dog){
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "INSERT INTO pet (pet_code, pet_name, pet_bornYear, pet_color, pet_healthStatus) VALUES (?,?,?,?,?)";
            PreparedStatement result = conn.prepareStatement(query);
            result.setString (1, dog.getCode());
            result.setString (2, dog.getName());
            result.setInt (3, dog.getBorn_year());
            result.setString(4, dog.getColor());
            result.setString    (5, dog.getHealthStatus());
            
            result.execute();
            
            String query2 = "INSERT INTO dog (dog_code, dog_breed, dog_pedigree) VALUES (?,?,?)";
            PreparedStatement result2 = conn.prepareStatement(query2);
            result2.setString (1, dog.getCode());
            result2.setString (2, dog.getBreed());
            result2.setBoolean(3, dog.getPedigri());
            
            result2.execute();
            
            System.out.println("hecho");
            
            
            return "Datos ingresados correctamente ☻";
            
        }catch(Exception e){
            return e.getMessage();
        }
        
    }
    
    public String Editpet(clsdog dog){
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "UPDATE pet, dog set pet_name= ?, pet_color= ?,pet_bornYear= ?, pet_healthStatus = ?,dog_breed= ?, dog_pedigree = ? WHERE pet_code =? AND dog_code = pet_code";
            PreparedStatement result2 = conn.prepareStatement(query);
            result2.setString (1, dog.getName());
            result2.setString (2, dog.getColor());
            result2.setInt(3, dog.getBorn_year());
            result2.setString(4, dog.getHealthStatus());
            result2.setString(5, dog.getBreed());
            result2.setBoolean(6, dog.getPedigri());
            result2.setString(7, dog.getCode());
            
            result2.execute();

            

            return "Mascota editada";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    
    public String Deletepet(clspet pet){
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "DELETE FROM dog WHERE dog_code=?";
            PreparedStatement result = conn.prepareStatement(query);
            result.setString (1, pet.getCode());
            
            result.execute();
            
            String query2 = "DELETE FROM pet WHERE pet_code=?";
            PreparedStatement result2 = conn.prepareStatement(query2);
            result2.setString (1, pet.getCode());
            
            result2.execute();
            return "Mascota eliminada";
        }catch(Exception e){
            return e.getMessage();
            
        }
    }
    
    public clsdog SearchPet(String code){
        clsdog  dog= null;
         try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "SELECT * FROM pet INNER JOIN dog ON dog_code=pet_code WHERE pet_code=?";
            PreparedStatement st=conn.prepareStatement(query);
            st.setString (1, code);
            ResultSet res=st.executeQuery();;
            if(res.next()){
                dog= new clsdog();
                dog.setCode(res.getString("pet_code"));
                dog.setName(res.getString("pet_name"));
                dog.setBorn_year(res.getInt("pet_bornYear"));
                dog.setColor(res.getString("pet_color"));
                dog.setHealthStatus(res.getString("pet_healthStatus"));
                dog.setBreed(res.getString("dog_breed"));     
                dog.setPedigri(res.getBoolean("dog_pedigree")); 
            }
            return dog;

            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return dog= null;
            
        }
    }
    
    public LinkedList ListarPet(){
        LinkedList lista= new LinkedList<clsdog>();
        
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "SELECT * FROM pet INNER JOIN dog ON dog_code=pet_code";
            Statement st=conn.createStatement();
            ResultSet res=st.executeQuery(query);
            
            while(res.next()){
                clsdog dog= new clsdog();
                dog.setCode(res.getString("pet_code"));
                dog.setName(res.getString("pet_name"));
                dog.setBorn_year(res.getInt("pet_bornYear"));
                dog.setColor(res.getString("pet_color"));
                dog.setHealthStatus(res.getString("pet_healthStatus"));
                dog.setBreed(res.getString("dog_breed"));
                dog.setPedigri(res.getBoolean("dog_pedigree"));
                
                lista.add(dog);
                dog= null;

            }
            
        Iterator iter= lista.iterator();
        
        return lista;

        }catch(Exception e){
            return lista;
            
        }
    }
    
    public clsdog MostrarPet(String code){
        clsdog  dog= null;
         try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "SELECT * FROM pet INNER JOIN dog ON dog_code=pet_code WHERE pet_code=?";
            PreparedStatement st=conn.prepareStatement(query);
            st.setString (1, code);
            ResultSet res=st.executeQuery();;
            if(res.next()){
                dog= new clsdog();
                dog.setCode(res.getString("pet_code"));
                dog.setName(res.getString("pet_name"));
                dog.setBorn_year(res.getInt("pet_bornYear"));
                dog.setColor(res.getString("pet_color"));
                dog.setHealthStatus(res.getString("pet_healthStatus"));
                dog.setBreed(res.getString("dog_breed"));     
                dog.setPedigri(res.getBoolean("dog_pedigree")); 
            }
            return dog;

            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return dog= null;
            
        }
        
    }
    
}
