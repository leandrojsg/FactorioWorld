package com.lunlucky.FactorioWorld;

public class Item {
    private String nombre ;
    private int cantidad ;

    public Item(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;

    }

    public Item() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void contador (){
        System.out.println("la cantidad de: "+this.getNombre()+" es: "+cantidad);
    }
}