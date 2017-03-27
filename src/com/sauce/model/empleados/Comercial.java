package com.sauce.model.empleados;

/**
 * Created by Fran on 15/3/17.
 */
public class Comercial extends Empleado {

    //Atributos

    private String zona;
    private int altasMes;
    private int altasTotales;

    //Constructores

    public Comercial() {
        super();
    }

    public Comercial(
            String nombre,
            String apellidos,
            String dni,
            String nss,
            String direccion,
            String telefono,
            String email,
            String zona,
            int altasMes,
            int altasTotales)
    {
        super(nombre, apellidos, dni, nss, direccion, telefono, email);
        this.zona = zona;
        this.altasMes = altasMes;
        this.altasTotales = altasTotales;
    }

    //Metodos

    public double calcularSueldo(){
        double sueldo = 850;
        double impuesto;
        double plusMes = 12*altasMes;
        double plus;

        if (altasTotales < 100){
            plus = 0;
        }else if (altasTotales >= 100 && altasTotales < 300){
            plus = (sueldo*8)/100;
        }else if (altasTotales >= 300 && altasTotales < 500){
            plus = (sueldo*10)/100;
        }else{
            plus = (sueldo*15)/100;
        }

        impuesto = (sueldo*12)/100;

        sueldo = (sueldo + plus + plusMes - impuesto);

        return sueldo;
    }

    //Accesores

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getAltasMes() {
        return altasMes;
    }

    public void setAltasMes(int altasMes) {
        this.altasMes = altasMes;
    }

    public int getAltasTotales() {
        return altasTotales;
    }

    public void setAltasTotales(int altasTotales) {
        this.altasTotales = altasTotales;
    }
}
