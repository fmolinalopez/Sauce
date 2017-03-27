package com.sauce.model.empleados;

/**
 * Created by Fran on 15/3/17.
 */
public class EmpleadoOficina extends Empleado {

    //Atributos

    private String planta;
    private String oficina;
    private String area;
    private String seccion;
    private int aniosTrabajados;

    //Constructores

    public EmpleadoOficina() {
        super();
    }

    public EmpleadoOficina(
            String nombre,
            String apellidos,
            String dni,
            String nss,
            String direccion,
            String telefono,
            String email,
            String planta,
            String oficina,
            String area,
            String seccion,
            int aniosTrabajados)
    {
        super(nombre, apellidos, dni, nss, direccion, telefono, email);
        this.planta = planta;
        this.oficina = oficina;
        this.area = area;
        this.seccion = seccion;
        this.aniosTrabajados = aniosTrabajados;
    }

    //Metodos

    @Override
    public double calcularSueldo(){
        double sueldo = 1150;
        int trienios = aniosTrabajados / 3;
        double impuestos;
        if (trienios >10){
            trienios = 10;
            sueldo = sueldo + (trienios*35);
        }else{
            sueldo = sueldo + (trienios*35);
        }

        impuestos = (sueldo*18/100);

        sueldo = sueldo - impuestos;

        return sueldo;
    }

    //Accesores

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }
}
