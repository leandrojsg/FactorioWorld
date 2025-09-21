package com.lunlucky.FactorioWorld;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        String fabrica = "Sin Nombre";
        int hierro = 0;
        int carbon = 0;
        int acero = 0;


        while (opcion != 999) {
            Scanner entradaUsuario = new Scanner(System.in);

            System.out.println("Bienvenido a esta fabrica llamada :" + fabrica);
            String mensaje = "opcion 1: Cambiar el nombre a la fabrica? \n" +
                    "opcion 2: Intruduce minerales \n" +
                    "opcion 3: Mostrar minerales actuales \n" +
                    "opcion 4: Fundir el acero \n" +
                    "opcion 999: cerrar el programa \n";
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
                hierro = cuentaminerales.nextInt();
                System.out.println("¿cuanto estas carbon introduciendo?");
                carbon = cuentaminerales.nextInt();
                System.out.println("\n");
            }
            if (opcion == 3) {
                contadorDemiMinerales(hierro, carbon, acero);
                System.out.println("\n");
            }
            if (opcion == 4) {
                String resultadoUsuario ;
                Scanner scannerfundir = new Scanner(System.in);
                System.out.println("\n¿Quieres fundir el acero? \n si/no"+"\n");
                resultadoUsuario = scannerfundir.nextLine();
                if (resultadoUsuario.equals("si")){
                    acero = hierro + carbon;
                    hierro = 0;
                    carbon = 0;
                    System.out.println("\nel total de acero es :" + acero + "\n");
                }
                else {
                    System.out.println("\nNo se fundira el acero\n");
                }
            }
            if (opcion == 999) {
                System.out.println("Adios capitan!");
                return;
            }
        }
    }

    public static void contadorDemiMinerales(int hierro, int carbon, int acero) {

        System.out.println(
                MessageFormat.format(
                        "hierro:{0}" +
                                "\ncarbon:{1}" +
                                "\nacero:{2}" +
                                "\n"

                        , hierro, carbon, acero)
        );
    }
}