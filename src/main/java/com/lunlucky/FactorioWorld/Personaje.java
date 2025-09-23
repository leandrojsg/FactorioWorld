package com.lunlucky.FactorioWorld;

public class Personaje {
    private String nombre ;
    private int vida = 200;
    private int potencia = 20;
    private int movimiento = 50;
    private Item slot1;
    private Item slot2;
    private Item slot3;

    public Personaje(String nombre, Item slot1, Item slot2, Item slot3) {
        this.nombre = nombre;
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public Item getSlot1() {
        return slot1;
    }

    public void setSlot1(Item slot1) {
        this.slot1 = slot1;
    }

    public Item getSlot2() {
        return slot2;
    }

    public void setSlot2(Item slot2) {
        this.slot2 = slot2;
    }

    public Item getSlot3() {
        return slot3;
    }

    public void setSlot3(Item slot3) {
        this.slot3 = slot3;
    }

}

