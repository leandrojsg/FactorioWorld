package com.lunlucky.FactorioWorld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int opcion = 0;
        String fabrica = "Sin Nombre";
        Item hierro = new Item("hierro", 0);
        Item carbon = new Item("carbon", 0);
        Item acero = new Item("acero", 0);
        Personaje personaje = new Personaje("luis", hierro, carbon, acero);

        while (opcion != 999) {
            Scanner entradaUsuario = new Scanner(System.in);

            Thread.sleep(2000);
            System.out.println("Bienvenido a esta fabrica llamada :" + fabrica);
            String mensaje = """
                    opcion 1: Cambiar el nombre a la fabrica?
                    opcion 2: Intruduce minerales
                    opcion 3: Mostrar minerales actuales
                    opcion 4: Fundir el acero
                    opcion 5: picar hierro
                    opcion 999: cerrar el programa
                    """;
            System.out.println("\n");
            System.out.println(mensaje);
            opcion = entradaUsuario.nextInt();

            if (opcion == 1) {
                System.out.println("Bienvenido, ¿que nombre le desea poner a la fabrica? ");
                Scanner scannerfabrica = new Scanner(System.in);
                fabrica = scannerfabrica.nextLine();
                System.out.println("\n");
            }

            if (opcion == 2) {
                System.out.println("¿cuantos minerales tenemos de cada mineral?");
                Scanner cuentaminerales = new Scanner(System.in);
                System.out.println("¿cuanto estas hierro introduciendo ?");
                hierro.setCantidad(cuentaminerales.nextInt());
                System.out.println("¿cuanto estas carbon introduciendo?");
                carbon.setCantidad(cuentaminerales.nextInt());
                System.out.println("\n");
            }
            if (opcion == 3) {
                hierro.contador();
                carbon.contador();
                acero.contador();
                System.out.println("\n");
            }
            if (opcion == 4) {
                String resultadoUsuario;
                Scanner scannerfundir = new Scanner(System.in);
                System.out.println("""
                        ¿Quieres fundir el acero?
                         si/no""");
                resultadoUsuario = scannerfundir.nextLine();
                if (resultadoUsuario.equals("si")) {
                    acero.setCantidad(hierro.getCantidad() + carbon.getCantidad());
                    hierro.setCantidad(0);
                    carbon.setCantidad(0);
                    System.out.println("\nel total de acero es :" + acero.getCantidad() + "\n");
                } else {
                    System.out.println("\nNo se fundira el acero\n");
                }

            }
            if (opcion == 5) {
                picarhierro(personaje);

            }
            if (opcion == 999) {
                System.out.println("Adios capitan!");
                return;
            }
        }
    }

    public static void picarhierro(Personaje personaje) {
        int sumatorio = (int) (Math.random() * 60);
        personaje.getSlot1().setCantidad(personaje.getSlot1().getCantidad() + sumatorio);
        System.out.println("\nHas picado:" + sumatorio + "\nY ahora tienes :" +
                personaje.getSlot1().getCantidad() + "\n");
    }
}