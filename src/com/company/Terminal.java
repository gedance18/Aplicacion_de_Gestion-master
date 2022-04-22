package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    Controlador controlador = new Controlador();
    Scanner scanner = new Scanner(System.in);
    public int menu(){

        while(true) {
            System.out.println("1. Crear Traceur");
            System.out.println("2. Crear GrupoParkour");
            System.out.println("3. Eliminar Traceur");
            System.out.println("4. Eliminar GrupoParkour");
            System.out.println("5. Visualizar Traceur");
            System.out.println("6. Visualizar GrupoParkour");
            System.out.println("7. Salir al Escritorio");
            int respuesta = scanner.nextInt();
            if (respuesta == 1){
                MenuCrearTraceur();
            }
            else if (respuesta == 2){
                MenuCrearGrupoParkour();
            }

            return respuesta;
        }

    }
    public void MenuCrearGrupoParkour(){
        System.out.println("Grupo de Parkour");
        System.out.print("ID: ");
        int ID = scanner.nextInt();
        System.out.println("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Traceur a elegir: ");
        int numero_traceur = scanner.nextInt();
        System.out.println("Has elegido a: ");

        controlador.CrearGrupoParkour();

        System.out.println();

    }

    public void MenuCrearTraceur(){
        System.out.println("Traceur:");
        System.out.print("ID:");
        int ID = scanner.nextInt();
        System.out.println();
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Experiencia: ");
        int experiencia = scanner.nextInt();

        controlador.CrearTraceur(ID, nombre, edad, altura, experiencia);

    }

    public void MenuEliminarTraceur(){

    }

    public void MenuEliminarGrupoParkour(){

    }

    public void MenuVisualizarTraceur(){

    }

    public void MenuVisualizarGrupoParkour(){

    }

    public void MenuModificarTraceur(){

    }

    public void MenuModificarGrupoParkour(){

    }

}
