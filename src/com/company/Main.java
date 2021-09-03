package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Inmueble i1 = new Inmueble("01","001",100,10);
    Inmueble i2 = new Inmueble("02","002",100, 11);
    Inmueble i3 = new Inmueble("03","002",600, 3);
    Inmueble i4 = new Inmueble("04","002",100, 1);
    //Inmueble i5 = new Inmueble("04","002",1000, 1);
        System.out.println(i1.getnCasa()+" "+i1.getIDArrendador()+" "+i1.getCostoMensual()+" "+i1.getCantidadMesesArrendado());
        System.out.println(i2.getnCasa()+" "+i2.getIDArrendador()+" "+i2.getCostoMensual()+" "+i2.getCantidadMesesArrendado());
        System.out.println(i3.getnCasa()+" "+i3.getIDArrendador()+" "+i3.getCostoMensual()+" "+i3.getCantidadMesesArrendado());
        System.out.println(i4.getnCasa()+" "+i4.getIDArrendador()+" "+i4.getCostoMensual()+" "+i4.getCantidadMesesArrendado());

    Condominio condominio = new Condominio();
    condominio.agregarInmueble(i1);
    condominio.agregarInmueble(i2);
    condominio.agregarInmueble(i3);
    condominio.agregarInmueble(i4);
    //condominio.agregarInmueble(i5);
    System.out.println(condominio.promedioCostoInmueble());
    System.out.println(condominio.calcularArriendoMensualCondominio());
    System.out.println(condominio.desviacionEstandarCostoInmueble());
    }
}
