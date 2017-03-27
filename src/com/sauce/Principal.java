package com.sauce;

import com.sauce.model.empleados.Comercial;
import com.sauce.model.empleados.Empleado;
import com.sauce.model.empleados.EmpleadoOficina;
import com.sauce.model.empleados.Temporal;

/**
 * Created by Fran on 15/3/17.
 */

public class Principal {

    public static void main(String[] args){

        Comercial comercial = new Comercial();
        Temporal temporal = new Temporal();
        EmpleadoOficina empleadoOficina = new EmpleadoOficina();

        empleadoOficina.setAniosTrabajados(15);

        System.out.println(empleadoOficina.calcularSueldo());

        empleadoOficina.setAniosTrabajados(35);

        System.out.println(empleadoOficina.calcularSueldo());

        comercial.setAltasTotales(150);
        comercial.setAltasMes(20);

        System.out.println(comercial.calcularSueldo());

        temporal.setHorasTotales(100);
        temporal.setHorasMes(42);

        System.out.println(temporal.calcularSueldo());
    }
}
