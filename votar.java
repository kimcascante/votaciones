package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Determinar si un ciudadano puede votar. Un ciudadano puede votar si ya cuenta con 18
años cumplidos. El programa recibe la edad del ciudadano.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej2w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 

        int edadCiudadano;
        String vota;

        escribir.println("Digite la edad del ciudadano:");
        edadCiudadano = Integer.parseInt(leer.readLine());

        if (edadCiudadano >= 18){
            vota = "Si vota";
        } else {
            vota = "El ciudadano no puede votar";
        }

        escribir.println(vota);

    }
}