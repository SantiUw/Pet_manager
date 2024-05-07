/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import Class.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
        

/**
 *
 * @author SENA
 */
public class modelCat {
    
    DbData dbdata;
    
    public modelCat(){
        this.dbdata = new DbData();
    }
    
    public String Createpet(clscat cat){  
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            
            String query = "INSERT INTO pet (pet_code, pet_name, pet_bornYear, pet_color, pet_healthStatus) VALUES (?,?,?,?,?)";
            PreparedStatement result = conn.prepareStatement(query);
            result.setString (1, cat.getCode());
            result.setString (2, cat.getName());
            result.setInt (3, cat.getBorn_year());
            result.setString(4, cat.getColor());
            result.setString    (5, cat.getHealthStatus());

            result.execute();

            String query2 = "INSERT INTO cat (cat_code, cat_breed) VALUES (?,?)";
            PreparedStatement result2 = conn.prepareStatement(query2);
            result2.setString (1, cat.getCode());
            result2.setString (2, cat.getBreed());

            result2.execute();

            System.out.println("hecho");
            return "Datos ingresados correctamente ☻";
      
        }catch(Exception e){

            return e.getMessage();
            
        }
        
    }
    //
    
    public String Editpet(clscat cat){
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            
            String query = "UPDATE pet, cat set pet_name=?, pet_color=?, pet_bornYear=?,pet_healthStatus = ?,cat_breed=?  WHERE pet_code =? AND cat_code = pet_code";
            PreparedStatement result2 = conn.prepareStatement(query);
            result2.setString (1, cat.getName());
            result2.setString (2, cat.getColor());
            result2.setInt(3, cat.getBorn_year());
            result2.setString(4, cat.getHealthStatus());
            result2.setString(5, cat.getBreed());
            result2.setString(6, cat.getCode());
            
            result2.execute();

            return "Mascota editada";
        }catch(Exception e){
            return e.getMessage();
        }
    }
    
    public String Deletepet(clspet pet){
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "DELETE FROM cat WHERE cat_code=?";
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
    
    public clscat SearchPet(String code){
        clscat cat= null;
         try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "SELECT * FROM pet INNER JOIN cat ON cat_code=pet_code WHERE pet_code=?";
            PreparedStatement st=conn.prepareStatement(query);
            st.setString (1, code);
            ResultSet res=st.executeQuery();

            if(res.next()){
                cat= new clscat();
                cat.setCode(res.getString("pet_code"));
                cat.setName(res.getString("pet_name"));
                cat.setBorn_year(res.getInt("pet_bornYear"));
                cat.setColor(res.getString("pet_color"));
                cat.setHealthStatus(res.getString("pet_healthStatus"));
                cat.setBreed(res.getString("cat_breed"));           
            }
            return cat;
            
        }catch(Exception e){
             System.out.println(e.getMessage());
            return cat= null;
            
        }
    }
    
    public LinkedList ListarPet(){
        LinkedList lista= new LinkedList<clscat>();
        
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "SELECT * FROM pet INNER JOIN cat ON cat_code=pet_code";
            Statement st=conn.createStatement();
            ResultSet res=st.executeQuery(query);
            
            while(res.next()){
                clscat cat= new clscat();
                cat.setCode(res.getString("pet_code"));
                cat.setName(res.getString("pet_name"));
                cat.setBorn_year(res.getInt("pet_bornYear"));
                cat.setColor(res.getString("pet_color"));
                cat.setHealthStatus(res.getString("pet_healthStatus"));
                cat.setBreed(res.getString("cat_breed"));
                
                lista.add(cat);
                cat= null;

            }
            return lista;

        }catch(Exception e){
            return lista;
            
        }
    }
    
    public clscat MostrarPet(String code){
        clscat cat= null;
        try(Connection conn = DriverManager.getConnection(dbdata.getUrl(), dbdata.getUser(), dbdata.getPass())){
            String query = "SELECT * FROM pet INNER JOIN cat ON cat_code=pet_code WHERE pet_code=?";
            PreparedStatement st=conn.prepareStatement(query);
            st.setString (1, code);
            ResultSet res=st.executeQuery();

            if(res.next()){
                cat= new clscat();
                cat.setCode(res.getString("pet_code"));
                cat.setName(res.getString("pet_name"));
                cat.setBorn_year(res.getInt("pet_bornYear"));
                cat.setColor(res.getString("pet_color"));
                cat.setHealthStatus(res.getString("pet_healthStatus"));
                cat.setBreed(res.getString("cat_breed"));           
            }
            return cat;
            
        }catch(Exception e){
             System.out.println(e.getMessage());
            return cat= null;
            
        }
        
    }
    
}
