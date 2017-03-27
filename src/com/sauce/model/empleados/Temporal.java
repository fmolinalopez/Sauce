package com.sauce.model.empleados;

/**
 * Created by Fran on 15/3/17.
 */
public class Temporal extends Empleado {

    //Atributos
    private int horasMes;
    private int horasTotales;

    //Constructores

    public Temporal() {
        super();
    }

    public Temporal(
            String nombre,
            String apellidos,
            String dni,
            String nss,
            String direccion,
            String telefono,
            String email,
            int horasMes,
            int horasTotales)
    {
        super(nombre, apellidos, dni, nss, direccion, telefono, email);
        this.horasMes = horasMes;
        this.horasTotales = horasTotales;
    }

    //Metodos

    public double calcularSueldo(){
        double plus;
        double impuesto;
        double sueldo;
        sueldo = horasMes*25;

        if (horasTotales < 10){
            plus = 0;
        }else if (horasTotales >= 10 && horasTotales < 25){
            plus = (sueldo*3)/100;
        }else if (horasTotales >= 25 && horasTotales < 50){
            plus = (sueldo*5)/100;
        }else{
            plus = (sueldo*10)/100;
        }

        sueldo = sueldo + plus;

        if (sueldo >= 850){
            impuesto = (sueldo*11)/100;
        }else{
            impuesto = 0;
        }

        sueldo = sueldo - impuesto;

        return sueldo;
    }

    //Accesores

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }
}
