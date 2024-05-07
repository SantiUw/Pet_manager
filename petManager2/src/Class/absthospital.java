/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author SENA
 */
public abstract class absthospital {
    
    private String data;
    
    public abstract String getPacientType();
    public abstract  String Surgery();  
    
    public String getHospitalInformation(){
        return "La informacion es: "+ this.getData();
    }
    
    public String getData(){
        return data;
    }
    
    public void setData(String data){
        this.data= data;
    }
}
