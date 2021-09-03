package com.company;

import java.util.ArrayList;

public class Condominio {
    //Atributo
    private ArrayList<Inmueble> inmuebles;
    private Inmueble pivote;
    //Inmueble prueba = new Inmueble("1","02",100.0,5);

    public Condominio() {

        this.inmuebles = new ArrayList<Inmueble>();
        this.pivote =null;
    }

    public void buscar(String n){
        for(Inmueble casita: this.inmuebles){
            if(casita.getnCasa().equals(n)){
                this.pivote = casita;
            }
        }
    }
    //Metodos
    public void agregarInmueble(Inmueble i){
        this.buscar(i.getnCasa());
        if(this.pivote == null){
            this.inmuebles.add(i);
            this.pivote = null;
        }



    }

    public void eliminarInmueble(String i){
        if(!inmuebles.isEmpty()) {
            for (int x = 0; x < inmuebles.size(); x++) {
                if (inmuebles.get(x).getnCasa().equals(i)) {
                    inmuebles.remove(x);
                }
            }
        }
    }

    public double calcularArriendoMensualCondominio(){
        double suma=0;
            for (Inmueble inmueble : this.inmuebles) {

                suma += inmueble.getCostoMensual();

            }
        /*for(int x =0; x<inmuebles.size(); x++){
            suma +=inmuebles.get(x).getCostoMensual();
        }*/
        return suma;
    }

    public double promedioCostoInmueble(){


        return  this.calcularArriendoMensualCondominio() / inmuebles.size();
    }

    public double desviacionEstandarCostoInmueble(){
        double rango = 0;

        for(Inmueble casita: this.inmuebles){
            rango += Math.pow(casita.getCostoMensual() - this.promedioCostoInmueble(),2);

        }
        return Math.sqrt((1/(double)this.inmuebles.size())*rango);
    }
    //get y setters

    public ArrayList<Inmueble> getInmuebles() {

        return this.inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {

        this.inmuebles = inmuebles;
    }


}
