package com.lunlucky.FactorioWorld;

public class Mineral extends Item {
    public Mineral(String nombre, int cantidad) {
        super(nombre, cantidad);
    }

    public Mineral() {
    }

    public void minar (){
        int sumatorio = (int) (Math.random() * 60);
        setCantidad(getCantidad() + sumatorio) ;
        // llamada: llamar sin ningun tipo de dato.
    }
}
