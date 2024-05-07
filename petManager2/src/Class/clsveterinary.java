/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

public class clsveterinary extends absthospital{
    public String name;
    public String phone;
    public String address;
    public clspet mascotas;
    public clsdoctor doctor;
    
    public clsveterinary(String name, String phone, String address, clsdoctor doctor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.doctor= doctor;
    }
    
    
    
    public clsveterinary() {
        
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //public clspet getMascotas() {
        //return mascotas;
    //}

    public void setDoctor(clsdoctor doctor) {
        this.doctor = doctor;
    }
    

    public clsdoctor getDoctor() {
        return doctor;
    }
    
    public String petCare(clspet mascotas){
        System.out.println("la veterinaria cuida a las mascotas "+mascotas.getName());
        return mascotas.getHealthStatus();
                 
    }

    public String getPacientType() {
        return "Animal";
    }

    public String Surgery() {
        return "Surgery datos informacion";
    }

}
