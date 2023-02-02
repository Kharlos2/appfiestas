package org.example;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        //PARA USAR LA CLASE CREO UN OBJETO
        Empleado objetoTipoEmpleado = new Empleado();

        //UTILIZAR EL OBJETO PARA ACCEDER A UN ATRIBUTO
        objetoTipoEmpleado.nombre = "PEPE";

        //Accediendo a los metodos de mi clase empleado:
        String resultado = objetoTipoEmpleado.saludar("LUCHO MIAMOR");
        int sumatoria = objetoTipoEmpleado.sumar(5, 3);

        //Acceder a mostrar el retorno de la funcion

        System.out.println(sumatoria);

        System.out.println(resultado);

        System.out.println(objetoTipoEmpleado.saludar("a"));



    }
}