package com.sauce.model.empleados;

/**
 * Created by Fran on 15/3/17.
 */
public abstract class Empleado {

    //Atributos

    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String nss;
    protected String direccion;
    protected String telefono;
    protected String email;

    //Constructores

    public Empleado() {

    }

    public Empleado(
            String nombre,
            String apellidos,
            String dni,
            String nss,
            String direccion,
            String telefono,
            String email)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nss = nss;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    //Metodos

    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return  "Nombre: " + nombre + '\n' +
                "Apellidos: " + apellidos + '\n' +
                "DNI: " + dni + '\n' +
                "Numero seguridad social: " + nss + '\n' +
                "Direccion: " + direccion + '\n' +
                "Telefono: " + telefono + '\n' +
                "Email: " + email + '\n';
    }

    //Accesores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
