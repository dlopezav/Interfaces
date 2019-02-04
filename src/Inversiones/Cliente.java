/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inversiones;

/**
 *
 * @author dlopezav
 */
public class Cliente {
    private int edad;
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private String email;
    private Asset[] assets;

    public Cliente(int cedula, int edad, String nombre, String apellido, int telefono, String email) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.assets = new Asset[10];
    }

    public Asset[] getAssets() {
        return assets;
    }

    public boolean addAsset(Asset asset) {
        for(Asset e: this.assets){
            if(e==null){
                e=asset;
                return true;
            }
        }
        return false;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
